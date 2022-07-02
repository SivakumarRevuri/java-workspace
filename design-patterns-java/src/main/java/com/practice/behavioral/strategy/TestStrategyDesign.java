package com.practice.behavioral.strategy;

import java.math.BigInteger;

import com.practice.behavioral.Item;

/**
 * Strategy design pattern is one of the behavioral design pattern. Strategy
 * pattern is used when we have multiple algorithm for a specific task and
 * client decides the actual implementation to be used at runtime.
 * 
 * Strategy design pattern is one of the behavioral design pattern. Strategy
 * pattern is used when we have multiple algorithm for a specific task and
 * client decides the actual implementation to be used at runtime.
 * 
 * Strategy Pattern strategy pattern, strategy design pattern
 * 
 * Strategy pattern is also known as Policy Pattern. We define multiple
 * algorithms and let client application pass the algorithm to be used as a
 * parameter.
 * 
 * One of the best example of strategy pattern is Collections.sort() method that
 * takes Comparator parameter. Based on the different implementations of
 * Comparator interfaces, the Objects are getting sorted in different ways.
 * 
 * For our example, we will try to implement a simple Shopping Cart where we
 * have two payment strategies – using Credit Card or using PayPal.
 * 
 * First of all we will create the interface for our strategy pattern example,
 * in our case to pay the amount passed as argument.
 * 
 * @author SivakumarRevuri
 * @see https://www.journaldev.com/1754/strategy-design-pattern-in-java-example-tutorial
 *
 */

public class TestStrategyDesign {

	public static void main(String[] args) {
		// Items
		Item item1 = new Item("Book", 158.9);
		Item item2 = new Item("T-Shirt", 380);
		// cart
		ShopingCart cart = new ShopingCart();
		cart.add(item1);
		cart.add(item2);
		// payment
		cart.pay(new CardPayment("HDFC", new BigInteger("769456954934"), 795, "09/21"));
		cart.pay(new PaypalPayment("test@gmail.com", "Pass135@"));
	}
}
/**
 * We could have used composition to create instance variable for strategies but
 * we should avoid that as we want the specific strategy to be applied for a
 * particular task. Same is followed in Collections.sort() and Arrays.sort()
 * method that take comparator as argument. Strategy Pattern is very similar to
 * State Pattern. One of the difference is that Context contains state as
 * instance variable and there can be multiple tasks whose implementation can be
 * dependent on the state whereas in strategy pattern strategy is passed as
 * argument to the method and context object doesn’t have any variable to store
 * it. Strategy pattern is useful when we have multiple algorithms for specific
 * task and we want our application to be flexible to chose any of the algorithm
 * at runtime for specific task.
 */
