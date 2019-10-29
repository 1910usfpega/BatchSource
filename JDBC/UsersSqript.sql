create table users(
users_username varchar(30) primary key,
users_fname varchar(30),
users_lname varchar(30),
users_pword varchar(30),
users_usertype_id integer,
user_id integer

);

insert into users_usertype_id values (1,'customer');

insert into users_usertype_id values
(2,'employee'),
(3,'admin');



insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id,user_id) values ('ehard','Eddie', 'Hardy','123','1',1);
insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id,user_id) values ('rhar', 'Harris', 'Ryan','456','1',2);

insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id,user_id) values ( 'bwil','Brian', 'Wilson','789','1',3);
insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id,user_id) values ('kans', 'Ansley', 'Kyle','123','1',4);
insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id,user_id) values('mwill', 'Williams', 'Mary','456','1',5);


insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id,user_id) values ('dmcgi', 'Mcgill', 'Daniel','123','2',6);
insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id,user_id) values ('larg', 'Argo', 'Larry','456','2',7);
insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id,user_id) values ('stef', 'Frith', 'Steve','789','2',8);
insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id,user_id) values ('maol', 'Oliver', 'Mario','123','2',9);


insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id,user_id) values ('amart', 'Martinez', 'Andy','456','3',10);
insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id,user_id) values ('mkni', 'Knighton', 'Matt','789','3',11);
insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id,user_id) values ('dcole', 'Coleman', 'Devin','123','3',12);
insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id,user_id) values('dmars', 'Marshall', 'Derron','456','3',13);


select* from users;


create sequence usersseq
start with 13;
select setval ('usersseq',13);

create sequence accountsseq
start with 5;
select setval ('accountsseq',5);


 
select nextval('usersseq');

select*from users;

delete from users where users_username = 'bean'
delete from users where users_username = 'kbya'
delete from users where users_username = 'mamba'


drop table users
insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id) values ('kans', 'Kyle', 'Ansley','123','1',);
insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id) values('mwill', 'Mary', 'Williams','456','1');


insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id) values ('dmcgi', 'Daniel', 'Mcgill','123','2');
insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id) values ('larg', 'Larry', 'Argo','456','2');
insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id) values ('Steve', 'Steve', 'Frith','789','2');
insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id) values ('Mario', 'Mario', 'Oliver','123','2');


insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id) values ('amart', 'Andy', 'Martinez','456','3');
insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id) values ('matk', 'Matt', 'Knighton','789','3');
insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id) values ('dcole', 'Devin', 'Coleman','123','3');
insert into "users"(users_username,users_fname,users_lname,users_pword,users_usertype_id) values('dmarsh', 'Derron', 'Marshall','456','3');


