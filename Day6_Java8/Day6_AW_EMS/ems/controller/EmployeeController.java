package com.coforge.ems.controller;

import java.sql.SQLException;

import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;
import com.coforge.ems.util.ApplicationProperties;

public class EmployeeController {
	private EmployeeService service = new EmployeeService();

	public String createEmployee(Employee employee) {
		String result = " ";

		try {
			int n = service.createEmployee(employee);
			if (n == 1)
				result = ApplicationProperties.insertSuccess;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			result = ApplicationProperties.dbFailed + e;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			result = ApplicationProperties.dbFailed + e ;
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
				result = ApplicationProperties.updateSuccess;
			else
				result = ApplicationProperties.dbFailed;
		} catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed;
		} catch (SQLException e) {
			result = ApplicationProperties.dbFailed;
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
				result = ApplicationProperties.deleteSuccess;
			else
				result = ApplicationProperties.dbFailed;
		} catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed;
		} catch (SQLException e) {
			result = ApplicationProperties.dbFailed;
		}

		return result;
	}

	public String findEmployee(int eid) {

		String result = "";
		try {
			result = service.findEmployee(eid).toString();
		} catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed + e;
		} catch (SQLException e) {
			result = ApplicationProperties.dbFailed + e;
		} catch (InvalidEmployeeObjectException e) {
			result = e.toString();
		}
		return result;

	}

	public String findAllEmployee() {
		// TODO Auto-generated method stub
		String result = " ";

		try {
			try {
				result = service.findAllEmployee().toString();
			} catch (InvalidEmployeeObjectException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			result = "FAILED : DB Error";
		} catch (SQLException e) {
			result = "FAILED : DB Error";
		}

		return result;

	}

}
