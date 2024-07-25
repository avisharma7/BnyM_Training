create database file_db;

use file_db;
show tables;
select * from course_seq;
Create table Course(
id bigint not null,
name varchar(255) not null,
author varchar(255) not nulL,
primary key(id)
);

insert into Course values(1, 'learn angular', 'Aviral');
insert into Course values(2, 'learn os', 'krishna');
insert into Course values(3, 'learn dmbs', 'ramesh');
insert into Course values(4, 'learn nc', 'hari');

select * from course;

create database Test;
use test;

SHOW TABLES;
select * from image_data;
 
DESCRIBE image_data;
 use test
 
 select * from image_data;
 
ALTER TABLE image_data MODIFY image_data LONGBLOB;
desc image_data;