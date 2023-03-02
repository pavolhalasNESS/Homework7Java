package com.homework.subscriber;

import java.time.LocalDate;
import com.homework.books.Book;

public class Borrowing {

	private Book book;
	private Subscriber subscriber;
	private LocalDate borrowStarted;
	private LocalDate borrowEnded;

	public Borrowing(Book book, Subscriber subscriber, LocalDate borrowStarted) {
		this.book = book;
		this.subscriber = subscriber;
		this.borrowStarted = borrowStarted;
	}

	public Borrowing(Book book, Subscriber subscriber, LocalDate borrowStarted, LocalDate borrowEnded) {
		this(book, subscriber, borrowStarted);
		this.borrowEnded = borrowEnded;
	}

	public void setReturnDate(LocalDate date) {
		this.borrowEnded = date;
	}

	@Override
	public String toString() {
		return book + "\n" + "Pozicka zacala: " + borrowStarted + "\n" + "Pozicanie konci: " + borrowEnded;
	}

}
