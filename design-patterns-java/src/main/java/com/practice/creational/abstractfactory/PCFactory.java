package com.practice.creational.abstractfactory;

public class PCFactory implements ComputerAbstractFactory {

    String ram;
    String storage;
    String cpu;

    public PCFactory(String ram, String storage, String cpu) {
	super();
	this.ram = ram;
	this.storage = storage;
	this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
	return new PC(ram, storage, cpu);
    }

}
