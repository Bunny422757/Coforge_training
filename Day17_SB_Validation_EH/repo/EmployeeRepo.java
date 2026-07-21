<<<<<<< HEAD
package com.coforge.ems.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.ems.model.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	public List<Employee> findByEname(String ename);
	public int deleteByEname(String ename);
	public List<Employee> findByDno(int dno);
	public int deleteByDno(int dno);
	
	//Custom Query Methods
	@Query("select eid from Employee")
	public List<Integer> getEids();
	
	@Query("select count(*),sum(esalary),max(esalary),min(esalary) from Employee")
	public String getInfo();
}
=======
package com.coforge.ems.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.ems.model.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	public List<Employee> findByEname(String ename);
	public int deleteByEname(String ename);
	public List<Employee> findByDno(int dno);
	public int deleteByDno(int dno);
	
	//Custom Query Methods
	@Query("select eid from Employee")
	public List<Integer> getEids();
	
	@Query("select count(*),sum(esalary),max(esalary),min(esalary) from Employee")
	public String getInfo();
}
>>>>>>> 9000e4a41b7cba1efe4c4b79e07e5aa2b21e0613
