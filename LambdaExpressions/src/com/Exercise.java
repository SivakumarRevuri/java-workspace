package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise {

	public static void main(String[] args) {
		List<Person>  personList =  Arrays.asList(
					new Person("Charles", "Dickens", 60),
					new Person("Lewis", "Carroll", 42),
					new Person("Thomas", "Carlyel", 51),
					new Person("Charlotte", "Bronte", 45),
					new Person("Mathew", "Arnold", 39)
				);
		Collections.sort(personList, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});
		printListData(personList);
		System.out.println("=================================================");
		printDataWithLastNameC(personList);
	}

	private static void printDataWithLastNameC(List<Person> personList) {
		for (Person person : personList) {
			if (person.getLastName().startsWith("C")) {
				System.out.println(person);
			}
		}
	}

	private static void printListData(List<Person> personList) {
		for (Person person : personList) {
			System.out.println(person);
		}
	}
	
}
