--2.1 SELECT
--Task – Select all records from the Employee table.
SELECT * FROM "Employee";

--Task – Select all records from the Employee table where last name is King.
SELECT * FROM "Employee" WHERE "LastName"='King';

--Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
SELECT * FROM "Employee" WHERE "FirstName"='Andrew' AND "ReportsTo" NULL;


--2.2 ORDER BY
--Task – Select all albums in Album table and sort result set in descending order by title.
SELECT * FROM "Album" ORDER BY "Title" DESC;

--Task – Select first name from Customer and sort result set in ascending order by city
SELECT public."Customer"."FirstName" FROM "Customer" ORDER BY "City" ASC;



--2.3 INSERT INTO
--Task – Insert two new records into Genre table 
INSERT INTO "Genre" VALUES 
	((SELECT max("GenreId")+1 FROM "Genre"), 'BTM1'), 
	((SELECT max("GenreId")+2 FROM "Genre"), 'BTM2');

--Task – Insert two new records into Employee table
INSERT INTO "Employee" ("EmployeeId", "FirstName", "LastName") VALUES 
	((SELECT max("EmployeeId")+1 FROM "Employee"), 'Iskandar', 'Bakhtizin'), 
	((SELECT max("EmployeeId")+1 FROM "Employee"), 'Test', 'Test');


--Task – Insert two new records into Customer table
--INSERT INTO "Customer" ("CustomerId", "FirstName", "LastName", "Email") VALUES 
--	((SELECT max("CustomerId")+1 FROM "Customer"), 'Iskandar', 'Bakhtizin', 'ggg@gmail.com'), 
--	((SELECT max("CustomerId")+1 FROM "Customer"), 'Test', 'Test', 'dfde@gmail.com');

