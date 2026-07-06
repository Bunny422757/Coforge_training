create database mydatabase;

use mydatabase;

create table tbl_employee(eid int,ename varchar(50),esalary int,dno int);

desc tbl_employee;

insert into tbl_employee values(101,'Ram',10000,10);
insert into tbl_employee values(102,'Suresh',20000,20);
insert into tbl_employee values(103,'Naresh',30000,10);
insert into tbl_employee values(104,'Rahul',40000,20);

set sql_safe_updates=0;

update tbl_employee set ename='Ram' where eid=101;

select * from tbl_employee;

select dno,count(*) as "Total no.of Employees" from tbl_employee group by dno;

select dno,sum(esalary),avg(esalary),min(esalary),max(esalary) from tbl_employee group by dno;

select dno,sum(esalary),avg(esalary),min(esalary),max(esalary) from tbl_employee group by dno having min(esalary)>10000;

select dno,sum(esalary),avg(esalary),min(esalary),max(esalary) from tbl_employee group by dno order by dno desc;

create table tbl_department(dno int,dname varchar(20));

desc tbl_department;

insert into tbl_department values(10,"Development");

insert into tbl_department values(20,"Testing");

select * from tbl_department;

select dname from tbl_department where dno=(select dno from tbl_employee where eid=101);

select * from tbl_employee where dno=(select dno from tbl_department where dname="Testing");

select dname from tbl_department where dno=(select dno from tbl_employee where ename="Ram"); /*single row sub query*/

select dname from tbl_department where dno in(select dno from tbl_employee where eid=101 or eid=102); /*multi row sub query*/

drop table tbl_employee;

create table tbl_employee(eid int primary key,ename varchar(50) not null,esalary int check(esalary>0),email varchar(30) unique,dno int);

insert into tbl_employee values(101,"pranav",-30000,"abc@gail.com",10);-- constraint violated

drop table tbl_employee;
drop table tbl_department;

create table tbl_dept(dno int primary key,dname varchar(30));

create table tbl_emp(eid int primary key,ename varchar(30),esalary int,dno int,foreign key(dno) references tbl_dept(dno)); -- foreign key

insert into tbl_emp values(101,"Ram",10000,10);-- failing because dept table is not yet created but we are inserting the record in emp table,so it check for the reference.

insert into tbl_dept values(10,"Develpoment");

DELIMITER //

create procedure insertEmployee(in eid int,in ename varchar(30),in esalary int,in dno int)
begin
	insert into tbl_emp(eid,ename,esalary,dno) values(eid,ename,esalary,dno);
end //

DELIMITER ;

set sql_safe_updates=0;
update tbl_emp set esalary=10000 where eid=101;

call insertEmployee(101,"Ram",10000,10);

drop procedure insertEmployee;

select * from tbl_emp;

DELIMITER //
create procedure getEmpName(in eid int,out empname varchar(30))
begin
	select ename into empname from tbl_emp e where e.eid=eid;
end //

call getEmpName(101,@empname);
select @empname;

drop procedure getEmpName;

-- joins

create table tbl_agents(agentcode int,agentnames varchar(20),wrkarea varchar(30));

desc tbl_agents;

create table tbl_cust(custcode int,custname varchar(30),custarea varchar(30));

insert into tbl_agents values(104,"agent4","bangalore");

insert into tbl_cust values(205,"customer5","bangalore");

select a.agentnames,c.custname,c.custarea from tbl_agents a join tbl_cust c on a.wrkarea=c.custarea;

select a.agentnames,c.custname,c.custarea from tbl_agents a join tbl_cust c on a.wrkarea<>c.custarea;

select a.agentnames,c.custname,c.custarea from tbl_agents a inner join tbl_cust c on a.wrkarea=c.custarea;

-- now will use outer joins,so will insert irrelevant records 

insert into tbl_agents values(105,"agent5","New york");

insert into tbl_cust values(206,"customer6","delhi");

select * from tbl_agents a left outer join tbl_cust c on a.wrkarea=c.custarea;

select * from tbl_agents a right outer join tbl_cust c on a.wrkarea=c.custarea;

select * from tbl_agents a full join tbl_cust c on a.wrkarea=c.custarea;
desc tbl_emp;

select * from tbl_emp;
insert into tbl_emp values(102,"Pranav",60000,20);

select * from tbl_dept;
