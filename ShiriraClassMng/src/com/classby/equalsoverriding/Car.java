package com.classby.equalsoverriding;

public class Car {
	String regno;
	@Override
	public int hashCode() {
		return this.regno.hashCode();
	}
	@Override
	public boolean equals(Object obj) {

		boolean isSame=false;
	if (obj instanceof Car) {
		Car c= (Car)obj;
		if (this.regno.equals(c.regno)) {
			isSame=false;
			
		}
	}
	return isSame;
	
	}

}
