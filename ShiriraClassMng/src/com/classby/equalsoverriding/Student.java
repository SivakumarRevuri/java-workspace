package com.classby.equalsoverriding;

public class Student {
	String name;
	int id;
	double perc;
	@Override
	public int hashCode() {
		
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		
		boolean isSame=false;
		Student s= (Student)obj;
		if (s.id==this.id) {
			isSame=true;			
		}		
		
		return isSame;
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.id=23;
		Student s2= new Student();
		s2.id=24;
		System.out.println(s1.equals(s2));
	}

}
