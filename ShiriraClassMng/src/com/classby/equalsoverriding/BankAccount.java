package com.classby.equalsoverriding;

public class BankAccount {

	String name;
	long acNo;
	@Override
	public int hashCode() {
		Long l= new Long(this.acNo);
		return -1;
	}
	@Override
	public boolean equals(Object obj) {

		boolean isSame=false;
	if (obj instanceof BankAccount) {
		BankAccount b= (BankAccount)obj;
		if (this.acNo==b.acNo) {
			isSame= true;
		}
	}
	return isSame;
	
	}
}
