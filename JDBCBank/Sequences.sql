--2.1
/*
select * from "Employee";
*/
create sequence emp_id_seq
start 9;

create or replace function emp_insert()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
	new."EmployeeId" = (select nextval('emp_id_seq'));
	end if;
	return new;
end;
$$ language plpgsql;

insert into "Employee"("EmployeeId","FirstName","LastName")
values(-43,'matt','k');
/*
create trigger employee_insert
before insert on "Employee"
for each row
execute function emp_insert();
*/

--select * from "Employee" where "FirstName" = 'King';

--select * from "Employee" where "FirstName" = 'Andrew' and "ReportsTo" = null;

--2.2
--select * from "Album" order by "Title" desc;

--select "FirstName" from "Customer" order by "City" asc;

--2.3

--insert into "Genre" values(26, 'KPop'),
--						(27, 'Steam Punk');


--insert into "Employee" values(9, 'Eric', 'Johnson', 'Evil Research'),
--							(10, 'Max', 'Madden', 'Database Administrator'),
--							(11, 'James', 'Wembly', 'Research Assistant'),
--							(12, 'Rex', 'Dezly', 'First Aid Nurse'),
--							(13, 'Betty', 'Tomoe', 'Chef');

--insert into "Customer" values (60, 'Gus', 'Alpha', 'General Electric'),
--								(61, 'Barbera', 'Dee', 'Big Box Mart');

--update "Artist"
--set "Name" = 'CCR'
--where "Name" = 'Creedence Clearwater Revival';

