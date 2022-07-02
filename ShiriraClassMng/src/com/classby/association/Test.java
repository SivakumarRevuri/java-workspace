package com.classby.association;

public class Test {
	public static void main(String[] args) {
		Student s= new Student();
		System.out.println(s.age=21);
		System.out.println(s.name="meenu");		
		System.out.println(s.per=69);
		s.m=new Mobile();
		System.out.println(s.m.color="Black");
		System.out.println(s.m.model="lenovo");
		System.out.println(s.m.price=12000);
		s.m.sengSMS();
		s.m.playGame();
		s.m.mc= new MobileCover();
		s.m.mc.color="white";
		s.m.mc.price=200;
	}

}
