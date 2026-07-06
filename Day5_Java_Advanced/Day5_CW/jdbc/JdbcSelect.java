package com.coforge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcSelect {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Step1 : Loading driver com.mysql.cj.jdbc.Driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2 : Connection with JB
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root",
				"Pranav@2409");

		// Step 3 : Creating Statement
		String sql = "select * from tbl_emp ";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		ResultSet res=statement.executeQuery();
		
		while (res.next()) {
			System.out.print(res.getInt("eid") + "  " + res.getString("ename") + " " + res.getInt("esalary") + " " + res.getInt("dno"));
			System.out.println();
		}
		//Step 5 : Closing
		res.close();
		statement.close();
		connection.close();
	}

}
