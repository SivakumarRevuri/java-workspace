package com.practice.behavioral.strategy;

public class PaypalPayment implements PaymentStrategy{

	public String email;
	public String password;
	
	public PaypalPayment(String mail, String password) {
		this.email = mail;
		this.password = password;
	}
	
	@Override
	public void pay(double amount) {
		System.out.println(amount+" is paid using Paypal");
	}
}
