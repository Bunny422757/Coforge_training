package com.coforge.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
		// Step1 : Loading driver com.mysql.cj.jdbc.Driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2 : Connection with JB
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root",
				"Pranav@2409");
		
		return connection;
	}

}
