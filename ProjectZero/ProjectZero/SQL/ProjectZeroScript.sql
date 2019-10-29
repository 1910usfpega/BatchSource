--Sequences
create sequence id_seq
increment by 1
start with 1
maxvalue 999999999
minvalue 0;

create sequence act_seq
increment by 1
start with 6080430
maxvalue 99999999
minvalue 0;

--Tables
create table person(
user_id integer primary key not null default(nextval('id_seq')),
firstname varchar(20),
lastname varchar(20),
username varchar(20),
pass_word varchar(20),
user_type int
);

create table accounts(
account_id integer primary key not null default(nextval('act_seq')),
balance int,
acct_type varchar(10),
user_id integer
);

create table u_t(
user_type varchar(10) primary key,
user_num int unique
)

--INSERT into tables

insert into person values(default,'mario','battle','un','pw',1);
insert into person values(default, 'eddie', 'hardy', '1','11',1);
insert into person values(default, 'kyle','ansley', '2','22',1);
insert into person values(default, 'andy','martinez','3','33',3);
insert into person values(default, 'ben', 'enright', '4','44',3);

insert into accounts values(default,5000,'checking',10);
insert into accounts values(default,70000,'savings',9);
insert into accounts values(default,6000,'checking',9);

insert into u_t values('admin',1);
insert into u_t values('employee',2);
insert into u_t values('customer', 3);

--ALTERATIONS
alter table person
add constraint fk_user_type
foreign key (user_type) references u_t(user_num);

alter table accounts 
add constraint fk_user_id
foreign key(user_id) references person(user_id);

--MISC. CALLS
truncate accounts;
select * from person where username = '3';
update from accounts set balance =4990 where account_id = 6080436;