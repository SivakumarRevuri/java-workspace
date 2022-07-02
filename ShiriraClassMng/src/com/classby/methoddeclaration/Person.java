package com.classby.methoddeclaration;

public class Person {

	private void eat(Fruit f) {

	}
	public static void main(String[] args) {
		System.out.println("app start");

		Person p= new Person();

		p.eat(new Fruit());

		//new Person().eat(new Fruit());
		System.out.println("person eats the fruit");
		System.out.println("app end");
	}
}
