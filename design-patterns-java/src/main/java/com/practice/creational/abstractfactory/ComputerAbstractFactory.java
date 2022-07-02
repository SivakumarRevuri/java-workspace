package com.practice.creational.abstractfactory;

/**
 * Notice that createComputer() method is returning an instance of super class
 * Computer. Now our factory classes will implement this interface and return
 * their respective sub-class.
 * 
 * @author SivakumarRevuri
 *
 */

public interface ComputerAbstractFactory {

    public Computer createComputer();
}
