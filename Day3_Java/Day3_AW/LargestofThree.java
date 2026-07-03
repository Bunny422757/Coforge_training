package com.coforge.day3;

import java.util.Scanner;

public class LargestofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Three Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("Largest number is : " + a);
		} else if (b > a && b > c) {
			System.out.println("Largest number is : " + b);
		} else {
			System.out.println("Largest number is : " + c);
		}
		sc.close();
	}	

}
