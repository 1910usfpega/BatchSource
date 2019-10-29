


create sequence custseq
minvalue 0
start with 0;

create sequence acctseq
minvalue 0
start with 0;

create table bank_customers(
user_id integer primary key,
username varchar (40) not null,
password varchar(40) not null
);

create table bank_accounts(
account_id integer primary key,
username varchar(40) not null,
account_number integer not null,
account_type varchar(8) not null,
balance numeric(10,2) default 0.00
);

create table bank_applications(
account_id integer primary key,
username varchar(40) not null,
account_number integer not null,
account_type varchar(8) not null
);

create table bank_employees(
user_id integer primary key,
username varchar (40) not null,
password varchar(40) not null,
admin boolean default FALSE
);


CREATE or replace FUNCTION delete_account(in int) returns void
    AS $$ delete from bank_accounts where account_number = $1  $$
    LANGUAGE SQL;



--bonus:

create sequence histseq
minvalue 0
start with 0;

create table trans_history(
id integer primary key,
username varchar(40),
account integer,
transaction_type varchar(8),
amount numeric(10,2),
new_balance numeric(10,2)
);




insert into bank_employees values (nextval(emp_id_seq),'Bob','111');
insert into bank_employees values (nextval(emp_id_seq),'GregSmith','1234');
insert into bank_employees values (nextval(emp_id_seq),'SamuelFulton','4321');





