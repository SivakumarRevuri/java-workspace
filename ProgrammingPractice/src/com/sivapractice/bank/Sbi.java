package com.sivapractice.bank;

public class Sbi implements Rbi
{

	int r;
	public Sbi(int i) {
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

		
		return "sbi bank interest is:  "+r;
	} 
}
