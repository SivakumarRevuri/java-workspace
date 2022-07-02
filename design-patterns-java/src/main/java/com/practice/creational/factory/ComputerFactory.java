package com.practice.creational.factory;

/**
 * The factory design pattern is used when we have a superclass with multiple
 * sub-classes and based on input, we need to return one of the sub-class. This
 * pattern takes out the responsibility of the instantiation of a class from the
 * client program to the factory class.
 * 
 * @author SivakumarRevuri
 * @see https://www.journaldev.com/1392/factory-design-pattern-in-java
 *
 */

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String storage, String cpu) {
	if (type.equalsIgnoreCase("PC"))
	    return new PC(type, ram, storage, cpu);
	else if (type.equalsIgnoreCase("Server"))
	    return new Server(type, ram, storage, cpu);

	return null;
    }
}

/**
 * Advantages: 1. Factory design pattern provides approach to code for interface
 * rather than implementation. 2. Factory pattern removes the instantiation of
 * actual implementation classes from client code. Factory pattern makes our
 * code more robust, less coupled and easy to extend. For example, we can easily
 * change PC class implementation because client program is unaware of this. 3.
 * Factory pattern provides abstraction between implementation and client
 * classes through inheritance.
 * 
 * Factory Design Pattern Examples in JDK java.util.Calendar, ResourceBundle and
 * NumberFormat getInstance() methods uses Factory pattern. valueOf() method in
 * wrapper classes like Boolean, Integer etc.
 */
