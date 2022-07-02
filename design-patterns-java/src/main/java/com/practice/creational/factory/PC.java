package com.practice.creational.factory;

public class PC extends Computer {

    String type;
    String ram;
    String storage;
    String cpu;

    public PC(String type, String ram, String storage, String cpu) {
	super();
	this.type = type;
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
