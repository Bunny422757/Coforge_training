package com.coforge.day4.abstraction;

public class Triangle extends Figure {
	public Triangle() {
		super(10L, 20L);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Triangle : " + (0.5 * getBase() * getHeight()));
	}

}
