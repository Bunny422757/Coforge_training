package com.coforge.day3;

public class Product {

	int pid;
	String pname;
	int price;
	int quantity;

	public Product(int pid, String pname, int price, int quantity) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}

	public int calculate() {
		int total = price * quantity;
		return total;
	}

	public void display() {
		System.out.println("Total Bill : " + calculate());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pd = new Product(101, "Laptop", 55000, 2);
		pd.calculate();
		pd.display();
	}

}
