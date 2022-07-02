package com.classby.association;

public class Driver {

	String name="shiva";
	Car cr;
	public static void main(String[] args) {
		Car c= new Car();
		c.model="benz";
		Driver d= new Driver();
		d.cr=c;
		System.out.println(d.cr);
		System.out.println(c.model);
	}
}

