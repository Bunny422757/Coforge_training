package com.coforge.ems.util;

public class ApplicationProperties {
// Database constants
	
	public static final String driver = "com.mysql.cj.jdbc.Driver";
	
	public static final String url = "jdbc:mysql://localhost:3306/mydatabase";
	
	public static final String user = "root";
	
	public static final String pass = "Pranav@2409";
	
	//Database Sql Queries
	
	public static final String insertSql = "insert into tbl_emp values (?, ?, ?, ?)";
	public static final String updateSql = "update tbl_emp set ename = ?,esalary = ?,dno = ? where eid = ?";
	public static final String deleteSql = "delete from tbl_emp where eid = ?";

	public static final String insertSuccess = "SUCCESS : Employee Record Inserted";
	public static final String updateSuccess = "SUCCESS : Employee Record Updated";
	public static final String deleteSuccess = "SUCCESS : Employee Record Deleted";
	
	public static final String validationFailed = "Invalid Employee Object or Details";
	
	public static final String findAllSql = "select * from tbl_emp ";
	
	public static final String findSql = "select * from tbl_emp where eid = ?";
	
	public static final String dbFailed = "FAILED : DB Error";

	

}
