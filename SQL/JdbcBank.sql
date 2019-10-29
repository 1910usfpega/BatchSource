--Single comment
/*Multline
 * Comment
 * Woo!
*/

drop table people

create table people (
	user_ID integer primary key,
	user_uname varchar (20),
	/*what data type should I use for PASSWORD */
	user_full_name varchar(25),
	user_date_of_birth date,
	user_email varchar(50),
	user_address varchar(100),
	user_phone_number varchar(12)
	);

create table account (
	bank_account_ID integer primary key,
	account_full_name varchar(20),
	account_type boolean,
	account_balance numeric
);

CREATE TABLE login (
	user_name varchar(20)primary key,
	user_password integer
);


create table people_account (
	user_ID integer,
	--∆ here
	bank_account_ID integer,
	primary key (user_ID, bank_account_ID)
);

----------1st



---------2nd-------
--created relationships to enable usage of tables
alter table people_account
add constraint fk_user_ID
foreign key (user_id) references people(user_id)
on update cascade
on delete cascade;

alter table people_account
add constraint fk_bank_account_id
foreign key (bank_account_id) references account(bank_account_id)
on update cascade
on delete cascade;


alter table people
add constraint fk_user_uname
foreign key (user_uname) references login(user_name)
on update cascade
on delete cascade;

---Sequences default
alter table people_account alter column bank_account_ID
--a function
set default nextVal('bank_account_ID_sequence');

alter table people_account alter column user_id
--a function
set default nextVal('user_ID_sequence');

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
	--a way to view everything in the account
		Return Query select * From people;
	End; $$
	Language 'plpgsql';

	--call it like a table
select get_all_users()

--∆∆1st adding a column for table people
--to specify different users customer/admin
alter table people
add column usr_type integer;

--∆∆2nd creating a new table to be referenced by
--people.user_type //////kinda like this.field in java
CREATE table user_type (
	usr_type integer primary key,
	description varchar(30)
);



--Sequence
CREATE SEQUENCE bank_account_ID_sequence
START WITH 1,
--default is increment by one
INCREMENT BY 1
owned by people_account.bank_account_ID;

create SEQUENCE user_account_ID_sequence
	START with 1
	owned by people_account.user_ID;


--∆∆3rd adding a constraint to the table people of column user_type
--to give the column a fkey
alter table People
add constraint fk_usr_type
foreign key (usr_type) references user_type(usr_type);




--∆∆4th creating a sequence for the description
--specify the role
create sequence user_type_sequence
	start with 1
	owned by user_type.usr_type;

	alter table user_type
	alter column usr_type
	set default nextVal('user_type_sequence');

INSERT into user_type (usr_type, description)
values (default, 'admin');

INSERT into user_type (usr_type, description)
values (default, 'customer');
