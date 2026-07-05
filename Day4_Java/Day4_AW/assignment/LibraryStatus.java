package com.coforge.day4.assignment;

import java.util.ArrayList;

public class LibraryStatus {

	ArrayList<Book> books = new ArrayList<>();

	void addBook(Book book) {
		books.add(book);
		System.out.println(book.bookName + " Added Successfully");

	}

	void issueBook(int bid, Member member) {
		for (Book b : books) {
			if (b.bookId == bid && !b.issued) {
				b.issued = true;
				System.out.println("Book Issued to : " + member.memName);
				return;
			}
		}
		System.out.println("Book cannot be issued");
	}

	void returnBook(int bid, Member member) {
		for (Book b : books) {
			if (b.bookId == bid && b.issued) {
				b.issued = false;
				System.out.println("Book returned to : " + member.memName);
				return;
			}
		}
		System.out.println("Book cannot be returned");
	}

	void searchBook(String bname) {
		for (Book b : books) {
			if (b.bookName.equalsIgnoreCase(bname)) {
				System.out.println("Book Found");
				System.out.println("Book ID : " + b.bookId);
				System.out.println("Book Name : " + b.bookName);
				System.out.println("Issued : " + b.issued);
				return;
			}
		}
		System.out.println("Book Not Found");
	}

}
