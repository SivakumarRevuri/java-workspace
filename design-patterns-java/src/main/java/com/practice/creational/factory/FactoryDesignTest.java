package com.practice.creational.factory;

/**
 * 
 * @author SivakumarRevuri
 *
 */

public class FactoryDesignTest {

    public static void main(String[] args) {
	Computer pc = ComputerFactory.getComputer("PC", "4GB", "500GB", "Intel");
	Computer server = ComputerFactory.getComputer("Server", "16GB", "1TB", "Intel");
	
	System.out.println("Factory PC Config::"+pc);
	System.out.println("Factory Server Config::"+server);
    }
}
