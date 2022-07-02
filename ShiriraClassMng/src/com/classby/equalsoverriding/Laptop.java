package com.classby.equalsoverriding;

public class Laptop {
	String model="lenovo";
	
	@Override
	public int hashCode() {
		return this.model.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		boolean isSame=false;
		
			if (obj instanceof Laptop) {
				// implementation 
				
			Laptop l= (Laptop)obj;
			if (this.model.equals(l.model)) {
				isSame=true;
			}
			
			}
			return isSame;
	
	}

}
