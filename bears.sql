--Single Line comment
/*
*Multiline
*comment woo!
*/

CREATE TABLE bear(
	bear_id integer PRIMARY KEY,
	bear_type_id integer,
	bear_name varchar(100),
	bear_birthdate date,
	bear_weight integer DEFAULT 200,
	cave_id integer
	);
	
CREATE TABLE bear_type(
	bear_type_id integer PRIMARY KEY,
	bear_type_name varchar(100)
);

CREATE TABLE cave(
	cave_id integer PRIMARY KEY,
	cave_name varchar (100),
	max_bears integer DEFAULT 4
);

CREATE TABLE beehive(
	beehive_id integer PRIMARY KEY,
	beehive_weight integer DEFAULT 50
);

CREATE TABLE bear_beehive(
bear_id integer,
beehive_id integer,
PRIMARY key(bear_id,beehive_id)
);

--add constraints

alter table bear
add constraint fk_bear_cave
foreign key(cave_id) references cave(cave_id);

alter table bear
add constraint fk_bear_bear_type
foreign key(bear_type_id) references bear_type(bear_type_id);

alter table bear_beehive
add constraint fx_bear_beehive_bear
foreign key(bear_id)references bear(bear_id);

alter table bear_beehive
add constraint fx_bear_beehive_beehive
foreign key(beehive_id)references beehive(beehive_id);

--check constraints

alter table bear
add constraint ck_bear_weight_positive
check (bear_weight >0);

alter table beehive
add constraint ck_beehive_weight_positive
check (beehive_weight>0);

insert into bear_type values(1,'grizzly');

insert into bear_type values
(2,'polar'),
(3,'panda');

insert into bear values(1,3,'bob','11-NOV-1952',default,null);
insert into bear values(2,2,'pablo','17-dec-1990',800,null);
insert into bear values(3,1,'blob','22-feb-1989',1000,null);
insert into bear values(4,3,'bud','22-feb-1989',300,null);

select * from bear;
select * from bear where bear_type_id=3;

select * from cave;
select * from beehive;

--full query example

select count("EmployeeId"),"City","Country"
from "Employee"
group by "Country","City"
having count("EmployeeId")>1
order by "City" desc;

select "Employee"."FirstName", "Customer"."City" from "Employee", "Customer";

--scalar functions

select concat("FirstName","LastName")from"Employee";

--Aggregate Function

select max("Total") as "Average Price" from "Invoice";

