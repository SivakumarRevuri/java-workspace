package com.sivapractice.bank;

public class Axis implements Rbi
{

	double r;
	public Axis(int i) {
		super();
		this.r=i;
	}

	@Override
	public double getInterest() 
	{
		return r;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Axis bank interset is:  "+r;
	}
}
