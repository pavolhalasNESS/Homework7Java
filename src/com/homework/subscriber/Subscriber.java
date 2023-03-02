package com.homework.subscriber;

public class Subscriber {

	private SubscriberAddress subscriberAddress;
	private String firstName;
	private String lastName;
	private String email;
	private int age;

	public Subscriber(String firstName, String lastName, SubscriberAddress subscriberAddress, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.subscriberAddress = subscriberAddress;
		this.email = email;
	}

	public Subscriber(String firstName, String lastName, SubscriberAddress subscriberAddress, String email, int age) {
		this(firstName, lastName, subscriberAddress, email);
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cele meno: " + firstName + " " + lastName + "\n" + "Email: " + email;
	}

}