package com.coforge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcInsert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Step1 : Loading driver com.mysql.cj.jdbc.Driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2 : Connection with JB
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root",
				"Pranav@2409");

		// Step 3 : Creating Statement
		String sql = "insert into tbl_emp values(?, ?, ?, ?) ";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		//Step 4 : Execute query
		statement.setInt(1, 102);
		statement.setString(2, "pranav");
		statement.setInt(3, 60000);
		statement.setInt(4, 10);

		
		int n = statement.executeUpdate(); //Insert, delete, update
		
		if (n == 1) {
			System.out.println("Employee Details Saved");
		}else {
			System.out.println("Employee details not saved");
		}
		
		//Step 5 : Closing
		
		statement.close();
		connection.close();
	}

}
