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
     User_Name  VARCHAR(60) NOT NULL,
     User_Type  INT NOT NULL,
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
     Bank_Acc_ID  INT NOT NULL,
	 User_ID  int NOT NULL,
     Acc_Type  INT NOT NULL,
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
     User_Type  INT NOT NULL,
     Description  VARCHAR(20) NOT NULL,
    CONSTRAINT  PK_User_Type  PRIMARY KEY  ( User_Type )
);


CREATE TABLE JDBC_Bank.Acc_Type
(
     Acc_Typ  INT NOT NULL,
     Description  VARCHAR(20) NOT NULL,
    CONSTRAINT  PK_Acc_type  PRIMARY KEY  ( Acc_Type )
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
    CONSTRAINT  PK_Log_In  PRIMARY KEY  ( User_ID )
); 

-- drop table JDBC_Bank.Log_In
-- drop table JDBC_Bank.Trans_Type
-- drop table JDBC_Bank.Acc_Type
-- drop table JDBC_Bank.User_Type
-- drop table JDBC_Bank.Transaction_info
-- drop table JDBC_Bank.User_Info
-- drop table JDBC_Bank.account

/*******************************************************************************
   Create Sequence + Add sequence to tables
********************************************************************************/

CREATE SEQUENCE  seq_userid 
START WITH  100 
OWNED BY  JDBC_Bank.User_Info.User_ID;
                
ALTER TABLE  JDBC_Bank.User_Info ALTER COLUMN User_ID 
SET DEFAULT nextVal seq_userid  


CREATE SEQUENCE  seq_bank_Accid
START WITH  1000 
OWNED BY  JDBC_Bank.Account.Bank_Acc_ID;
                
ALTER TABLE  JDBC_Bank.Account ALTER COLUMN  Bank_Acc_ID 
SET DEFAULT nextVal seq_bank_Accid


CREATE SEQUENCE  seq_TransID
START WITH  1 
OWNED BY  JDBC_Bank.Transaction_info.Trans_ID;
                
ALTER TABLE  JDBC_Bank.Transaction_info ALTER COLUMN  Trans_ID 
SET DEFAULT nextVal seq_TransID

CREATE SEQUENCE  seq_UserType
START WITH  1 
OWNED BY  JDBC_Bank.User_Type.UserType;
                
ALTER TABLE  JDBC_Bank.User_Type ALTER COLUMN  UserType 
SET DEFAULT nextVal seq_UserType

CREATE SEQUENCE  seq_AccTyp
START WITH  1 
OWNED BY  JDBC_Bank.Acc_Type.Acc_Typ;
                
ALTER TABLE  JDBC_Bank.Acc_Type ALTER COLUMN  Acc_Typ  
SET DEFAULT nextVal seq_AccTyp

CREATE SEQUENCE  seq_TransTyp
START WITH  1 
OWNED BY  JDBC_Bank.Trans_Type.Trans_Typ;
                
ALTER TABLE  JDBC_Bank.Trans_Type ALTER COLUMN  Trans_Typ 
SET DEFAULT nextVal seq_TransTyp



/*******************************************************************************
   Create Foreign Keys
********************************************************************************/

ALTER TABLE JDBC_Bank.Account ADD CONSTRAINT FK_AccountUser_ID
    FOREIGN KEY (User_ID) REFERENCES JDBC_Bank.User_Info (User_ID) ON DELETE CASCADE ON UPDATE CASCADE;
   
ALTER TABLE JDBC_Bank.Transaction_info ADD CONSTRAINT FK_TransUser_ID
    FOREIGN KEY (User_ID) REFERENCES JDBC_Bank.User_Info (User_ID) ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE JDBC_Bank.Transaction_info ADD CONSTRAINT FK_TransUser_ID
    FOREIGN KEY (Acc_num) REFERENCES JDBC_Bank.Account (Acc_num) ON DELETE CASCADE ON UPDATE CASCADE;
   
ALTER TABLE JDBC_Bank.Log_In ADD CONSTRAINT FK_LogInUser_Nme
    FOREIGN KEY (User_Name) REFERENCES JDBC_Bank.User_Info (User_Name) ON DELETE CASCADE ON UPDATE CASCADE;
 
/*******************************************************************************
   Functions
********************************************************************************/
----Selects
CREATE OR REPLACE FUNCTION JDBC_Bank.get_AllUsers () 
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
CREATE OR REPLACE FUNCTION JDBC_Bank.get_AllAccounts () 
   RETURNS TABLE (
      Bank_Acc_ID  INT,
	 User_ID  INT,
     Acc_Type  INT,
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
CREATE OR REPLACE FUNCTION JDBC_Bank.get_AllTransactions () 
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
      User_Type  INT,
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
      Acc_Typ  INT NOT NULL,
     Description  VARCHAR(20) NOT NULL 
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
      Trans_Typ  INT NOT NULL,
     Description  VARCHAR(20) NOT NULL 
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
      User_Name  VARCHAR(60) NOT NULL,
     Passwd  VARCHAR(20) NOT NULL 
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
CREATE FUNCTION JDBC_Bank.AddUser(uName VARCHAR, utype integer, fname VARCHAR, lname VARCHAR, adds VARCHAR, city VARCHAR, state VARCHAR, ctry VARCHAR, zip VARCHAR, phne integer, eml  VARCHAR)
  RETURNS void AS
  $BODY$
      BEGIN
        INSERT INTO JDBC_Bank.User_Info(User_ID, User_Name, User_Type, FirstName, LastName, Address, City, State, Country, PostalCode, Phone, Email)
        VALUES(DEFAULT, utype, fname, lname, adds, city, state, ctry, zip, phne, eml);
      END;
  $BODY$
  LANGUAGE 'plpgsql';
----

CREATE FUNCTION JDBC_Bank.AddAccount( uid integer, acctyp integer, balance numeric)
  RETURNS void AS
  $BODY$
      BEGIN
        INSERT INTO JDBC_Bank.Account(Bank_Acc_ID, User_ID, Acc_Type, Balance)
        VALUES(DEFAULT, uid, acctyp, balance);
      END;
  $BODY$
  LANGUAGE 'plpgsql';
----   
CREATE FUNCTION JDBC_Bank.AddTrans(uid integer, accid integer, transtyp integer, tamt numeric)
  RETURNS void AS
  $BODY$
      BEGIN
        INSERT INTO JDBC_Bank.Transaction_info(Trans_ID, User_ID, Bank_Acc_ID, Trans_Typ, Trans_Amt)
        VALUES(DEFAULT, uid, accid, transtyp, tamt);
      END;
  $BODY$
  LANGUAGE 'plpgsql';
----
CREATE FUNCTION JDBC_Bank.AddUType(udesc VARCHAR)
  RETURNS void AS
  $BODY$
      BEGIN
        INSERT INTO JDBC_Bank.User_Type(User_Type, Description)
        VALUES(DEFAULT, udesc);
      END;
  $BODY$
  LANGUAGE 'plpgsql';
----
CREATE FUNCTION JDBC_Bank.AddAtype(adesc VARCHAR)
  RETURNS void AS
  $BODY$
      BEGIN
        INSERT INTO JDBC_Bank.Acc_Type(Acc_Typ, Description)
        VALUES(DEFAULT, adesc);
      END;
  $BODY$
  LANGUAGE 'plpgsql';
----
CREATE FUNCTION JDBC_Bank.AddTType(tdesc VARCHAR)
  RETURNS void AS
  $BODY$
      BEGIN
        INSERT INTO JDBC_Bank.Trans_Type(Trans_Typ, Description)
        VALUES(DEFAULT, tdesc);
      END;
  $BODY$
  LANGUAGE 'plpgsql';
----
CREATE FUNCTION JDBC_Bank.AddLogIN(uName VARCHAR, pwd VARCHAR)
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
CREATE OR REPLACE FUNCTION JDBC_Bank.deleteRec(tableName nvarchar(50), columnName nvarchar(100),value nvarchar(100))
 RETURNS void AS

$BODY$ 
begin 
EXECUTE 'DELETE FROM ' || tableName || ' WHERE ' || columnName || '=' || value; 

end; 
$BODY$

LANGUAGE plpgsql VOLATILE;

 --I wanted to make a dynamic fuction that can delete all records from any table
CREATE OR REPLACE FUNCTION JDBC_Bank.deleteAllRec(tableName nvarchar(50))
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
CREATE OR REPLACE FUNCTION JDBC_Bank.UpdateRec(tableName nvarchar(50), columnName1 nvarchar(100), columnName2 nvarchar(100), value1 nvarchar(100), value2 nvarchar(100))
 RETURNS void AS

$BODY$ 
begin 
EXECUTE 'UPDATE ' || tableName || ' SET ' || columnName1 || '=' || value1 || ' WHERE ' || columnName2 || '=' || value2; 

end; 
$BODY$

LANGUAGE plpgsql VOLATILE;
 

/*******************************************************************************/




    