insert into "InformationTable" values(1,'MrRevature', '********', 'Mr Revature');
insert into "InformationTable" values(2,'benright313', '********', 'Benjamin Enright');
insert into "InformationTable" values(3,'example', 'example', 'Example Example');
insert into "InformationTable" values(4,'username', 'password', 'First Last');

create sequence idSequence
start with 5;

select nextval ('stuseq');
select * from student;

insert into "AccountTable" values(1,0,1,1000000.00);
insert into "AccountTable" values(1,1,1,10000000.00);
insert into "AccountTable" values(2,0,1,100.00);
insert into "AccountTable" values(2,1,1,1000.00);