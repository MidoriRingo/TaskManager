create table CLIENT
(
	ID int not null generated always as identity ,
	LOGIN varchar(20) not null ,
	PASSWORD varchar(20) not null ,
	PRIMARY KEY (ID)
);

CREATE TABLE PROJECT
(
	ID int not null generated always as identity ,
	NAME varchar(100) NOT NULL ,
	CLIENT int constraint CLIENT_fk references CLIENT ,
	PRIMARY KEY (ID)
);


CREATE TABLE TASK
(
	ID int not null generated always as identity ,
	NAME varchar(100) not NULL ,
	CREATIONDATE date not null ,
	DEADLINE date ,
	STATUS boolean default false check(STATUS = true OR STATUS = false),
	PRIORITY int default 1 NOT NULL ,
	PROJECT int constraint PROJECT_fk references PROJECT ,
	PRIMARY KEY (ID)
);