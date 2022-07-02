package com.sivapractice.bank;

public class Hdfc implements Rbi
{

	double r;
	public Hdfc(int i) {
		super();
		this.r=i;

	}

	@Override
	public double getInterest() {
		return r;

	}

	@Override
	public String toString() {

		return "Hdfc bank interset is:" +r;
	}
}
