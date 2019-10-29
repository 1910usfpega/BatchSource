--creating table structure for project 1

create table Accounts(
accountID integer primary key,
checkingAccount boolean,
savingsAccount boolean,
checkBalance numeric,
saveBalance numeric
);

create table Users(
userID integer primary key,
userName varchar,
password varchar,
name varchar,
userType integer
);
--not sure if i want to use below table
/*create table users_accounts(
userID integer,
accountID integer,
primary key(userID,accountID)
);
*/
create table userType(
userTypeID integer primary key,
userTypeName varchar
);

commit;
--constraints

/*alter table users_accounts
add constraint fk_users_accounts_users
foreign key (userID) references users(userID);

alter table users_accounts
add constraint fk_users_accounts_accounts
foreign key (accountID) references accounts(accountID);
*/

alter table users
add constraint fk_users_usertype
foreign key (usertype) references usertype(usertypeid);



--inserting default admin user
insert into accounts values
(1,true,true,100.00,250.00);
update accounts
set checkbalance = 
()

/*insert into users_accounts values
(1,1);
*/
insert into usertype values 
(1,'customer'),(2,'admin');


insert into users values 
(1,'mpeek7','Cronaldo7','Miles Peek',2);


select accountid,checkbalance,savebalance from accounts;

--granting admin access ?
grant select, insert, delete, execute 
on table users
to usertype=2;
 
-- creating sequence for userID and accountID
create sequence newuserseq
  start with 1;
 
 select nextval('newuserseq');

create sequence newaccountseq
start with 1;

select nextval('newaccountseq');

create sequence accountseq
start with 2;

select nextval('accountseq');

select * from project.users where userid =1;
commit;
