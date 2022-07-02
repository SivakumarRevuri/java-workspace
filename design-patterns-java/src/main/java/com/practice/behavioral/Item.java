package com.practice.behavioral;

public class Item {

	private String upcCode;
	private double amount;

	public Item(String code, double amount) {
		this.upcCode = code;
		this.amount = amount;
	}

	public String getUpcCode() {
		return upcCode;
	}

	public double getAmount() {
		return amount;
	}

	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
