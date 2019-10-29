CREATE EXTENSION pgcrypto;

CREATE SEQUENCE IF NOT EXISTS bank_user_user_id_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 2147483647
	START 1
	CACHE 1
	NO CYCLE;

CREATE TABLE IF NOT EXISTS bank_user(
	user_id serial PRIMARY KEY DEFAULT nextval('bank_user_user_id_seq'),
	user_name TEXT NOT NULL UNIQUE,
	user_password TEXT NOT NULL,
	user_firstname TEXT,
	user_lastname TEXT,
	user_type TEXT NOT NULL,
	user_status boolean NOT NULL DEFAULT TRUE
);


INSERT INTO bank_customer (user_name, user_password, user_firstname, user_lastname, user_type) VALUES (
  'iskandar',
  crypt('pass', gen_salt('md5')),
  'Iskandar',
  'Bakhtizin',
  'customer',
);


CREATE SEQUENCE IF NOT EXISTS bank_account_number_seq START 10000;

CREATE TABLE IF NOT EXISTS bank_account(
	account_number int PRIMARY KEY DEFAULT nextval('bank_account_number_seq'),
	account_name TEXT NOT NULL,
	balance double PRECISION NOT NULL DEFAULT 0,
	account_status TEXT NOT NULL DEFAULT 'pending'
);



CREATE TABLE bank_user_bank_account () 
	user_id int REFERENCES bank_user (user_id) ON UPDATE CASCADE ON DELETE CASCADE,
	account_number int REFERENCES bank_account (account_number) ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT bank_user_bank_account_pkey PRIMARY KEY (user_id, account_number)
);



-- Return 0 if we cant withdraw
-- Return amount we withdraw from account if enough money
CREATE OR REPLACE FUNCTION withdraw(account INTEGER, amount double precision)
	RETURNS double precision AS 
$do$
DECLARE
	account_balance double precision := 0;
BEGIN
	SELECT balance INTO account_balance FROM bank_account WHERE account_number=account;
	IF account_balance < amount THEN
		RETURN 0;
	END IF;

	UPDATE bank_account SET balance = balance - amount WHERE account_number=account;
	RETURN amount;
END;
$do$ LANGUAGE plpgsql;



-- Input: username, pass, firstName, lastName
-- Return 0 if user not created
-- Return new ID if user created successfully
CREATE OR REPLACE FUNCTION create_new_user(username VARCHAR, pass VARCHAR, firstName VARCHAR, lastName VARCHAR)
  RETURNS INTEGER AS
$dd$
DECLARE
	new_user_id INTEGER := 0;
	count_of_users INTEGER := 0;
BEGIN
	SELECT count(user_id) INTO count_of_users FROM bank_user WHERE user_name = username;
	IF count_of_users <> 0 THEN
		RETURN 0;
	END IF;

	INSERT INTO bank_user VALUES (DEFAULT, username, crypt(pass, gen_salt('md5')), firstName, lastName, 'customer') RETURNING user_id INTO new_user_id;
	RETURN new_user_id;
END; $dd$
LANGUAGE plpgsql;






