package com.practice.creational.abstractfactory;

/**
 * Notice that its a simple class and getComputer method is accepting
 * ComputerAbstractFactory argument and returning Computer object. At this point
 * the implementation must be getting clear.
 * 
 * Let’s write a simple test method and see how to use the abstract factory to
 * get the instance of sub-classes.
 * 
 * TestDesignPatterns.java
 * 
 * @author SivakumarRevuri
 *
 */

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
	return factory.createComputer();
    }
}
