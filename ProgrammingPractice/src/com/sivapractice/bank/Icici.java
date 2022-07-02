package com.sivapractice.bank;

public class Icici implements Rbi
{

	double r;
	public Icici(int i) {
		super();
		this.r=i;

	}

	@Override
	public double getInterest() {

		return r;
	}

	@Override
	public String toString() {
		
		
		return "IcIci bank interest is:  "+r;
	}
}
