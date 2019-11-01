create table users (
	user_id integer primary key,
	user_uname varchar(20),
	user_password varchar(20),
	user_first_name varchar(25),
	user_last_name varchar(25),
	unique(user_uname)

	);

create table accounts (
	bank_account_id integer primary key,
	account_uname varchar(20),
	account_type varchar(30),
	account_balance numeric(10,2)
);

DELETE FROM users WHERE user_id=17;

--Sequence
CREATE SEQUENCE  accountSequence
 increment 1
 start 11
 minvalue 11
 maxvalue 1000;

CREATE SEQUENCE  userSequence
 increment 1
 start 11
 minvalue 11
 maxvalue 1000;

--created relationships to enable usage of tables
alter table accounts
add constraint fk_user_uname
foreign key (account_uname) references users(user_uname)
on delete cascade;


INSERT into users(user_id, user_uname, user_password, user_first_name, user_last_name)
values (nextval ('userSequence'), 'test', '1234', 'test','test');

INSERT into accounts(bank_account_id, account_uname, account_type, account_balance)
values (nextval ('accountSequence'), 'test', 'checking', 1000);

INSERT into user_type (usr_type, description)
values (default, 'customer');

select * from user_type

--this function returns the People table's values
CREATE or Replace function get_all_users()
	returns Table (
		user_ID integer primary key,
		user_uname varchar,
		user_full_name varchar,
		user_date_of_birth date,
		user_email varchar,
		user_address varchar,
		user_phone_number varchar
	)
	AS $$
	Begin
		Return Query select * From people;
	End; $$
	Language 'plpgsql';

select get_all_users()


---triggerfunction
create or replace function user_insert()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
	new.user_ID = (select nextval('user_account_ID_sequence'));
	end if;
	return new;
end;
$$ language plpgsql;

create trigger user_insert
before insert on people
for each row
execute function user_insert();


--ACCOUNT INSERT
create or replace function account_insert()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
	new.bank_account_ID = (select nextval('bank_account_ID_sequence'));
	end if;
	return new;
end;
$$ language plpgsql;

create trigger account_insert
before insert on account
for each row
execute function account_insert();


drop table if exists users cascade;
