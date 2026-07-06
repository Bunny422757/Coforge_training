package com.coforge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcUpdate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Step1 : Loading driver com.mysql.cj.jdbc.Driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2 : Connection with JB
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root",
				"Pranav@2409");

		// Step 3 : Creating Statement
		String sql = "update tbl_emp set eid = ? where eid = ? ";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		//Step 4 : Execute query
		statement.setInt(1, 110);
		statement.setInt(2, 102);

		
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
