<<<<<<< HEAD
package com.coforge.pms.model;

public class Product {
	private int pid;
	private String pname;
	private int pprice;
	private int pqnt;
	
	public Product(int pid, String pname, int pprice, int pqnt) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.pqnt = pqnt;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public int getPqnt() {
		return pqnt;
	}
	public void setPqnt(int pqnt) {
		this.pqnt = pqnt;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pqnt=" + pqnt + "]";
	}
	
	

}
=======
package com.coforge.pms.model;

public class Product {
	private int pid;
	private String pname;
	private int pprice;
	private int pqnt;
	
	public Product(int pid, String pname, int pprice, int pqnt) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.pqnt = pqnt;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public int getPqnt() {
		return pqnt;
	}
	public void setPqnt(int pqnt) {
		this.pqnt = pqnt;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pqnt=" + pqnt + "]";
	}
	
	

}
>>>>>>> 9000e4a41b7cba1efe4c4b79e07e5aa2b21e0613
