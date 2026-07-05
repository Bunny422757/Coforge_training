package com.coforge.day4.assignment;

public class StudentDetails {

	int sid;
	String sname;
	int marks;

	StudentDetails(int sid, String sname, int marks) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}

	void display() {
		System.out.println("Student ID : " + sid);
		System.out.println("Student Name : " + sname);
		System.out.println("Student Marks : " + marks);
	}

	void calculateGrade() {
		if (marks >= 90) {
			System.out.println("A");
		} else if (marks >= 75) {
			System.out.println("B");
		} else if (marks >= 60) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}
}
