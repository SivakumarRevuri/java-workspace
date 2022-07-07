package com.practice.jdbc.model;

public class User {

	private String name;
	private int age;
	private double salary;
	private String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSal() {
		return salary;
	}
	public void setSal(double sal) {
		this.salary = sal;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
	    return "User [name=" + name + ", age=" + age + ", salary=" + salary + ", phone=" + phone + "]";
	}
	
}
