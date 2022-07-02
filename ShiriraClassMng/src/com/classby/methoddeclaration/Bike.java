package com.classby.methoddeclaration;

public class Bike {

	String model = "pulser";

	void startAndMove(Fuel f){

		System.out.println("fuel filled " + new Fuel().type);

		/* Fuel f = new Fuel();
	 System.out.println("fuel filled " + f.type);
		 */
		System.out.println(this.model+ " bike started ");

	}

}
