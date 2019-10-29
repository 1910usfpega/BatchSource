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