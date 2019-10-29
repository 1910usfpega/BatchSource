
create table users(
user_id integer,
username varchar(30) primary key,
user_password varchar(50),
first_name varchar(30),
last_name varchar(30)
);

create table accounts(
acct_number integer primary key,
acct_id varchar(30),
balance numeric(10,2),
acct_type varchar(20)
);

create table user_accounts(
username varchar(30),
acct_number integer primary key
);

alter table accounts
add constraint acct_owner_username
foreign key(acct_id) references users(username)
on delete cascade;

alter table user_accounts
add constraint accounts_user_owner
foreign key(username) references users(username)
on delete cascade;


--Sequence for accts ids
create sequence acctSeq
increment by 1
start with 111
minvalue 111
maxvalue 10000;

--Sequence for user ids
create sequence userSeq
increment by 1
start with 111
minvalue 111
maxvalue 10000;


insert into users(user_id, username, user_password, first_name, last_name)
values (nextval ('userSeq'), 'user', '1234', 'andy','martinez');

 --insert user
 CREATE or replace function user_insert()
 returns trigger as $$
 begin 
	if (TG_OP = 'INSERT') then
	new.user_id = (select nextval('userSeq'));
end if;
return new;
 end;
$$ 
language plpgsql;

create trigger user_insert
before insert on users
for each row 
execute function user_insert();

--drop table if exists users cascade;
--drop table if exists accounts cascade;
--drop table if exists user_accounts cascade;


