--Set search path to this schema
--show search_path;
--set search_path to "MakinBank";

--account_num Sequence
create sequence if not exists accnums
as int
increment by 164
minvalue 1054965643
maxvalue 1918476307
start with 1054965643
cycle;

alter sequence accnums owned by bankaccount.account_num;

alter sequence accnums owned by none;
drop sequence accnums;

--customer_id increment sequence
create sequence if not exists cus_pk
as int
increment by 1
minvalue 0
start with 0;

alter sequence cus_pk owned by customer.customer_id;

alter sequence cus_pk owned by none;
drop sequence cus_pk;


--drop table "MakinBank".customer cascade

--customer table creation
create table customer(
	customer_id integer primary key default nextVal('cus_pk'),
	customer_user varchar(10) unique,
	customer_pw varchar(15),
	customer_fName text,
	customer_lName text
);

--drop table "MakinBank".bankaccount cascade;

--bankaccount table creation
create table bankaccount(
	account_num int primary key default nextVal('accnums'),
	balance numeric(10,2) default 0.00,
	customer_user varchar(10)
);


--drop table "MakinBank".Customer_Account cascade;

/*create table Customer_Account(
	account_num serial,
	customer_id integer,
	primary key(account_num, customer_id)
);*/

--Add key constraints
alter table bankaccount
add constraint fk_BankAccount_Customer
foreign key(customer_user) references Customer(customer_user);

--Was going to create new user for each customer, but supposedly out of the scope of my capabilities with AWS

/*revoke all on "MakinBank".bankaccount from user_customer;
revoke all on "MakinBank".customer from user_customer;
drop role user_customer;
--Create role for all customers
create role user_customer inherit;
alter role user_customer nocreatedb nocreaterole noinherit login;*/

/*create user SamNort;
grant user_customer to SamNort;
drop user SamNort;*/

/*--Grant permissions for all customers on both tables
grant select on table "MakinBank".bankaccount to user_customer;
grant select on table "MakinBank".bankaccount to user_customer;
grant select on table "MakinBank".bankaccount to user_customer;
grant select on table "MakinBank".bankaccount to user_customer;
grant select on table "MakinBank".customer to user_customer;
grant select on table "MakinBank".customer to user_customer;
grant select on table "MakinBank".customer to user_customer;
grant select on table "MakinBank".customer to user_customer;*/


--drop function createcustomer;

--Function to create new customer
create or replace function createcustomer(in text, in text, in text, in text)
returns void as $$
begin
insert into "MakinBank".customer values(default, $1, $2, $3, $4);	
end;
$$ language plpgsql;

delete from "MakinBank".customer;
select createcustomer('SamNort', 'sammy123', 'Samuel', 'Norton');
select createcustomer('MikeyG', 'Michael6', 'Michael', 'Granton');

--Function to create account
create or replace function createaccount(in text)
returns void as $$
begin
	insert into "MakinBank".bankaccount values (default, 0, $1);
end;
$$ language plpgsql;

delete from "MakinBank".bankaccount;
select createaccount('SamNort');
select createaccount('MikeyG');


--Function to delete account
create or replace function deleteaccount(in int)
returns void as $$
begin
	delete from "MakinBank".bankaccount where bankaccount.account_num = $1;
end;
$$ language plpgsql;


--Function to update account balance
drop function updatebalance(int, numeric(10,2));
create or replace function updatebalance(in int, in int)
returns void as $$
begin
	update "MakinBank".bankaccount 
	set balance = $2
	where account_num = $1;
end;
$$ language plpgsql;