package com.sivapractice.bank;

public class Main 
{

	public static void main(String[] args) 
	{
		Rbi[] r= {new Sbi(5),new Hdfc(8), new Axis(9), new Icici(10)};
		
		
		for (int i = 0; i < r.length; i++) 
		{
			System.out.println(r[i]+"------>"+r[i].getInterest());
		}
		
		
	}
	
}
