package com.coforge.day4.abstraction;

public class VehicleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bike b = new Bike();
//		b.noOfWheeles();
//		b.brandName();
//		b.noOfEngines();
//
//		Scooty s = new Scooty();
//		s.noOfWheeles();
//		s.brandName();
//		s.noOfEngines();
		
		VehiclePlan vehicle;
		vehicle=new Bike();
		vehicle.noOfWheeles();
		vehicle.brandName();
		vehicle.noOfEngines();
		
		vehicle =new Scooty();
		vehicle.noOfWheeles();
		vehicle.brandName();
		vehicle.noOfEngines();
	}

}
