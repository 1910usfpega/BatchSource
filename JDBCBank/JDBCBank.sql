create table look_up(
look_up_id integer primary key,
account_status varchar(60),
foreign key (account_status) references accounts(account_status)
);


create table users(
users_first_name varchar(60) primary key,
users_last_name varchar(60), 
users_name varchar(60) ,
users_password varchar(60),
users_type varchar(60)
);

create table accounts(
account_status varchar(60) primary key,
accounts_id integer,
users_first_name varchar(60),
users_last_name varchar(60),
accounts_type varchar(60),
accounts_type_number integer,
accounts_type_balance decimal,
foreign key (users_first_name)  references users(users_first_name)
);

drop table accounts;
drop table users;

insert into users(users_id,users_name,users_passwrod,users_first_name,users_last_name)values('John','Doe','Administrator','password');
insert into users(users_id,users_name,users_passwrod,users_first_name,users_last_name) values ('Anthony','Dwane',,'Client1','password1');
insert into accounts (accounts_id,users_first_name,admins_first_name,accounts_type,accounts_type_number,accounts_type_balance)values (001, 001 , 100, 'Sam', 100, 100-001, 100.00);

