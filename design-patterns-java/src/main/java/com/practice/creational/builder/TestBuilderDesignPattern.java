package com.practice.creational.builder;

public class TestBuilderDesignPattern {

    public static void main(String[] args) {
	// Using builder to get the object in a single line of code and
	// without any inconsistent state or arguments management issues
	Computer computer = new Computer.ComputerBuilder("500GB", "4GB").setBluetoothBuilder(true)
		.setGraphicsCardBuilder(true).build();
	System.out.println(computer);
    }
}
