package com.practice.behavioral.strategy;

import java.math.BigInteger;

public class CardPayment implements PaymentStrategy {

	public String name;
	public BigInteger cardNumber;
	public int cvv;
	public String expiry;

	public CardPayment(String name, BigInteger cardNumber, int cvv, String expiry) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiry = expiry;
	}

	@Override
	public void pay(double amount) {
		System.out.println(amount+" is paid using Credit/Debit card");
	}

}
