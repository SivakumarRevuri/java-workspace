package com.hashset;

public class Car {
	String regNum;
	String model;

	public Car(String regNum,String model) {
		this.regNum=regNum;
		this.model=model;
	}
	@Override
	public int hashCode() {
		return 52563;
	}
	@Override
	public boolean equals(Object obj) {
		boolean isSame=false;
		if (obj instanceof Car) {
			Car c= (Car)obj;
			if (this.regNum==c.regNum) {
				isSame=true;
			}
		}
		return isSame;
	}
	@Override
	public String toString() {
		return (this.model+"       registration number is: "+this.regNum);
	}

}
