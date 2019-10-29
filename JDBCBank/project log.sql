
select nextval(acctseq);

create sequence acctseq
start with 01;

select * from p		0_users

create sequence bankseq
start with 01;

select * from p0_accounts

select nextval(bankseq);

delete from p0_users (
);

ALTER TABLE public.p0_users DROP COLUMN "user";
ALTER TABLE public.p0_users DROP COLUMN pw;
ALTER TABLE public.p0_users DROP COLUMN "name";
ALTER TABLE public.p0_users DROP COLUMN atype;
ALTER TABLE public.p0_users ADD "row" int NULL;
ALTER TABLE public.p0_users ADD username varchar NULL;
ALTER TABLE public.p0_users ADD "password" varchar NULL;
ALTER TABLE public.p0_users ADD "name" varchar NULL;
ALTER TABLE public.p0_users ADD atype varchar NULL;

drop table p0_users;


