package com.coforge.ems.controller;

import java.sql.SQLException;
import java.util.List;

import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;

public class EmployeeController {
	private EmployeeService service = new EmployeeService();
	
	public String createEmployee(Employee employee) {
		String result = " ";
		
		try {
			int n = service.createEmployee(employee);
			if (n == 1)
				result = "SUCCESS : Employee Record Inserted";
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    result = "FAILED : " + e.getMessage();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    result = "FAILED : " + e.getMessage();
		} catch (InvalidEmployeeObjectException e) {
			// TODO Auto-generated catch block
			result = "FAILED : " + e;
		}
		
		return result;
	}
	
	public String updateEmployee(Employee employee) {
		String result = " ";

		try {
			int n = service.updateEmployee(employee);
			if (n == 1)
				result = "SUCCESS : Employee Record Updated";
			else
				result = "FAILED : Employee Record Not Updated";
		} catch (ClassNotFoundException e) {
			result = "FAILED : DB Error";
		} catch (SQLException e) {
			result = "FAILED : DB Error";
		} catch (InvalidEmployeeObjectException e) {
			result = "FAILED : " + e;
		}

		return result;
	}
	
	public String deleteEmployee(int eid) {
		String result = " ";

		try {
			int n = service.deleteEmployee(eid);
			if (n == 1)
				result = "SUCCESS : Employee Record Deleted";
			else
				result = "FAILED : Employee Record Not Found";
		} catch (ClassNotFoundException e) {
			result = "FAILED : DB Error";
		} catch (SQLException e) {
			result = "FAILED : DB Error";
		}

		return result;
	}
	
	public Employee findEmployee(int eid) {
		Employee employee = null;

		try {
			employee = service.findEmployee(eid);
		} catch (ClassNotFoundException e) {
			System.out.println("DB Error");
		} catch (SQLException e) {
			System.out.println("DB Error");
		}

		return employee;
	}
	
	public List<Employee> findAllEmployees() {
		List<Employee> employees = null;

		try {
			employees = service.findAllEmployees();
		} catch (ClassNotFoundException e) {
			System.out.println("DB Error");
		} catch (SQLException e) {
			System.out.println("DB Error");
		}

		return employees;
	}

}
