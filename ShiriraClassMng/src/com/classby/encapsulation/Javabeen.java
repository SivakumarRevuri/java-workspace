package com.classby.encapsulation;

public class Javabeen {
	private String name;
	private int age;
	private double per;
	private String describe;
	// setter methods
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
		if(age>0&&age<100){
		}else
			System.out.println("enter the proper age");
		System.out.println();
	}
	public void setPer(double per) {
		this.per = per;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	// getter methods
	public String getName() {
		System.out.println(name);
		return name;
	}
	public int getAge() {
		System.out.println(age);
		return age;
	}	
	public double getPer() {
		System.out.println(per);
		return per;
	}	
	public String getDescribe() {
		System.out.println(describe);
		return describe;
	}
}
