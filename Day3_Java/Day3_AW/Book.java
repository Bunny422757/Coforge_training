package com.coforge.day3;

import java.util.Scanner;

public class Book {

	int bid;
	String title;
	String author;
	int price;

	public Book(int bid, String title, String author, int price) {
		this.bid = bid;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void display() {
		System.out.println("BookID = " + bid);
		System.out.println("BookTitle = " + title);
		System.out.println("BookAuthor = " + author);
		System.out.println("BookPrice = " + price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Book bk = new Book(1, "The MadMax", "Robert", 10000);
		bk.display();
		sc.close();
	}

}
