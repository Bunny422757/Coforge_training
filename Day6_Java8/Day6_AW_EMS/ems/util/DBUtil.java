package com.coforge.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
		// Step1 : Loading driver com.mysql.cj.jdbc.Driver

		Class.forName(ApplicationProperties.driver);

		// Step 2 : Connection with JB
		Connection connection = DriverManager.getConnection(ApplicationProperties.url, ApplicationProperties.user,ApplicationProperties.pass);
		
		return connection;
	}

}
