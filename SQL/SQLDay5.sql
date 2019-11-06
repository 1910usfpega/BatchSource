--Functions
/*out parameter define coulumn names and types
 * in parameters are used by function can can be referenced by $[index number]
 * $$ acts as a delimiter to separate logic
 * LANGUAGE specifys logic language
 */

CREATE or replace FUNCTION dup(out f1 int, out f2 text,in int)
    AS $$ SELECT $1, CAST($1 AS text) || ' is text' $$
    LANGUAGE SQL;

SELECT * FROM dup(42);

CREATE or replace FUNCTION dup2(out f1 text, out f2 int,in int, in text)
    AS $$ SELECT $2,$1;$$
    LANGUAGE SQL;
    
   SELECT * FROM dup2(42,'roll tide');
   
   CREATE or replace FUNCTION dup3(out f1 text, out f2 int,in int, in text)
    AS $$ SELECT $2,$1;
    select $2 ||'woo', $1+1;$$
    LANGUAGE SQL;
   
   SELECT * FROM dup3(42,'roll tide');
   
  CREATE TYPE dup4_result AS (f1 text, f2 int);
  
     CREATE or replace FUNCTION dup4(in int, in text)
    returns dup4_result 
   AS $$ SELECT $2,$1;
    select $2 ||'woo', $1+1;$$
    LANGUAGE SQL;
   
    SELECT * FROM dup4(42,'roll tide');
    
   create or replace function employeeCount()
   returns integer as $$
   declare
   				total integer;
begin
	select count("EmployeeId") into total from "Employee";
		return total;
end;
$$ language plpgsql;

select employeeCount();
--Triggers
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

create trigger employee_insert
before insert on "Employee"
for each row
execute function emp_insert();






