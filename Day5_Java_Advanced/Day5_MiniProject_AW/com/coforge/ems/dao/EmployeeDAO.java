package com.coforge.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.coforge.ems.model.Employee;
import com.coforge.ems.util.DBUtil;

public class EmployeeDAO {
	public int createEmployee(Employee employee) throws SQLException,ClassNotFoundException {
		int n=0;
		Connection connection = DBUtil.getDBConnection();
		
		String sql = "insert into tbl_emp values (?, ?, ?, ?)";
		PreparedStatement statement = connection.prepareStatement(sql);
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
	
	public Employee findEmployee(int eid) throws SQLException, ClassNotFoundException {

		Employee employee = null;

		Connection connection = DBUtil.getDBConnection();

		String sql = "select * from tbl_emp where eid=?";
		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setInt(1, eid);

		ResultSet rs = statement.executeQuery();

		if (rs.next()) {

			employee = new Employee(
					rs.getInt("eid"),
					rs.getString("ename"),
					rs.getInt("esalary"),
					rs.getInt("dno"));
		}

		return employee;
	}
	
	public List<Employee> findAllEmployees() throws SQLException, ClassNotFoundException {

		List<Employee> employees = new ArrayList<>();

		Connection connection = DBUtil.getDBConnection();

		String sql = "select * from tbl_emp";
		PreparedStatement statement = connection.prepareStatement(sql);

		ResultSet rs = statement.executeQuery();

		while (rs.next()) {

			Employee employee = new Employee(
					rs.getInt("eid"),
					rs.getString("ename"),
					rs.getInt("esalary"),
					rs.getInt("dno"));

			employees.add(employee);
		}

		return employees;
	}


}
