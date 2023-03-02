package com.homework.main;

import com.homework.books.*;
import com.homework.subscriber.*;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

		Book physics = new ScientificBook("Basics of Gravity", "Isaac Newton", 200, "Physics");
		Book serbian = new ForeignBook("Orlovi Rano Lete", "Branko Copic", 120, "Serbian");
		Book slovak = new Book("Zart", "Milan Kunera", 120);
		Book english = new ForeignBook("Love in the time of Cholera", "Gabriel Garcia Marquez", 120);
		SubscriberAddress johnCarrotAddress = new SubscriberAddress("Hlavna", 17, "Kosice", "Slovakia", 4001);
		Subscriber johnCarrot = new Subscriber("John", "Carrot", johnCarrotAddress, "john.carrot@gmail.com", 25);
		Borrowing borrowing1 = new Borrowing(physics, johnCarrot, LocalDate.now());
		borrowing1.setReturnDate(LocalDate.now());

		System.out.println("****************************************");
		System.out.println("Vsetky knihy");
		System.out.println("****************************************");
		System.out.println(physics);
		System.out.println("-------------------------");
		System.out.println(serbian);
		System.out.println("-------------------------");
		System.out.println(slovak);
		System.out.println("-------------------------");
		System.out.println(english);
		System.out.println("****************************************");
		System.out.println("Pozicka");
		System.out.println("****************************************");
		System.out.println(borrowing1);
		System.out.println("****************************************");
		System.out.println("Detaily o subscriberovi");
		System.out.println("****************************************");
		System.out.println(johnCarrot);
		System.out.println(johnCarrotAddress);

	}
}
