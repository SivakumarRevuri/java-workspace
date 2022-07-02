package com.practice.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

import com.practice.behavioral.Item;

public class ShopingCart {

	List<Item> cart;

	public ShopingCart() {
		this.cart = new ArrayList<Item>();
	}

	public boolean add(Item item) {
		this.cart.add(item);
		return true;
	}

	public boolean remove(Item item) {
		this.cart.remove(item);
		return true;
	}

	public double calculateTotal() {
		double sum = 0;
		for (Item item : cart) {
			sum += item.getAmount();
		}
		return sum;
	}

	/**
	 * Notice that payment method of shopping cart requires payment algorithm as
	 * argument and doesn’t store it anywhere as instance variable.
	 * 
	 * @param paymentStrategy
	 */

	public void pay(PaymentStrategy paymentStrategy) {
		// Paying the bill
		paymentStrategy.pay(calculateTotal());
	}
}
