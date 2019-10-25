--Nested Queries- select in a select
select * from "Track" where "AlbumId" in 
(select "AlbumId" from "Track" where "AlbumId" = 4); 

--Joins!-
create table student(
s_id integer,
s_name varchar(20),
sch_id integer
);

create table school(
sch_id integer,
sch_name varchar(20)
);

INSERT INTO SCHOOL VALUES(1,'USF');
INSERT INTO SCHOOL VALUES(2,'FSU');
INSERT INTO SCHOOL VALUES(3,'UA');
INSERT INTO SCHOOL VALUES(4,'UGA');
INSERT INTO SCHOOL VALUES(5,'LSU');
INSERT INTO SCHOOL VALUES(6,'AU');

INSERT INTO STUDENT VALUES(1, 'MATT',3);
INSERT INTO STUDENT VALUES(2, 'BEN',5);
INSERT INTO STUDENT VALUES(3, 'HANN',1);
INSERT INTO STUDENT VALUES(4, 'KEN',5);
INSERT INTO STUDENT VALUES(5, 'JACKSON',4);
INSERT INTO STUDENT VALUES(6, 'JOHN',2);
INSERT INTO STUDENT VALUES(7, 'LEVI',1);
INSERT INTO STUDENT VALUES(8, 'ANDREW',3);
INSERT INTO STUDENT VALUES(9, 'BRAD',2);
INSERT INTO STUDENT VALUES(10, 'REN',5);

--Inner
select * from student inner join 




--outer join-
select * from student join school
on student.sch_id=school.sch_id;


--self join
create table student2(
id integer,
name varchar(20),
lab_partner integer
);

INSERT INTO STUDENT2 VALUES(1, 'MATT',6);
INSERT INTO STUDENT2 VALUES(2, 'BEN',5);
INSERT INTO STUDENT2 VALUES(3, 'REN',4);
INSERT INTO STUDENT2 VALUES(4, 'HANN',3);
INSERT INTO STUDENT2 VALUES(5, 'KEN',2);
INSERT INTO STUDENT2 VALUES(6, 'LEVI',1);

select a.name as student, b.name as lab_partner
from student2 a join student2 b
on a.lab_partner = b.id;

--sequence
create sequence mySeq
increment by -13
start with 1337
minvalue 975 
maxvalue 4000;

select currval('mySeq');

--view
create view my_view
as 
select "Artist"."Name", "Album"."Title"
from "Album" inner join "Artist"
on "Album"."ArtistId" = "Artist"."ArtistId";

select * from my_view;

select * from my_view
where "Name" like 'T%' or "Name" like 'B%';

create sequence stuseq
start with 11;

select nextval('stuseq');

select * from student;

INSERT INTO STUDENT VALUES(1, 'MATT',3);
INSERT INTO STUDENT VALUES(2, 'BEN',5);
INSERT INTO STUDENT VALUES(3, 'HANN',1);
INSERT INTO STUDENT VALUES(4, 'KEN',5);
INSERT INTO STUDENT VALUES(5, 'JACKSON',4);
INSERT INTO STUDENT VALUES(6, 'JOHN',2);
INSERT INTO STUDENT VALUES(7, 'LEVI',1);
INSERT INTO STUDENT VALUES(8, 'ANDREW',3);
INSERT INTO STUDENT VALUES(9, 'BRAD',2);
INSERT INTO STUDENT VALUES(10, 'REN',5);

drop table student;

create table student(
s_id integer,
s_name varchar(20),
sch_id integer
);

INSERT INTO STUDENT VALUES(1, 'MATT',3);
INSERT INTO STUDENT VALUES(2, 'BEN',5);
INSERT INTO STUDENT VALUES(3, 'HANN',1);
INSERT INTO STUDENT VALUES(4, 'KEN',5);
INSERT INTO STUDENT VALUES(5, 'JACKSON',4);
INSERT INTO STUDENT VALUES(6, 'JOHN',2);
INSERT INTO STUDENT VALUES(7, 'LEVI',1);
INSERT INTO STUDENT VALUES(8, 'ANDREW',3);
INSERT INTO STUDENT VALUES(9, 'BRAD',2);
INSERT INTO STUDENT VALUES(10, 'REN',5);

select * from student;