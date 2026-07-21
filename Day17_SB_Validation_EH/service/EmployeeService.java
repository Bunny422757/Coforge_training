<<<<<<< HEAD
package com.coforge.ems.service;

import java.util.List;

import java.util.Optional;

import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.model.Employee;

public interface EmployeeService {

	public boolean saveEmployee(Employee employee);

	public boolean UpdateEmployee(int eid, Employee employee);
	
	public boolean deleteEmployee(int eid);
	
	public Optional<Employee> findEmployee(int eid);
//
	public List<Employee> findAllEmployee();
//
	public List<Employee> findByEname(String ename);
//
	public boolean deleteByEname(String ename);
//
	public List<Integer> getEidsList();
//
//	public String getInfoList();

}
=======
package com.coforge.ems.service;

import java.util.List;

import java.util.Optional;

import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.model.Employee;

public interface EmployeeService {

	public boolean saveEmployee(Employee employee);

	public boolean UpdateEmployee(int eid, Employee employee);
	
	public boolean deleteEmployee(int eid);
	
	public Optional<Employee> findEmployee(int eid);
//
	public List<Employee> findAllEmployee();
//
	public List<Employee> findByEname(String ename);
//
	public boolean deleteByEname(String ename);
//
	public List<Integer> getEidsList();
//
//	public String getInfoList();

}
>>>>>>> 9000e4a41b7cba1efe4c4b79e07e5aa2b21e0613
