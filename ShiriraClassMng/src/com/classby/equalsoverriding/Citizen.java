package com.classby.equalsoverriding;

public class Citizen {
	String name;
	long adNo;
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {

	boolean isSame=false;
	Citizen c= (Citizen)obj;
	
	if (this.adNo==c.adNo) {
		isSame=true;
	}
	
	
	return isSame;
	
	}

}
