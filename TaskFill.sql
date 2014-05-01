insert into CLIENT(LOGIN, PASSWORD) values ('Nora' , 'Nora');
insert into CLIENT(LOGIN, PASSWORD) values ('Terry' , 'Terry');
insert into CLIENT(LOGIN, PASSWORD) values ('Mika' , 'Mika');
insert into CLIENT(LOGIN, PASSWORD) values ('Shinji' , 'Shinji');
insert into CLIENT(LOGIN, PASSWORD) values ('Kaoru' , 'Kaoru');
insert into CLIENT(LOGIN, PASSWORD) values ('Vicky' , 'Vicky');
insert into CLIENT(LOGIN, PASSWORD) values ('Benji' , 'Benji');
insert into CLIENT(LOGIN, PASSWORD) values ('Arya' , 'Arya');
insert into CLIENT(LOGIN, PASSWORD) values ('Sansa' , 'Sansa');

insert into PROJECT(PROJECT.CLIENT, PROJECT.NAME) values ( 1, 'Home');
insert into PROJECT(PROJECT.CLIENT, PROJECT.NAME) values ( 1, 'Job');
insert into PROJECT(PROJECT.CLIENT, PROJECT.NAME) values ( 2, 'World');
insert into PROJECT(PROJECT.CLIENT, PROJECT.NAME) values ( 3, 'Eva');
insert into PROJECT(PROJECT.CLIENT, PROJECT.NAME) values ( 2, 'Conquest');
insert into PROJECT(PROJECT.CLIENT, PROJECT.NAME) values ( 3, 'Music');
insert into PROJECT(PROJECT.CLIENT, PROJECT.NAME) values ( 7, 'Children');
insert into PROJECT(PROJECT.CLIENT, PROJECT.NAME) values ( 7, 'Robotics');

insert into TASK(TASK.NAME, TASK.PROJECT, TASK.CREATIONDATE, TASK.DEADLINE) values ('Find fathers keys', 1, '2014-03-05', '2014-03-10');
insert into TASK(TASK.NAME, TASK.PROJECT, TASK.CREATIONDATE, TASK.DEADLINE) values ('Bring disc to grandma', 1, '2014-03-06', '2014-03-11');

insert into TASK(TASK.NAME, TASK.PROJECT, TASK.CREATIONDATE, TASK.DEADLINE) values ('Complete tha annual report', 2, '2014-03-19', '2014-03-25');
insert into TASK(TASK.NAME, TASK.PROJECT, TASK.CREATIONDATE, TASK.DEADLINE) values ('Ask boss for vacation', 2, '2014-03-14', '2014-03-30');
insert into TASK(TASK.NAME, TASK.PROJECT, TASK.CREATIONDATE, TASK.DEADLINE) values ('Take some newspapers for Jean', 2, '2014-03-15', '2014-03-29');
insert into TASK(TASK.NAME, TASK.PROJECT, TASK.CREATIONDATE, TASK.DEADLINE) values ('Get some coffee at Nils"s', 2, '2014-03-18', '2014-03-20');

insert into TASK(TASK.NAME, TASK.PROJECT, TASK.CREATIONDATE, TASK.DEADLINE) values ('', , '', '')
insert into TASK(TASK.NAME, TASK.PROJECT, TASK.CREATIONDATE, TASK.DEADLINE) values ('', , '', '')
insert into TASK(TASK.NAME, TASK.PROJECT, TASK.CREATIONDATE, TASK.DEADLINE) values ('', , '', '')
insert into TASK(TASK.NAME, TASK.PROJECT, TASK.CREATIONDATE, TASK.DEADLINE) values ('', , '', '')