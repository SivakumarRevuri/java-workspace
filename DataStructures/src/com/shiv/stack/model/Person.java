package com.shiv.stack.model;

public class Person {

	private long id;
	private String name;
	private String city;
	private String mobile;

	public Person() {
		super();
	}

	public Person(long id, String name, String city, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.mobile = mobile;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + ", mobile=" + mobile + "]";
	}

}
