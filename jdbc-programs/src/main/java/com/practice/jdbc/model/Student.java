package com.practice.jdbc.model;

public class Student {

    private String name;
    private int age;
    private String qualification;
    private String mail;
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

    public String getQualification() {
	return qualification;
    }

    public String getMail() {
	return mail;
    }

    public void setQualification(String qualification) {
	this.qualification = qualification;
    }

    public void setMail(String mail) {
	this.mail = mail;
    }

    public String getPhone() {
	return phone;
    }

    public void setPhone(String phone) {
	this.phone = phone;
    }

}
