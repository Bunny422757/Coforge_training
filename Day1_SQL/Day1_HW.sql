/* Assignment 1 */

CREATE DATABASE School;

USE School;

CREATE TABLE Students(StudentID INT PRIMARY KEY,Name VARCHAR(50),Age INT,Gender VARCHAR(10),City VARCHAR(50));


/*Assignment 2*/

insert into Students values(105,'Kiran',22,'Male','Pune');

/*Assignment 3*/

select * from Students;

select Name,City from Students;

select * from Students where Age>=20;

select * from Students where Gender='Female';

select * from Students where City='Hyderabad';

/* Assignment 4*/

select * from Students order by Name asc;

select * from Students order by Age desc;

/*Assignment 5*/

select * from Students where Age between 19 and 21;

select * from Students where Name like 'R%';

select * from Students where City like '%i';

select * from Students where Age in (20,22);

/*Assignment 6*/

update Students set City='Delhi' where Name='Rahul';

update Students set Age=Age+1 where Name='Rahul';

update Students set City='Kolkata' where Name='Sneha';

/*Assignment 7*/

delete from Students where StudentID=105;

delete from Students where City='Chennai';

