package com.coforge.day3;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int n = sc.nextInt();

		int c = 1;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if (c > 2) {
			System.out.println("Number is not Prime");
		} else {
			System.out.println("Number is Prime");
		}
		sc.close();
	}

}
