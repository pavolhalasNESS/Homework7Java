package com.homework.books;

public class ScientificBook extends Book {

	private String scientificArea;

	public ScientificBook(String name, String author, int numberOfPages, String scientificArea) {
		super(name, author, numberOfPages);
		this.scientificArea = scientificArea;
	}
}