package com.practice.polymorphism;

public class Car extends Vehicle {

    @Override
    public void start() {
	System.out.println("car started");
    }

    public static void main(String[] args) {
	// Runtime polymorphism 
	Vehicle v = new Car();
	v.start();
    }
}
