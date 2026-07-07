package com.coforge.day6.java8;

interface MyInterface {
	public void myMethodOne();

	public default void myMethodTwo() {
		System.out.println("Default");
	}

	public static void myMethodThree() {
		System.out.println("Static");
	}
}

public class Java8InterfaceTest implements MyInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void myMethodOne() {
		System.out.println("Abstract Method");
	}

	@Override
	public default void myMethodTwo() {
		System.out.println("Default Method");
	}

	
	public static void myMethodThree() {
		System.out.println("Static Method");
	}

}
