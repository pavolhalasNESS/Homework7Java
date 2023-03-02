package com.homework.books;

public class ForeignBook extends Book {

	private String language;

	public ForeignBook(String name, String author, int numberOfPages, String language) {
		super(name, author, numberOfPages);
		this.language = language;
	}

	public ForeignBook(String name, String author, int numberOfPages) {
		super(name, author, numberOfPages);
		this.language = "English";
	}
}
