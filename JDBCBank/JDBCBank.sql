
create table users(
users_id integer primary key,
users_first_name varchar(60),
users_last_name varchar(60), 
users_name varchar(60) ,
users_password varchar(60),
users_type varchar(60)
);

create table accounts(
accounts_id integer primary key,
account_status varchar(60) DEFAULT 'Pending',
accounts_type varchar(60),
accounts_balance decimal
);

create table users_accounts(
connection_id integer primary key,
users_id integer,
accounts_id integer,
foreign key (users_id) references users(users_id),
foreign key (accounts_id) references accounts(accounts_id)
);


drop table accounts cascade;
drop table users cascade;
drop table users_accounts cascade;


insert into users(users_id,
				users_first_name, 
				users_last_name ,
				users_name ,
				users_password,
				users_type 
				)values( 1,'John','Doe','Admin', 'Admin', 'Admin');

insert into users(users_id,
				users_first_name, 
				users_last_name ,
				users_name ,
				users_password,
				users_type) 
			    values (2,'Anthony','Dwane','Client1','Client1','Client');
			   
insert into accounts (accounts_id,
					  account_status,
					  accounts_type,
					  accounts_balance
)values (1000,default,'Checking', 100.00);

select * from users;

--update the column balance where user_id = something.
--delete this account_id


Create Procedure account_id_insert
    (@accounts_id int, @account_status Varchar(30), @accounts_type Varchar(30), @accounts_balance int)
As
Begin
    Insert Into account_id_insert
    Values (@accounts_id int, @account_status Varchar(30), @accounts_type Varchar(30), @accounts_balance int)
End
