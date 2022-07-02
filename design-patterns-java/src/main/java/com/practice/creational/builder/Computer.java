package com.practice.creational.builder;

/**
 * Builder pattern was introduced to solve some of the problems with Factory and
 * Abstract Factory design patterns when the Object contains a lot of
 * attributes.
 * 
 * There are three major issues with Factory and Abstract Factory design
 * patterns when the Object contains a lot of attributes.
 * 
 * Too Many arguments to pass from client program to the Factory class that can
 * be error prone because most of the time, the type of arguments are same and
 * from client side its hard to maintain the order of the argument. Some of the
 * parameters might be optional but in Factory pattern, we are forced to send
 * all the parameters and optional parameters need to send as NULL. If the
 * object is heavy and its creation is complex, then all that complexity will be
 * part of Factory classes that is confusing. We can solve the issues with large
 * number of parameters by providing a constructor with required parameters and
 * then different setter methods to set the optional parameters. The problem
 * with this approach is that the Object state will be inconsistent until unless
 * all the attributes are set explicitly.
 * 
 * Builder pattern solves the issue with large number of optional parameters and
 * inconsistent state by providing a way to build the object step-by-step and
 * provide a method that will actually return the final Object.
 * 
 * @author SivakumarRevuri
 * @see https://www.journaldev.com/1425/builder-design-pattern-in-java
 *
 */

public class Computer {

    // required parameters
    private String HDD;
    private String RAM;

    // optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    // private constructor with ComputerBuilder object.
    private Computer(ComputerBuilder builder) {
	this.HDD = builder.HDD;
	this.RAM = builder.RAM;
	this.isBluetoothEnabled = builder.isBluetoothEnabled;
	this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    }
    // getter methods of both required & optional parameters.

    public String getHDD() {
	return HDD;
    }

    public String getRAM() {
	return RAM;
    }

    public boolean isGraphicsCardEnabled() {
	return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
	return isBluetoothEnabled;
    }

    @Override
    public String toString() {
	return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
		+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
    }

    /**
     * Notice that Computer class has only getter methods and no public constructor.
     * So the only way to get a Computer object is through the ComputerBuilder
     * class.
     * 
     * @author SivakumarRevuri
     *
     */

    // static builder class
    public static class ComputerBuilder {
	// required parameters
	private String HDD;
	private String RAM;

	// optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	// public constructor with required parameters
	public ComputerBuilder(String hDD, String rAM) {
	    super();
	    HDD = hDD;
	    RAM = rAM;
	}

	// set the optional parameters & return ComputerBuilder
	public ComputerBuilder setGraphicsCardBuilder(boolean isEnabled) {
	    this.isGraphicsCardEnabled = isEnabled;
	    return this;
	}

	public ComputerBuilder setBluetoothBuilder(boolean isEnabled) {
	    this.isBluetoothEnabled = isEnabled;
	    return this;
	}

	// build method which returns ComputerBuilder object
	public Computer build() {
	    return new Computer(this);
	}
    }
}
