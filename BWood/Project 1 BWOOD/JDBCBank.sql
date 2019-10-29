/*
 * JDBC Bank database
 */

--table for users
create table user_table(
user_Id integer primary key,
user_Name varchar(15),
legal_name varchar(50),
address varchar(100),
email varchar(30),
contact_num varchar(15)
);

--table for accounts
create table account_table(
account_Id integer primary key,
checking boolean,
balance numeric,
user_id integer,
approved boolean
);



--add a login table
create table registered_user(
user_Name varchar(15) primary key,
password bigint
);

--add table for roles
create table roles(
user_role integer primary key,
my_role varchar(10)
);


--reference roles table
alter table user_table
add constraint fk_user_role
foreign key (user_role)
references roles(user_role) 
ON UPDATE CASCADE ON DELETE CASCADE;

--add in the reference to registered users
alter table user_table
add constraint fk_user
foreign key (user_name)
references registered_user(user_Name) 
ON UPDATE CASCADE ON DELETE CASCADE;


--add values to roles table
insert into roles values (0,'user');
insert into roles values (1, 'admin');


--constraints for account table

alter table account_table
add constraint fk_user_id
foreign key (user_Id)
references user_table(user_Id)
on delete cascade on update cascade;

--constraints for user table
alter table user_table 
add constraint fk_user_name
foreign key (user_name)
references registered_user(user_name)
on delete cascade on update cascade;


/*
select * from users right join roles 
on users.uname=roles.uname;
*/

--sequence for account id's *is running already
create sequence my_bank_seq
	increment by -7
	start with 10101101
	minvalue 9000
	maxvalue 91010011;

--sequence for user id's *is running already
CREATE SEQUENCE myseq
	increment by -13
	START with 13337
	MINVALUE 975
	MAXVALUE 101010;

--return set for login
CREATE TYPE login_result AS (id int,uname text, myrole int);

--return user id and username upon successful login
CREATE function bank_login(text ,int) RETURNS login_result
    AS $$ 
SELECT user_id , user_name, user_role
from user_table 
where user_table.user_name= (
		select user_name 
		from registered_user 
		where registered_user.user_name= $1 
		and 
		registered_user.password=$2
); $$
    LANGUAGE SQL;

SELECT * FROM bank_login('test',42);



--add generated user id upon insert
create or replace function user_insert()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
	new.user_id = (select nextval('myseq'));
	end if;
	return new;
end;
$$ language plpgsql;

--trigger for inserting into the user table
create trigger user_insert
before insert on user_table
for each row
execute function user_insert();

--add generated account id upon insert
create or replace function account_insert()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
	new.account_id = (select nextval('my_bank_seq'));
	end if;
	return new;
end;
$$ language plpgsql;

--trigger for inserting into the user table
create trigger account_insert
before insert on account_table
for each row
execute function account_insert();


insert into account_table(account_id,checking,balance,user_id,approved) values(0,true,100,13285,true);



/*
 * testing certain functionality
select nextval('my_bank_seq');

select nextval('myseq');

select currval('myseq');


insert into registered_user(EmployeeId,FirstName,LastName)
values(-43,'matt','k');




delete from registered_user where user_name='test';
insert into registered_user values('test' , 123);

*/

delete from registered_user where user_name='johnd';
