package com.homework.books;

public class Book {

	private String name;
	private String author;
	private int numberOfPages;

	public Book(String name, String author, int numberOfPages) {
		this.name = name;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "Meno knihy: " + name + "\n" + "Meno autora: " + author + "\n" + "Pocet stran: " + numberOfPages;
	}

}
