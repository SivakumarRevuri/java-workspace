package com.pgpractice.june21;

import java.util.Scanner;

public class Calmeenu {
	Scanner s =new Scanner(System.in);
	int i=s.nextInt();
	int j=s.nextInt();
	public static void main(String[] args) {
		System.out.println("enter the valuues");

		Calmeenu c=new Calmeenu();
		c.add();
		c.sub();
		c.mul();
		c.div();

	}
	private void add() {
		int x=i;
		int y=j;
		int res=x+y;
		System.out.println("addition"+res);
	}
	private void sub() {
		int x=i;
		int y=j;
		int res=x-y;
		System.out.println("substraction"+res);
	}

	private void mul() {
		int x=i;
		int y=j;
		int res=x*y;
		System.out.println("mltiplication"+res);



	}

	private void div() {
		int x=i;
		int y=j;
		int res=x/y;
		System.out.println("division"+res);


	}


}