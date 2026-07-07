package com.coforge.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.coforge.ems.model.Employee;
import com.coforge.ems.util.ApplicationProperties;
import com.coforge.ems.util.DBUtil;

public class EmployeeDAO {
	public int createEmployee(Employee employee) throws SQLException, ClassNotFoundException {
		int n = 0;
		Connection connection = DBUtil.getDBConnection();

		PreparedStatement statement = connection.prepareStatement(ApplicationProperties.insertSql);
		statement.setInt(1, employee.getEid());
		statement.setString(2, employee.getEname());
		statement.setInt(3, employee.getEsalary());
		statement.setInt(4, employee.getDno());

		n = statement.executeUpdate();

		return n;
	}

	public int updateEmployee(Employee employee) throws SQLException, ClassNotFoundException {

		int n = 0;
		Connection connection = DBUtil.getDBConnection();

		String sql = "update tbl_emp set ename=?, esalary=?, dno=? where eid=?";
		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setString(1, employee.getEname());
		statement.setInt(2, employee.getEsalary());
		statement.setInt(3, employee.getDno());
		statement.setInt(4, employee.getEid());

		n = statement.executeUpdate();

		return n;
	}

	public int deleteEmployee(int eid) throws SQLException, ClassNotFoundException {

		int n = 0;
		Connection connection = DBUtil.getDBConnection();

		String sql = "delete from tbl_emp where eid=?";
		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setInt(1, eid);

		n = statement.executeUpdate();

		return n;
	}

	public List<Employee> findAllEmployee() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		List<Employee> employeeList = new ArrayList<>();

		Connection connection = DBUtil.getDBConnection();

		PreparedStatement statement = connection.prepareStatement(ApplicationProperties.findAllSql);

		ResultSet resultSet = statement.executeQuery();

		while (resultSet.next()) {
			Employee employee = new Employee();
			employee.setEid(resultSet.getInt("eid"));
			employee.setEname(resultSet.getString("ename"));
			employee.setEsalary(resultSet.getInt("esalary"));
			employee.setDno(resultSet.getInt("dno"));

			employeeList.add(employee);
		}
		return employeeList;

	}

	public Employee findEmployee(int id) throws SQLException, ClassNotFoundException  {
		// TODO Auto-generated method stub
		
		Connection connection = DBUtil.getDBConnection();
		
		PreparedStatement statement = connection.prepareStatement(ApplicationProperties.findSql);
		
		statement.setInt(1,id);
		
		ResultSet result = statement.executeQuery();
		
		Employee employee = null;
		
		if(result.next()) {
			employee = new Employee( result.getInt("eid"),result.getString("ename"), result.getInt("esalary"), result.getInt("dno"));
		}
		
		return employee;
	}

}
