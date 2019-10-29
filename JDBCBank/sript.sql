

CREATE EXTENSION pgcrypto;

CREATE TABLE bank_user(
	user_id serial PRIMARY KEY,
	user_name TEXT NOT NULL UNIQUE,
	user_password TEXT NOT NULL,
	user_firstname TEXT,
	user_lastname TEXT,
	user_type TEXT NOT NULL,
	user_status boolean NOT NULL DEFAULT TRUE
);

DROP TABLE bank_user;

--ALTER TABLE bank_user
--ADD COLUMN user_status boolean NOT NULL DEFAULT TRUE;


INSERT INTO bank_customer (user_name, user_password, user_firstname, user_lastname, user_type) VALUES (
  'iskandar1',
  crypt('pass', gen_salt('md5')),
  'Iskandar',
  'Bakhtizin',
  'customer',
);



SELECT (user_id, user_name, user_type, user_firstname, user_lastname) 
FROM bank_user 
WHERE user_name = 'johndoe@mail.com' 
AND user_password = crypt('johnspassword', user_password);


SELECT * FROM bank_user;





-- CREATE ACCOUNTS TABLE 

CREATE SEQUENCE bank_account_number_seq START 10000;

CREATE TABLE bank_account(
	account_number int PRIMARY KEY DEFAULT nextval('bank_account_number_seq'),
	account_name TEXT NOT NULL,
	balance double PRECISION NOT NULL DEFAULT 0,
	account_status TEXT NOT NULL DEFAULT 'pending'
);

INSERT INTO bank_account(account_name, balance, account_status) VALUES ('Checking', 2000.00, 'active');
INSERT INTO bank_account(account_name, balance, account_status) VALUES ('Saving', 1000000.00, 'active') RETURNING account_number AS id;
INSERT INTO bank_account(account_name) VALUES ('Saving') RETURNING account_number AS id;
INSERT INTO bank_user_bank_account(user_id, account_number) VALUES (2, 10002);


CREATE TABLE bank_user_bank_account () 
	user_id int REFERENCES bank_user (user_id) ON UPDATE CASCADE ON DELETE CASCADE,
	account_number int REFERENCES bank_account (account_number) ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT bank_user_bank_account_pkey PRIMARY KEY (user_id, account_number)
);

DROP TABLE bank_account;


SELECT * FROM bank_account 
INNER JOIN bank_user_bank_account 
ON bank_user_bank_account.account_number=bank_account.account_number
WHERE bank_user_bank_account.user_id=2;

SELECT * FROM bank_account WHERE account_number=10002;

UPDATE bank_account SET account_status='canceled' WHERE account_number=10009;


UPDATE bank_account SET balance = balance + 1 WHERE account_number=10002;



DO $do$
BEGIN
IF EXISTS (SELECT balance FROM bank_account WHERE account_number=10002 AND balance >= 5) THEN
   UPDATE bank_account SET balance = balance - 5 WHERE account_number=10002;
ELSE
	RAISE EXCEPTION 'dddd';
END IF;
END
$do$


INSERT INTO bank_user (user_name, user_password, user_firstname, user_lastname, user_type) VALUES (
  'empl',
  crypt('pass', gen_salt('md5')),
  'Testing',
  'Employee',
  'employee'
);

SELECT count(account_name) FROM bank_account WHERE account_status='pending';
SELECT * FROM bank_account WHERE account_status='pending';

SELECT * FROM bank_account;


SELECT * FROM bank_account 
INNER JOIN bank_user_bank_account 
ON bank_user_bank_account.account_number=bank_account.account_number
WHERE account_status='pending';

SELECT * FROM bank_user_bank_account;


SELECT 
	bank_account.account_number, 
	bank_account.account_name, 
	bank_account.balance,
	bank_account.account_status,
	bank_user.user_id,
	bank_user.user_name,
	bank_user.user_firstname,
	bank_user.user_lastname,
	bank_user.user_type,
	bank_user.user_status 
FROM bank_account 
INNER JOIN bank_user_bank_account 
	ON bank_user_bank_account.account_number=bank_account.account_number
INNER JOIN bank_user 
	ON bank_user.user_id=bank_user_bank_account.user_id
WHERE account_status='pending';


SELECT 
	count(bank_account.account_number) 
FROM bank_account 
INNER JOIN bank_user_bank_account 
	ON bank_user_bank_account.account_number=bank_account.account_number
INNER JOIN bank_user 
	ON bank_user.user_id=bank_user_bank_account.user_id
WHERE account_status='pending';


SELECT * FROM bank_user WHERE user_type='customer';







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

SELECT * FROM create_new_user('Ryan1', 'pass', 'I', 'B'); 

SELECT * FROM bank_user;
