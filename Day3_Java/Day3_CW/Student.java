package com.coforge.day3;

public class Student {
	private int stid;
	private String sname;
	private String semail;

	public void Student(int stid, String ename) {

	}

	public Student(int stid, String sname, String semail) {
		super();
		this.stid = stid;
		this.sname = sname;
		this.semail = semail;
	}

	@Override
	public String toString() {
		return "Student [stid=" + stid + ", sname=" + sname + ", semail=" + semail + "]";
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
