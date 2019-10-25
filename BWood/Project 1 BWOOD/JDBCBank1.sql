/*Bank of Doom sql script
 *Three tables 
 *
 *Table: user
 *this is the traditional 'User name' displayed and will be sanitized
 * 	private String uName;
 *	private String name;
 * 	private String address
 * 	private String email;
 * 	private String phoneNumber;
 *role based access
 *	private ArrayList<String> role;
	
 *Table: Account 
 *	private int accountID;
 *	private boolean checkingAccount;
 *	private double balance;
 *	private String uName;
 *	private boolean approved;
 *	
 *Table: User-Account
 *	user_uName -> table_uName
 *	
 *
 *Table registered users
 *	for security reasons passwords are NEVER handled as a string
 * 	private String uName	
 * private long password;
 */
create table users(
userId integer primary key,
uName varchar(15),
name varchar(50),
address varchar(100),
email varchar(30),
contactnum varchar(13)
);

create table accounts(
accountId integer primary key,
checking boolean,
balance numeric,
uName varchar(50),
approved boolean
);

create table users_accounts(
userId integer,
accountId integer,
primary key(userId,accountId)
);

create table registered_users(
uName varchar(15) primary key,
password bigint
);

create table roles(
uName varchar(50) primary key,
myrole varchar(10)
);

/* alter table bear 
add constraint fk_bear_type
foreign key (bear_type_id)
references bear_type(bear_type_id);
*/
alter table users
add constraint fk_uName
foreign key (uName)
references roles(uName);

alter table users
add constraint fk_users
foreign key (uName)
references registered_users(uName);
/*
alter table roles
add constraint fk_users
foreign key (uName)
references users(uName);
*/
alter table users_accounts
add constraint fk_users
foreign key (userId)
references users(userId),
add constraint fk_accounts
foreign key (accountId)
references accounts(accountId);




