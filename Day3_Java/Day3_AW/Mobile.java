package com.coforge.day3;

public class Mobile {

	String brand;
	String model;
	int ram;
	int price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + ", ram=" + ram + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mb = new Mobile();
		mb.setBrand("One plus");
		mb.setModel("Nord 2");
		mb.setRam(8);
		mb.setPrice(30000);

		System.out.println(mb);
	}

}
