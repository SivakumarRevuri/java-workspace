package com.pgpractice.june21;

import java.util.Scanner;

public class Student {
	Scanner s= new Scanner(System.in);
	
	String name=s.next();
	int age=s.nextInt();
	String qualification=s.next();
	long phoneno=s.nextLong();
public static void main(String[] args) {
	System.out.println("enter the data");
	Student s= new Student();
	System.out.println("Student name is "+s.name);
	System.out.println("Student age"+s.age);
	System.out.println("Sudent qualification is "+s.qualification);
	System.out.println("student mobile no"+s.phoneno);	
}
}
