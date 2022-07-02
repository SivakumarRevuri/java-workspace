package com.linkedlist;

public class City {

	String name;
	int pin;
	public City(String name,int pin) {
		this.name=name;
		this.pin= pin;	
	}
	@Override
	public int hashCode() {
		return this.pin;
	}
	@Override
	public boolean equals(Object obj) {
		boolean isSame=false;
		if (obj instanceof City) {
			City c= (City)obj;
			if (this.pin==c.pin) {
				isSame=true;
			}
		}
		return isSame;
	}
	@Override
	public String toString() {
		return (this.name+" city pincode is:  "+this.pin);
	}
}
