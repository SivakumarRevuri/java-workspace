package com.practice.jdbc.model;

public class Customer {

    private int senderId;
    private int customerId;
    private double amount;

    public int getSenderId() {
	return senderId;
    }

    public void setSenderId(int sid) {
	this.senderId = sid;
    }

    public int getCustomerId() {
	return customerId;
    }

    public void setCustomerId(int cid) {
	this.customerId = cid;
    }

    public double getAmount() {
	return amount;
    }

    public void setAmount(double amount) {
	this.amount = amount;
    }

}
