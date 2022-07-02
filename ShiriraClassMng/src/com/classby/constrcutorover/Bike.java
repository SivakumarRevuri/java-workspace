package com.classby.constrcutorover;

public class Bike {
	
	String model;
	int price;
	String company;
	
	public Bike(String mdl,int pr,String com ) {
		this.model=mdl;
		this.price=pr;
		this.company=com;	
		System.out.println(mdl);
		System.out.println(mdl);
		System.out.println(mdl);
	}
	public Bike() {
	}
	public static void main(String[] args) {
		Bike b= new Bike("royal", 493272,"enfield");
		b.company="fz";
		
		System.out.println(b.company);
		
		Bike b1=new Bike();
		b1.company
		
	}

}
