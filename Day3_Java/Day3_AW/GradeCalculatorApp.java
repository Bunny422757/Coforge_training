package com.coforge.day3;

import java.util.Scanner;

public class GradeCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the marks between (0-100) : ");
		int n = sc.nextInt();

		if (n >= 90 && n <= 100) {
			System.out.println("A");
		} else if (n >= 80 && n <= 89) {
			System.out.println("B");
		} else if (n >= 70 && n <= 79) {
			System.out.println("C");
		} else if (n >= 60 && n <= 69) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
		sc.close();
	}

}
