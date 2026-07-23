package com.coforge.dms.model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_dept")
public class Department {

	@Id
	@Column(name="dno",length=5)
	@NotNull
	private int dno;

	@Column(name="dname",length=20)
	@NotBlank
	private String dname;

	public Department(int dno, String dname) {
		super();
		this.dno = dno;
		this.dname = dname;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dname=" + dname + "]";
	}

	
}
