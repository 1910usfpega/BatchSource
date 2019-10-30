/*******************************************************************************
   JBDC Bank Database - Version 1.0
   Script: JDBC_Proj_DerronOM.sql
   Description:  Build Schema tables and fucntions to manipulate data.
   DB Server: PostgreSql
   Author: Derron Marshall
   Due date : 10/29/2019 
********************************************************************************/


/*******************************************************************************
   Create Database 
********************************************************************************/
--DID NOT USE BECAUSE OF PERMISSIONS PROBLEM I WAS HAVING 

--CREATE DATABASE JDBC_Bank       
--OWNER =  D3rronOM
--TEMPLATE = template			
--ENCODING = encoding			
--LC_COLLATE = collate			
--LC_CTYPE = ctype
--TABLESPACE = tablespace_name
--CONNECTION LIMIT = max_concurrent_connection

--DROP DATABASE IF EXISTS JDBC_Bank;
/*******************************************************************************
   Create Schema
********************************************************************************/


CREATE SCHEMA IF NOT EXISTS JDBC_Bank;

--CREATE SCHEMA IF NOT EXISTS AUTHORIZATION D3rronOM;
--DROP SCHEMA IF EXISTS JDBC_Bank;
---DROP SCHEMA IF EXISTS JDBC_Bank CASCADE;
/*******************************************************************************
   Create Tables
********************************************************************************/

CREATE TABLE JDBC_Bank.User_Info
(
     User_ID  int NOT NULL,
     User_Name  VARCHAR(60) NOT null UNIQUE,
     User_Typ  INT NOT NULL,
     FirstName  VARCHAR(20) NOT NULL,
     LastName  VARCHAR(20) NOT NULL,
     Address  VARCHAR(70),
     City  VARCHAR(40),
     State  VARCHAR(40),
     Country  VARCHAR(40),
     PostalCode  VARCHAR(10),
     Phone  VARCHAR(24),
     Email  VARCHAR(60), 
    CONSTRAINT  PK_User  PRIMARY KEY  ( User_ID )
);


CREATE TABLE JDBC_Bank.Account
(
     Bank_Acc_ID  INT NOT null UNIQUE,
	 User_ID  int NOT NULL,
     Acc_Typ  INT NOT NULL,
     Balance  NUMERIC(10,2) NOT null,
    CONSTRAINT  PK_Account  PRIMARY KEY  ( Bank_Acc_ID , User_ID )
);


CREATE TABLE JDBC_Bank.Transaction_info
(
     Trans_ID  INT NOT NULL,
	 User_ID  int NOT NULL,
     Bank_Acc_ID  INT NOT NULL,
     Trans_Typ  INT NOT NULL,
     Trans_Amt  NUMERIC(10,2) NOT null,
    CONSTRAINT  PK_Transaction_info  PRIMARY KEY  ( Trans_ID )
);

CREATE TABLE JDBC_Bank.User_Type
(
     User_Typ  INT NOT NULL,
     Description  VARCHAR(20) NOT NULL,
    CONSTRAINT  PK_User_Type  PRIMARY KEY  ( User_Typ )
);


CREATE TABLE JDBC_Bank.Acc_Type
(
     Acc_Typ  INT NOT NULL,
     Description  VARCHAR(20) NOT NULL,
    CONSTRAINT  PK_Acc_type  PRIMARY KEY  ( Acc_Typ )
); 

CREATE TABLE JDBC_Bank.Trans_Type
(
     Trans_Typ  INT NOT NULL,
     Description  VARCHAR(20) NOT NULL,
    CONSTRAINT  PK_Trans_type  PRIMARY KEY  ( Trans_Typ )
); 

CREATE TABLE JDBC_Bank.Log_In
(
     User_Name  VARCHAR(60) NOT NULL,
     Passwd  VARCHAR(20) NOT NULL,
    CONSTRAINT  PK_Log_In  PRIMARY KEY  ( User_Name )
); 

-- drop table JDBC_Bank.User_Info CASCADE;
-- drop table JDBC_Bank.Account CASCADE;
-- drop table JDBC_Bank.Transaction_info CASCADE;
-- drop table JDBC_Bank.User_Type CASCADE;
-- drop table JDBC_Bank.Acc_Type CASCADE;
-- drop table JDBC_Bank.Trans_Type CASCADE;
-- drop table JDBC_Bank.Log_In CASCADE;

/*******************************************************************************
   Create Sequence + Add sequence to tables
********************************************************************************/
 
CREATE SEQUENCE  JDBC_Bank.seq_userid 
START WITH  100 
OWNED BY  JDBC_Bank.User_Info.User_ID;
                
ALTER TABLE  JDBC_Bank.User_Info ALTER COLUMN User_ID 
SET DEFAULT nextVal ('JDBC_Bank.seq_userid');  


CREATE SEQUENCE  JDBC_Bank.seq_bank_Accid
START WITH  1000 
OWNED BY  JDBC_Bank.Account.Bank_Acc_ID;
                
ALTER TABLE  JDBC_Bank.Account ALTER COLUMN  Bank_Acc_ID 
SET DEFAULT nextVal ('JDBC_Bank.seq_bank_Accid'); 


CREATE SEQUENCE  JDBC_Bank.seq_TransID
START WITH  1 
OWNED BY  JDBC_Bank.Transaction_info.Trans_ID;
                
ALTER TABLE  JDBC_Bank.Transaction_info ALTER COLUMN  Trans_ID 
SET DEFAULT nextVal ('JDBC_Bank.seq_TransID'); 

CREATE SEQUENCE  JDBC_Bank.seq_UserType
START WITH  1 
OWNED BY  JDBC_Bank.User_Type.User_Typ;
                
ALTER TABLE  JDBC_Bank.User_Type ALTER COLUMN  User_Typ 
SET DEFAULT nextVal ('JDBC_Bank.seq_UserType'); 

CREATE SEQUENCE  JDBC_Bank.seq_AccTyp
START WITH  1 
OWNED BY  JDBC_Bank.Acc_Type.Acc_Typ;
                
ALTER TABLE  JDBC_Bank.Acc_Type ALTER COLUMN  Acc_Typ  
SET DEFAULT nextVal ('JDBC_Bank.seq_AccTyp'); 

CREATE SEQUENCE  JDBC_Bank.seq_TransTyp
START WITH  1 
OWNED BY  JDBC_Bank.Trans_Type.Trans_Typ;
                
ALTER TABLE  JDBC_Bank.Trans_Type ALTER COLUMN  Trans_Typ 
SET DEFAULT nextVal ('JDBC_Bank.seq_TransTyp'); 



/*******************************************************************************
   Create Foreign Keys
********************************************************************************/

ALTER TABLE JDBC_Bank.Account ADD CONSTRAINT FK_AccountUser_ID
    FOREIGN KEY (User_ID) REFERENCES JDBC_Bank.User_Info (User_ID) ON DELETE CASCADE ON UPDATE CASCADE;
   
ALTER TABLE JDBC_Bank.Transaction_info ADD CONSTRAINT FK_TransUser_ID
    FOREIGN KEY (User_ID) REFERENCES JDBC_Bank.User_Info (User_ID) ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE JDBC_Bank.Transaction_info ADD CONSTRAINT FK_TransAcc_ID
    FOREIGN KEY (Bank_Acc_ID) REFERENCES JDBC_Bank.Account (Bank_Acc_ID) ON DELETE CASCADE ON UPDATE CASCADE;
   
ALTER TABLE JDBC_Bank.Log_In ADD CONSTRAINT FK_LogInUser_Nme
    FOREIGN KEY (User_Name) REFERENCES JDBC_Bank.User_Info (User_Name) ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE JDBC_Bank.User_Info ADD CONSTRAINT FK_User_typ
    FOREIGN KEY (User_Typ) REFERENCES JDBC_Bank.User_Type (User_Typ) ON DELETE CASCADE ON UPDATE CASCADE;
   
ALTER TABLE JDBC_Bank.Account ADD CONSTRAINT FK_Account_typ
    FOREIGN KEY (Acc_Typ) REFERENCES JDBC_Bank.Acc_Type (Acc_Typ) ON DELETE CASCADE ON UPDATE CASCADE;
   
ALTER TABLE JDBC_Bank.Transaction_info ADD CONSTRAINT FK_Trans_typ
    FOREIGN KEY (Trans_Typ) REFERENCES JDBC_Bank.Trans_Type (Trans_Typ) ON DELETE CASCADE ON UPDATE CASCADE; 
   
   
   -- DROP CONSTRAINT IF EXISTS FK_LogInUser_Nme; 
 
/*******************************************************************************
         Functions
********************************************************************************/
----Selects
CREATE OR REPLACE FUNCTION JDBC_Bank.get_AllUsers() 
   RETURNS TABLE (
      User_ID  INT,
     User_Name  VARCHAR(60),
     User_Type  INT,
     FirstName  VARCHAR(20),
     LastName  VARCHAR(20),
     Address  VARCHAR(70),
     City  VARCHAR(40),
     State  VARCHAR(40),
     Country  VARCHAR(40),
     PostalCode  VARCHAR(10),
     Phone  VARCHAR(24),
     Email  VARCHAR(60)
) 
AS $$
BEGIN
   RETURN QUERY SELECT
      *
   FROM
      JDBC_Bank.User_Info;
END; $$ 
 
LANGUAGE 'plpgsql';   
----
CREATE OR REPLACE FUNCTION JDBC_Bank.get_AllAccounts() 
   RETURNS TABLE (
      Bank_Acc_ID  INT,
	 User_ID  INT,
     Acc_Typ  INT,
     Balance  NUMERIC(10,2) 
) 
AS $$
BEGIN
   RETURN QUERY SELECT
      *
   FROM
      JDBC_Bank.Account;
END; $$ 
 
LANGUAGE 'plpgsql';  
----  
CREATE OR REPLACE FUNCTION JDBC_Bank.get_AllTransactions() 
   RETURNS TABLE (
      Trans_ID  INT,
	 User_ID  INT,
     Bank_Acc_ID  INT,
     Trans_Typ  INT,
     Trans_Amt  NUMERIC(10,2) 
) 
AS $$
BEGIN
   RETURN QUERY SELECT
      *
   FROM
      JDBC_Bank.Transaction_info;
END; $$ 
 
LANGUAGE 'plpgsql'; 
---- 
CREATE OR REPLACE FUNCTION JDBC_Bank.get_AllUserTypes() 
   RETURNS TABLE (
      User_Typ  INT,
     Description  VARCHAR(20) 
) 
AS $$
BEGIN
   RETURN QUERY SELECT
      *
   FROM
      JDBC_Bank.User_Type;
END; $$ 
 
LANGUAGE 'plpgsql'; 
----  
CREATE OR REPLACE FUNCTION JDBC_Bank.get_AllAccTypes() 
   RETURNS TABLE (
      Acc_Typ  INT,
     Description  VARCHAR(20) 
) 
AS $$
BEGIN
   RETURN QUERY SELECT
      *
   FROM
      JDBC_Bank.Acc_Type;
END; $$ 
 
LANGUAGE 'plpgsql'; 
---- 
CREATE OR REPLACE FUNCTION JDBC_Bank.get_AllTransTypes() 
   RETURNS TABLE (
      Trans_Typ  INT,
     Description  VARCHAR(20) 
) 
AS $$
BEGIN
   RETURN QUERY SELECT
      *
   FROM
      JDBC_Bank.Trans_Type;
END; $$ 
 
LANGUAGE 'plpgsql'; 
----
CREATE OR REPLACE FUNCTION JDBC_Bank.get_AllLogIn() 
   RETURNS TABLE (
      User_Name  VARCHAR(60) ,
     Passwd  VARCHAR(20) 
) 
AS $$
BEGIN
   RETURN QUERY SELECT
      *
   FROM
      JDBC_Bank.Log_In;
END; $$ 
 
LANGUAGE 'plpgsql'; 
----

-----Insertions
CREATE OR REPLACE FUNCTION JDBC_Bank.AddUser(uName VARCHAR, utype integer, fname VARCHAR, lname VARCHAR, adds VARCHAR, city VARCHAR, state VARCHAR, ctry VARCHAR, zip VARCHAR, phne VARCHAR, eml  VARCHAR)
  RETURNS void AS
  $BODY$
      BEGIN
        INSERT INTO JDBC_Bank.User_Info(User_ID, User_Name, User_Typ, FirstName, LastName, Address, City, State, Country, PostalCode, Phone, Email)
        VALUES(DEFAULT, uName, utype, fname, lname, adds, city, state, ctry, zip, phne, eml);
      END;
  $BODY$
  LANGUAGE 'plpgsql';
----

CREATE OR REPLACE FUNCTION JDBC_Bank.AddAccount( uid integer, acctyp integer, balance numeric)
  RETURNS void AS
  $BODY$
      BEGIN
        INSERT INTO JDBC_Bank.Account(Bank_Acc_ID, User_ID, Acc_Typ, Balance)
        VALUES(DEFAULT, uid, acctyp, balance);
      END;
  $BODY$
  LANGUAGE 'plpgsql';
----   
CREATE OR REPLACE FUNCTION JDBC_Bank.AddTrans(uid integer, accid integer, transtyp integer, tamt numeric)
  RETURNS void AS
  $BODY$
      BEGIN
        INSERT INTO JDBC_Bank.Transaction_info(Trans_ID, User_ID, Bank_Acc_ID, Trans_Typ, Trans_Amt)
        VALUES(DEFAULT, uid, accid, transtyp, tamt);
      END;
  $BODY$
  LANGUAGE 'plpgsql';
----
CREATE OR REPLACE FUNCTION JDBC_Bank.AddUType(udesc VARCHAR)
  RETURNS void AS
  $BODY$
      BEGIN
        INSERT INTO JDBC_Bank.User_Type(User_Typ, Description)
        VALUES(DEFAULT, udesc);
      END;
  $BODY$
  LANGUAGE 'plpgsql';
----
CREATE OR REPLACE FUNCTION JDBC_Bank.AddAtype(adesc VARCHAR)
  RETURNS void AS
  $BODY$
      BEGIN
        INSERT INTO JDBC_Bank.Acc_Type(Acc_Typ, Description)
        VALUES(DEFAULT, adesc);
      END;
  $BODY$
  LANGUAGE 'plpgsql';
----
CREATE OR REPLACE FUNCTION JDBC_Bank.AddTType(tdesc VARCHAR)
  RETURNS void AS
  $BODY$
      BEGIN
        INSERT INTO JDBC_Bank.Trans_Type(Trans_Typ, Description)
        VALUES(DEFAULT, tdesc);
      END;
  $BODY$
  LANGUAGE 'plpgsql';
----
CREATE OR REPLACE FUNCTION JDBC_Bank.AddLogIN(uName VARCHAR, pwd VARCHAR)
  RETURNS void AS
  $BODY$
      BEGIN
        INSERT INTO JDBC_Bank.Log_In(User_Name, Passwd)
        VALUES(uName, passwd);
      END;
  $BODY$
  LANGUAGE 'plpgsql';
----
------deletitions

 --I wanted to make a dynamic fuction that can delete 1 record at a time from any table
CREATE OR REPLACE FUNCTION JDBC_Bank.deleteRec(tableName varchar, columnName varchar,value varchar)
 RETURNS void AS

$BODY$ 
begin 
EXECUTE 'DELETE FROM ' || tableName || ' WHERE ' || columnName || '=' || value; 

end; 
$BODY$

LANGUAGE plpgsql VOLATILE;

 --I wanted to make a dynamic fuction that can delete all records from any table
CREATE OR REPLACE FUNCTION JDBC_Bank.deleteAllRec(tableName varchar)
 RETURNS void AS

$BODY$ 
begin 
EXECUTE 'DELETE FROM ' || tableName; 

end; 
$BODY$

LANGUAGE plpgsql VOLATILE;
----
------update

 --I wanted to make a dynamic fuction that can update 1 record at a time from any table
CREATE OR REPLACE FUNCTION JDBC_Bank.UpdateRec(tableName varchar, columnName1 varchar, columnName2 varchar, value1 varchar, value2 varchar)
 RETURNS void AS

$BODY$ 
begin 
EXECUTE 'UPDATE ' || tableName || ' SET ' || columnName1 || '=' || value1 || ' WHERE ' || columnName2 || '=' || value2; 

end; 
$BODY$

LANGUAGE plpgsql VOLATILE;
 



/*******************************************************************************
   Populate Tables with Some Assumed data
********************************************************************************/


INSERT INTO JDBC_Bank.User_Type(User_Typ, Description)
        VALUES(DEFAULT,'Admin');
INSERT INTO JDBC_Bank.User_Type(User_Typ, Description)
        VALUES(DEFAULT,'Customer');  
       
select * from JDBC_Bank.User_Type
----
INSERT INTO JDBC_Bank.Acc_Type(Acc_Typ, Description)
        VALUES(DEFAULT, 'Checking');
INSERT INTO JDBC_Bank.Acc_Type(Acc_Typ, Description)
        VALUES(DEFAULT, 'Savings');
INSERT INTO JDBC_Bank.Acc_Type(Acc_Typ, Description)
        VALUES(DEFAULT, 'Pending');

select * from JDBC_Bank.Acc_Type
----
INSERT INTO JDBC_Bank.Trans_Type(Trans_Typ, Description)
        VALUES(DEFAULT, 'Deposit');
INSERT INTO JDBC_Bank.Trans_Type(Trans_Typ, Description)
        VALUES(DEFAULT, 'Withdraw');
       
select * from JDBC_Bank.Trans_Type
----
INSERT INTO JDBC_Bank.User_Info(User_ID, User_Name, User_Typ, FirstName, LastName, Address, City, State, Country, PostalCode, Phone, Email)
        VALUES(DEFAULT, 'boss@admin.com',1, 'Boss', 'Man', '111 Runthis Ave', 'Jamrock', 'FL', 'USA', '12345', '212-333-4567', 'boss@admin.com');
INSERT INTO JDBC_Bank.User_Info(User_ID, User_Name, User_Typ, FirstName, LastName, Address, City, State, Country, PostalCode, Phone, Email)
        VALUES(DEFAULT, 'chick@gmail.com',2, 'Tara', 'Pinnock', '231 Banded Ave', 'Jamrock', 'TX', 'USA', '12245', '677-333-4567', 'chick@gmail.com');
INSERT INTO JDBC_Bank.User_Info(User_ID, User_Name, User_Typ, FirstName, LastName, Address, City, State, Country, PostalCode, Phone, Email)
        VALUES(DEFAULT, 'rasta@msn.com',2, 'Joel', 'Blake', '1321 Handes Rd', 'Jamrock', 'AK', 'USA', '11133', '435-333-4567', 'rasta@msn.com');
       
select * from JDBC_Bank.User_Info       
----
INSERT INTO JDBC_Bank.Log_In(User_Name, Passwd)
        VALUES('boss@admin.com', 'passwd123');
INSERT INTO JDBC_Bank.Log_In(User_Name, Passwd)
        VALUES('chick@gmail.com', 'passwd1');
INSERT INTO JDBC_Bank.Log_In(User_Name, Passwd)
        VALUES('rasta@msn.com', 'passwd2');
  
select * from JDBC_Bank.Log_In 
----

select JDBC_Bank.AddAccount( 101, 1, 12345.50);
select JDBC_Bank.AddAccount( 101, 2, 5345.50);

select JDBC_Bank.AddAccount( 102, 1, 2145.50);
select JDBC_Bank.AddAccount( 102, 2, 52145.50);


select JDBC_Bank.UpdateRec('JDBC_Bank.Account','Balance' , 'Bank_Acc_ID', '12045.50', '1000');
select JDBC_Bank.UpdateRec('JDBC_Bank.Account','Balance' , 'Bank_Acc_ID', '5645.50', '1001');

select * from JDBC_Bank.Account
----

select JDBC_Bank.AddTrans(101, 1000, 2, 300);
select JDBC_Bank.AddTrans(101, 1001, 1, 300);

select * from JDBC_Bank.Transaction_info;

/*******************************************************************************/




    