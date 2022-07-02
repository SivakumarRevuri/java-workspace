package com.practice.creational.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory {

    String ram;
    String storage;
    String cpu;

    public ServerFactory(String ram, String storage, String cpu) {
	super();
	this.ram = ram;
	this.storage = storage;
	this.cpu = cpu;
    }
    
    @Override
    public Computer createComputer() {
	return new Server(ram, storage, cpu);
    }

}
