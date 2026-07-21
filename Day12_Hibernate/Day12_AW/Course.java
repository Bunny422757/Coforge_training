<<<<<<< HEAD
package com.coforge.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {

	@Id
	private int cid;
	
	private String cname;
	
	@ManyToMany(mappedBy = "Courses",cascade = CascadeType.ALL)
	private Set<Student> students = new HashSet<>();
	
	public Course() {
		
	}
	
	public Course(int cid, String cname) {
		this.cid = cid;
		this.cname =cname;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
}
=======
package com.coforge.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {

	@Id
	private int cid;
	
	private String cname;
	
	@ManyToMany(mappedBy = "Courses",cascade = CascadeType.ALL)
	private Set<Student> students = new HashSet<>();
	
	public Course() {
		
	}
	
	public Course(int cid, String cname) {
		this.cid = cid;
		this.cname =cname;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
}
>>>>>>> 9000e4a41b7cba1efe4c4b79e07e5aa2b21e0613
