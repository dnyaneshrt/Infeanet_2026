
-- create database <databaseb>
create database <>-- create database <database_name>
create database infeanet2026;

-- create database if not exists infeanet2026;

drop database infeanet2026;

SELECT pg_terminate_backend(pid)
FROM pg_stat_activity
WHERE datname = 'infeanet2026'
  AND pid <> pg_backend_pid();


drop table Interns;

create table Interns
(id Int primary key, name varchar(20), address varchar(25), dob date, college varchar(25) default 'TSSM', marks Int check (marks>60), grade char(1) check (grade in ('A','B','C','D')), dept varchar(20),doj date, salary Int, experience  Int);

drop table Interns;
select * from Interns;

INSERT INTO Interns(id,name,address,dob,college,marks,grade,dept,doj,salary,experience)
VALUES
(101,'Shlok','Bhosari','2006-04-12','AISSMS',90,'A','IT','2024-06-11',100000,2),
(102,'Aarav','Hinjewadi','2005-08-15','PCCOE',85,'B','CSE','2024-06-15',85000,1),
(103,'Vihaan','Wakad','2004-02-20','MIT WPU',92,'A','IT','2024-06-18',120000,3),
(104,'Atharva','Nigdi','2005-06-30','DY Patil',88,'B','ECE','2024-06-20',95000,2),
(105,'Om','Pimpri','2006-01-10','AISSMS',95,'A','CSE','2024-06-22',125000,3),
(106,'Aditya','Chinchwad','2005-11-25','COEP',98,'A','Mechanical','2024-06-25',135000,4),
(107,'Vedant','Akurdi','2004-09-05','VIT Pune',82,'C','Civil','2024-06-27',80000,1),
(108,'Soham','Baner','2005-12-14','PCCOE',87,'B','IT','2024-06-29',90000,2),
(109,'Yash','Pashan','2006-03-08','MIT WPU',91,'A','CSE','2024-07-01',115000,2),
(110,'Rohan','Kothrud','2004-10-18','COEP',89,'B','ECE','2024-07-03',98000,3),
(111,'Pranav','Hadapsar','2005-04-22','DY Patil',93,'A','IT','2024-07-05',118000,2),
(112,'Aryan','Magarpatta','2004-07-16','AISSMS',86,'B','CSE','2024-07-08',92000,2),
(113,'Kunal','Katraj','2005-09-11','VIT Pune',81,'C','Civil','2024-07-10',78000,1),
(114,'Harsh','Warje','2006-05-02','PCCOE',94,'A','Mechanical','2024-07-12',122000,3),
(115,'Sanket','Karve Nagar','2005-03-19','MIT WPU',88,'B','IT','2024-07-15',96000,2),
(116,'Ruturaj','Bibwewadi','2004-12-07','COEP',97,'A','CSE','2024-07-18',132000,4),
(117,'Swapnil','Sinhagad Road','2005-08-27','DY Patil',83,'C','ECE','2024-07-20',84000,1),
(118,'Nikhil','Shivajinagar','2006-02-17','AISSMS',90,'A','IT','2024-07-22',108000,2),
(119,'Akash','Kharadi','2005-10-29','PCCOE',84,'B','CSE','2024-07-24',87000,1),
(120,'Abhishek','Viman Nagar','2004-11-13','MIT WPU',96,'A','Mechanical','2024-07-26',128000,3),
(121,'Tejas','Yerwada','2005-06-21','COEP',89,'B','IT','2024-07-28',97000,2),
(122,'Rahul','Lohegaon','2006-04-03','DY Patil',91,'A','ECE','2024-08-01',111000,2),
(123,'Aniket','Wagholi','2005-01-28','VIT Pune',87,'B','Civil','2024-08-03',91000,2),
(124,'Siddhesh','Moshi','2004-05-12','AISSMS',93,'A','IT','2024-08-05',119000,3),
(125,'Parth','Ravet','2005-07-07','PCCOE',80,'C','CSE','2024-08-07',76000,1),
(126,'Chinmay','Thergaon','2006-06-14','MIT WPU',95,'A','Mechanical','2024-08-09',126000,3),
(127,'Shreyas','Tathawade','2005-02-24','COEP',88,'B','ECE','2024-08-11',94000,2),
(128,'Ansh','Dapodi','2004-08-09','DY Patil',92,'A','IT','2024-08-13',117000,2),
(129,'Krishna','Kasarwadi','2006-03-26','VIT Pune',86,'B','CSE','2024-08-15',90000,2),
(130,'Ritesh','Kalewadi','2005-12-05','AISSMS',79,'C','Civil','2024-08-17',74000,1),
(131,'Tanish','Pimple Saudagar','2004-10-10','PCCOE',94,'A','IT','2024-08-19',121000,3),
(132,'Mihir','Pimple Gurav','2005-05-18','MIT WPU',90,'A','Mechanical','2024-08-21',109000,2),
(133,'Aman','Camp','2006-01-30','COEP',85,'B','ECE','2024-08-23',89000,1),
(134,'Nitin','Swargate','2005-09-02','DY Patil',91,'A','CSE','2024-08-25',114000,2),
(135,'Vivek','Deccan','2004-06-06','VIT Pune',87,'B','IT','2024-08-27',93000,2),
(136,'Sagar','Narhe','2005-11-20','AISSMS',96,'A','Mechanical','2024-08-29',130000,4),
(137,'Bhavesh','Dhayari','2006-02-11','PCCOE',82,'C','Civil','2024-09-01',81000,1),
(138,'Rakesh','Kondhwa','2005-03-15','MIT WPU',89,'B','IT','2024-09-03',98000,2),
(139,'Manish','Undri','2004-12-22','COEP',93,'A','CSE','2024-09-05',120000,3),
(140,'Sameer','NIBM','2006-05-08','DY Patil',84,'B','ECE','2024-09-07',86000,1),
(141,'Akshay','Balewadi','2005-07-29','VIT Pune',92,'A','Mechanical','2024-09-09',118000,3),
(142,'Ganesh','Bavdhan','2004-09-17','AISSMS',88,'B','IT','2024-09-11',95000,2),
(143,'Sachin','Aundh','2006-01-05','PCCOE',90,'A','CSE','2024-09-13',110000,2),
(144,'Suraj','Koregaon Park','2005-04-28','MIT WPU',81,'C','Civil','2024-09-15',79000,1),
(145,'Ajinkya','Fatima Nagar','2004-08-31','COEP',97,'A','ECE','2024-09-17',134000,4),
(146,'Mahesh','Dhanori','2005-10-09','DY Patil',86,'B','IT','2024-09-19',92000,2),
(147,'Rohit','Charholi','2006-06-02','VIT Pune',91,'A','Mechanical','2024-09-21',113000,2),
(148,'Deepak','Alandi','2005-02-13','AISSMS',85,'B','CSE','2024-09-23',88000,1),
(149,'Mayur','Phugewadi','2004-11-27','PCCOE',94,'A','IT','2024-09-25',123000,3),
(150,'Tanmay','Baner','2005-05-30','MIT WPU',89,'B','ECE','2024-09-27',99000,2);


--select sudents whose address is bhosari.
--where clause--  filter all records based on condition 

select * from Interns
where address='Bhosari';


select * from Interns
where college='AISSMS';

select * from Interns
where salary>80000;


select * from Interns
where salary<80000;


INSERT INTO Interns(id,name,address,dob,marks,grade,dept,doj,salary,experience)
VALUES
(151,'Kunal nikam','Katraj','2006-04-12',61,'A','IT','2024-06-11',500000,10);

INSERT INTO Interns(id,name,address,dob,college,marks,grade,dept,doj,salary,experience)
VALUES
(152,'Kunal nikam','Katraj','2006-04-12','NIIT',61,'D','IT','2024-06-11',500000,10);

--find the max salary of intern

--aggregate functions.  max(), min(), count(), avg(), sum()

select max(salary) from Interns;
select min(salary) from Interns;
select avg(salary) from Interns;

select count(*) from Interns;
select sum(salary) from Interns;

--find total no.of Interns from COEP college.

select count(*) 
from Interns
where college='COEP';

--order by clause:  to sort in asc or desc order    asc is default

select * from Interns
order by name;  

select * from Interns
order by name desc;  

select * from Interns
order by 3;  

--group by clause..

----find college-wise count of interns
--alias name

select college, count(*) as "total_students_count"
from Interns
group by college;


--total interns dept-wise

select dept, count(*) as "dept_wise_count"
from Interns
group by dept;


--having clause.  use alng with aggregate functions.

--find dept-wise max salary intern details.

select * from Interns
where salary in (select max(salary)
from Interns
group by dept);


select dept, max(salary)
from Interns
group by dept;


--find interns details dept-wise whose interns count is more than 10.

select dept,count(*) from Interns
group by dept;

select dept,count(*) from Interns
group by dept
having count(*)>10; 

select dept,count(*) from Interns
--where count(*)<10   aggregate functions are not allowed in WHERE
group by dept
; 

--must follow below sequence...
select dept,count(*) 
from Interns
where dept='ECE'
group by dept
having count(*)<10
order by 2 desc;


---select query

select * from Interns;

select name, address, salary
from Interns;

select salary+1 as "salary by adding increament"
from Interns;

select salary-1 as "salary by adding decreament"
from Interns;

-- || concatenation operator
select name  ||'  is from   '||  address as "name with address"
from Interns;

select name  ||'  address  '||  address as "name with address"
from Interns;


SELECT name || ', it''s name ' || address AS "Name With Address"
FROM Interns;


--Constraints: rules/validations/limitaions/restrictions
-- -Constraint is a rule which is applied on a column.
-- • Constraint is used to maintain accurate and quality data.
-- • Constraint restricts the user from entering invalid data.
-- • The goal of constraint is maintaining accurate and quality data. This
-- feature is called “Data Integrity”.
-- • SQL provides Data Integrity.


drop table Interns;

--1.  Unique:
-- • It should not accept duplicate values.
-- • It accepts null values.
-- • If our requirement is accepting null values but not accepting
-- duplicate values, then use it



-- 2. Not Null:
-- • It should not accept null values.
-- • It can accept duplicate values.
-- • When we want to accept duplicate value and demand for entering
-- a value in field then use it.

-- * means mandtaory to fill that data

-- 3. Primary Key:
-- • It should not accept duplicate values.
-- • It should not accept null values.
-- • If our requirement is not to accept duplicate value and null value in
-- a column then use it.

-- 4. Check
--it is used to apply our own rules on a column.


--5. Default..

--it is used to apply default value to a column


--Foregin Key.

table 1: PK
table 2: FK

Cousellor table

id PK- 1,2,3,4....10
name
mo_number
address



Students table

sid    s1
sname   Mandar
id FK    4

sid    s2
sname   kunal
id FK    4

sid    s3
sname   Devika
id FK    4


---SubQuery.

-- Writing one query inside another query is called as "Sub query".
--

--find the max salary---  no need to write the su query
--find the name of the person who is having max salary?    
--sub query--inner query--child query
--Super query--outer query --Parent query


-- find the employee who is having 2nd highest salary...
select * from Interns
where salary=(select max(salary) from Interns);

select max(salary) from Interns;

select * from Interns;

--sub query always executes first..
select * from Interns
where salary=(
select max(salary) from Interns
where salary<(select max(salary) from Interns));


-- inner query we must written in parentheseis.

--inner query must be select statment only.  cannot write insert, update, delete as inner query.
--outer query can be select,insert, update, delete.

--from 1 to 255 level nesting is allowed.

-- 1. Single Row Sub Query.
-- An inner query which returns only one value is called as Single row sub query.



select * from Interns
limit 10;
where college='PCCOE';

--find the Interns details who is having more salary than shlok.

select * from interns
where salary >(select salary from Interns
where name='Shlok');

--find the Interns details who is having less salary than shlok.
select * from interns
where salary <(select salary from Interns
where name='Shlok');

--query to find the salary in descening order..

select salary from interns
order by salary desc;


--find the dept-wise min salary of the employees, whose salaries are greater than dept "ECE".

select dept, min(salary) from interns
where salary>(select min(salary) from interns
where dept='ECE')
group by dept;




select dept, min(salary) from interns
group by dept
having min(salary)>(select min(salary) from interns
where dept='ECE');

select min(salary) from interns
where dept='ECE'


--per college how many interns are from IT dept?
--how many   count
--per college  group by
--select college, count(college)

select college, count(college)
from interns
where dept='IT'
group by college;


--per college how many interns of IT dept earn more than 100000?

select college, count(college)
from interns
where salary>100000 and dept='IT'
group by college;





--which interns is having same address as Shreyas?

select name, address
from interns
where address= (select address from interns where name='Kunal');;;



--)in ascending order, print employees dept-wise which atleast have 8 intenrs?

select dept, count(dept) as  "dept-wise count of interns"
from interns
group by dept
having count(dept)>8
order by 2;


select dept, count(dept) as  "dept-wise count of interns"
from interns
group by dept;

--find the dept who is having max no.of interns

select dept, count(dept) as "max_no_of_interns"
from interns
group by dept
order by 2 desc 
limit 1;



