package com.coforge.day4.assignment;

public class Book {

	int bookId;
	String bookName;
	boolean issued;

	public Book(int bookId, String bookName) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.issued = false;
	}
}
