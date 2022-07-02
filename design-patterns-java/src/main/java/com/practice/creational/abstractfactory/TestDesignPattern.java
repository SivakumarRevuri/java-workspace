package com.practice.creational.abstractfactory;

/**
 * 
 * @author SivakumarRevuri
 * @see https://www.journaldev.com/1418/abstract-factory-design-pattern-in-java
 */

public class TestDesignPattern {

    public static void main(String[] args) {
	Computer pc = ComputerFactory.getComputer(new PCFactory("4GB", "500GB", "Intel"));
	Computer server = ComputerFactory.getComputer(new ServerFactory("16GB", "1TB", "Intel"));
	
	System.out.println("Factory PC Config::"+pc);
	System.out.println("Factory Server Config::"+server);
    }
}
