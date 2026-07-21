<<<<<<< HEAD
package com.coforge.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	
	@Id
	private int sid;
	
	private String sname;
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "Student_Courses",
        joinColumns = @JoinColumn(name = "sid"),
        inverseJoinColumns = @JoinColumn(name = "cid")
    )
	
	private Set<Course> Courses = new HashSet<>();
	public Student(){
		
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	public Set<Course> getCourses() {
		return Courses;
	}
	public void setCourses(Set<Course> courses) {
		Courses = courses;
	}
	
	

	

}
=======
package com.coforge.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	
	@Id
	private int sid;
	
	private String sname;
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "Student_Courses",
        joinColumns = @JoinColumn(name = "sid"),
        inverseJoinColumns = @JoinColumn(name = "cid")
    )
	
	private Set<Course> Courses = new HashSet<>();
	public Student(){
		
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	public Set<Course> getCourses() {
		return Courses;
	}
	public void setCourses(Set<Course> courses) {
		Courses = courses;
	}
	
	

	

}
>>>>>>> 9000e4a41b7cba1efe4c4b79e07e5aa2b21e0613
