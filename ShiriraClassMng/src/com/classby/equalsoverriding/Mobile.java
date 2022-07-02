package com.classby.equalsoverriding;

public class Mobile {
	String model;
	@Override
	public int hashCode() {

	return this.model.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean isSame=false;
		if (obj instanceof Mobile) {

			Mobile m=(Mobile)obj;
			if (this.model.equals(m.model)) {
				isSame=true;				
			}
		
		}
		return isSame;
	}

}
