package com.casting.expmple;

import java.util.Scanner;

public class Food {

	public Food serve() {

		Scanner s= new Scanner(System.in);

		System.out.println("enter your choice");

		String choice= s.nextLine();

		System.out.println("your choice is " +choice);

		if (choice.equals("Biriyani")){
			System.out.println("take biriyani");
			return new Biriyani();
		}else if (choice.equals("Dosa")){
			return new Dosa();
		}else if (choice.equals("Noodles")){
			return new Noodles();
		}else 
			System.out.println("invalid data");
		return null;

	}

}
