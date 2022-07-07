package com.practice.exceptionhandling;

import java.util.Scanner;

import com.practice.ScannerClass;

class User{
	String userEmail;
	String password;
	
	public User() {
		super();
	}
	public User(String mail, String password) {
		this.userEmail = mail;
		this.password = password;
	}
	
}

public class HandleNullPointerException {

	public static void main(String[] args) {
		System.out.println("Please enter mail: ");
		Scanner scanner = ScannerClass.getInstance();
		String mail = scanner.nextLine();
		System.out.println("Please enter the password: ");
		String password = scanner.nextLine();
		
		userLogin(mail, password);
	}

	private static void userLogin(String mail, String password) {
		if (mail == null || password == null) {
			throw new NullPointerException("Please enter the details");
		}
		System.out.println("User Loged In Successfully");
		// TO DO: add regex pattern and validate mail 
	}
}
