package com.coforge.day3;

import java.util.Scanner;

public class SumofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		
		int sum = (n*(n+1))/2;
		System.out.println(sum);
		sc.close();
	}

}
