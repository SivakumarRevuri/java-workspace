package com.classby.instancemethod;

public class Person {

	void eat() {
		washHands();
		arrangePlates();
		serveFood();
		keepPlateInShrink();
	}
	void  washHands() {
		System.out.println("wash hands before you eat");

	}
	void arrangePlates() {
		System.out.println("arrange plates ");

	}
	void serveFood() {
		System.out.println("serve food");

	}
	void keepPlateInShrink() {
		System.out.println("keep plates in shrink");

	}
	public static void main(String[] args) {
		Person p =new Person();
		p.eat();
		
	}

}
