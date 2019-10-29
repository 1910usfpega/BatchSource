create table accounts(
accounts_username varchar(30) primary key,
accounts_accountnumber integer,
accounts_accountbalance numeric(10,2),
accounts_accounttype_id varchar(30),
BANK_ACCOUNT_ID integer
);
drop table accounts
drop table accounts 

insert into "accounts"(accounts_username,accounts_accountnumber,accounts_accountbalance,accounts_accounttype_id,BANK_ACCOUNT_ID) values ('ehard','2201', '4000.00','checking',1);
insert into "accounts"(accounts_username,accounts_accountnumber,accounts_accountbalance,accounts_accounttype_id,BANK_ACCOUNT_ID) values ('rhar','2202', '3526.00','checking',2);
insert into "accounts"(accounts_username,accounts_accountnumber,accounts_accountbalance,accounts_accounttype_id,BANK_ACCOUNT_ID) values ('bwil','2203', '225.00','checking',3);
insert into "accounts"(accounts_username,accounts_accountnumber,accounts_accountbalance,accounts_accounttype_id,BANK_ACCOUNT_ID) values ('kans','2204', '500.00','checking',4);
insert into "accounts"(accounts_username,accounts_accountnumber,accounts_accountbalance,accounts_accounttype_id,BANK_ACCOUNT_ID) values ('mwill','2205', '350.00','checking',5);

insert into "accounts"(accounts_username,accounts_accountnumber,accounts_accountbalance,accounts_accounttype_id,BANK_ACCOUNT_ID) values ('aii','2206', '350.00','savings',6);
insert into "accounts"(accounts_username,accounts_accountnumber,accounts_accountbalance,accounts_accounttype_id,BANK_ACCOUNT_ID) values ('rome','2207', '750.00','savings',7);
insert into "accounts"(accounts_username,accounts_accountnumber,accounts_accountbalance,accounts_accounttype_id,BANK_ACCOUNT_ID) values ('lulu','2208', '90.00','savings',8);

delete from accounts where accounts_username= dmars2;


