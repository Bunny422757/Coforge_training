package com.coforge.day3;

import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to know its table : ");
		int n = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
		sc.close();
	}

}
