create database empmanagement;

use empmanagement;

create table dept(deptid int primary key,deptname varchar(30),location varchar(20));

insert into dept values(101,"HR","Hyderabad");
insert into dept values(102,"Finance","Mumbai");
insert into dept values(103,"IT","Bangalore");
insert into dept values(104,"Sales","Chennai");

create table emp(Empid int primary key,Empname varchar(20),Gender varchar(10),Age int,Salary decimal(10,2),Designation varchar(20),
				deptid int,Hiredate date,foreign key(deptid) references dept(deptid));

insert into emp values(1,"Pranav","Male",20,50000,"Software engineer",103,"2026-06-17");
insert into emp values(2,"Bharath","Male",19,70000,"HR manager",101,"2026-05-2");
insert into emp values(3,"Rakesh","Male",21,90000,"Accountant",102,"2026-04-15");
insert into emp values(4,"Nikhil","Male",22,80000,"Sales executive",104,"2026-05-19");
insert into emp values(5,"Sita","Female",23,60000,"Team lead",103,"2026-04-4");

create table attd(attdid int primary key,Empid int,attddate Date,status varchar(30),foreign key (Empid) references emp(Empid));

insert into attd values(1,1,"2026-07-02","Present");
insert into attd values(2,2,"2026-07-02","Present");
insert into attd values(3,3,"2026-07-02","Absent");
insert into attd values(4,4,"2026-07-02","Present");
insert into attd values(5,5,"2026-07-02","Absent");

select * from emp;

select Empname,salary from emp;

select * from emp where salary>=70000;

select * from emp where Age>21;

select * from emp where deptid=(select deptid from dept where deptname="IT");

select * from emp where Gender="Female";

select * from emp where Hiredate>"2022-01-01";

select * from emp order by salary desc;

select count(*) as "Total Employees" from emp;

select max(salary) from emp;

select min(salary) from emp;

select avg(salary) from emp;

select sum(salary) from emp;

select deptid,count(*) as "total emps in each dept" from emp group by deptid;

select avg(salary),deptid from emp group by deptid;

select max(salary),deptid from emp group by deptid;

select Empname,deptname from emp e inner join dept d on e.deptid=d.deptid;

select Empname,deptname,location from emp e inner join dept d on e.deptid=d.deptid;

select e.Empname,a.attddate,a.status from emp e inner join attd a on e.Empid=a.Empid;
use empmanagement;

update emp set salary = salary * 1.10 WHERE deptid = (SELECT deptid FROM dept WHERE deptname = 'IT');

update emp set designation = "Sr Software Engineer" where Empid=1;

update emp set deptid=102 where Empid=1;

delete from emp where salary<60000;

delete from attd where attddate="2026-07-03";

Create View EmpDetails as select e.EmpID,e.EmpName,d.DeptName,e.Salary FROM emp e INNER JOIN dept d ON e.DeptID = d.DeptID;

select * from EmpDetails;

DELIMITER //

Create Procedure GetEmployees()
Begin
    Select * from emp;
end //

DELIMITER ;

call GetEmployees();

