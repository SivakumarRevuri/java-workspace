package com.practice.creational.abstractfactory;

public class PC extends Computer {

    String ram;
    String storage;
    String cpu;

    public PC(String ram, String storage, String cpu) {
	super();
	this.ram = ram;
	this.storage = storage;
	this.cpu = cpu;
    }

    @Override
    public String getCPU() {
	return this.cpu;
    }

    @Override
    public String getRAM() {
	return this.ram;
    }

    @Override
    public String getStorage() {
	return this.storage;
    }

}
