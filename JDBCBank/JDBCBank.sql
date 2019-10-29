create sequence person_id_seq
start 2;

create or replace function person_insert()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
	new."Person_ID" = (select nextval('person_id_seq'));
	end if;
	return new;
end;
$$ language plpgsql;

create table Person(
	PERSON_ID int primary key not null default nextval('person_id_seq'),
	first_name varchar(20),
	last_name varchar(20),
	username varchar(20),
	password varchar(20)
);



create sequence bank_id_seq
start 2;

create or replace function bank_insert()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
	new."BANK_ACCOUNT_ID" = (select nextval('bank_id_seq'));
	end if;
	return new;
end;
$$ language plpgsql;


create table BankAccount(
	BANK_ACCOUNT_ID int primary key not null default nextval('bank_id_seq'),
	owner_first varchar(20),
	owner_last varchar(20),
	balance float,
	owner_id int
);


alter table bankaccount
add column BANK_ACCOUNT_ID int primary key 


--add constraints
alter table BankAccount
add constraint fk_Owner
foreign key(owner_id) references Person(PERSON_ID);

insert into Person values(default, 'Stephen', 'McCarter', 'ew', 'bstar');
insert into Person values(default, 'Jim', 'Barkley', 'dee', 'ad[oi');

insert into BankAccount values(default, 'Stephen', 'McCarter', 200);

select * from BankAccount;

select * from Person;