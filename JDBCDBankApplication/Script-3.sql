create table bankAccount(
	customer_id integer primary key,
	first varchar(20),
	last varchar(20),
	username varchar (20),
	password varchar (20),
	balance integer default 0,	
	accountNumber integer
);

create sequence custSeq
increment by 1
start with 3

create sequence accSeq
increment by 1
start with 100006


create table bankEmployee(
	employee_id integer primary key,
	employee_username varchar(20),
	employee_password varchar(20)
)

insert into bankEmployee values(1, 'zeus','password');
insert into bankEmployee values(2, 'oden','password');

create table bankAdmin(
	admin_id integer,
	admin_username varchar (20),
	admin_password varchar (20)
)

insert into bankAdmin values(1, 'boss', 'man')


create table transactionHist(
	transaction_id integer, 
	employee_id integer,
	employee_action varchar(20),
	employee_amount integer	
)


