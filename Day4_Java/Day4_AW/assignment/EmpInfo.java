package com.coforge.day4.assignment;

public class EmpInfo {

	int empid;
	String empname;
	double esalary;

	public EmpInfo(int empid, String empname, double esalary) {
		this.empid = empid;
		this.empname = empname;
		this.esalary = esalary;

	}

	public double annual() {
		return esalary * 12;
	}

	void display() {
		System.out.println("Emp ID : " + empid);
		System.out.println("Emp Name : " + empname);
		System.out.println("Emp Salary : " + esalary);
		System.out.println("Annual Salary : " + annual());
	}

}
