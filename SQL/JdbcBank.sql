--Single comment
/*Multline
 * Comment
 * Woo!
*/

create table user (
	user_uname integer primary key,
	/*what data type should I use for PASSWORD */
	user_password bigint,
	user_full_name varchar(25),
	user_date_of_birth date,
	user_email varchar(50),
	user_address varchar(100),
	user_phone_number varchar(12)
	account_acc_id integer foreign key,
);

CREATE table user_role (
	user_type_uname integer primary key,
	user_password bigint,
	user_email varchar(50),
	account_role_user_id_fkey boolean
);

CREATE TABLE user_info (
	user_name integer primary KEY
	user_email varchar(50),
	user_address varchar(100),
	user_full_name varchar(25),
	user_phone_number varchar(12)
);

create table account (
	account_acc_id integer primary key,
	account_balance varchar(100),
	account_full_name varchar(30),
	account_type boolean,
	account_balance numeric
);

CREATE TABLE log in (
	user_name integer foreign KEY,
	user_password bigint
);

create table user_account (
	account_acc_id integer,
	user_id foreign KEY
);

create table transaction_type (
	transaction_type_withdraw numeric,
	transaction_type_desposit numeric,
	transaction_type_transfer numeric
);

CREATE TABLE account_role(
  user_id integer NOT NULL,
  role_id integer NOT NULL,
  grant_date timestamp without time zone,
  PRIMARY KEY (user_uname, role_id),
  CONSTRAINT account_role_role_id_fkey FOREIGN KEY (role_id)
      REFERENCES role (role_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT account_role_user_id_fkey FOREIGN KEY (user_id)
      REFERENCES account (user_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
