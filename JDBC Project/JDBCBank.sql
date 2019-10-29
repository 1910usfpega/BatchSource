drop table customer;


create table users( 
	customer_id integer primary key,
	customer_username varchar,
	customer_password varchar,
	customer_balance money
	);
	
drop table admin;

create table admin( 
	admin_id integer primary key,
	admin_username varchar,
	customer_password varchar
	);
	
insert into users values (001, 'kansley1', 'revature', 500);
insert into admin values (001, 'admin1', 'revature123');
commit;

drop table users;

create table users( 
	customer_id integer primary key,
	customer_username varchar(45),
	customer_password varchar(45)
	);

create table accounts( 
	account_id integer primary key,
	bank_account_id integer,
	username varchar(45),
	balance numeric(10,2) default 0.00
	);

create sequence nextuser
minvalue 0
start with 0;

create sequence nextaccount
minvalue 0
start with 0;
	
