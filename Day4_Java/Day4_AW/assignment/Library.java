package com.coforge.day4.assignment;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryStatus library = new LibraryStatus();

		Book book1 = new Book(1, "Java Programming");
		Book book2 = new Book(2, "Python");

		library.addBook(book1);
		library.addBook(book2);

		library.searchBook("Java Programming");
		Member m = new Member(1, "Pranav");

		library.issueBook(1, m);
		library.returnBook(2, m);

	}

}
