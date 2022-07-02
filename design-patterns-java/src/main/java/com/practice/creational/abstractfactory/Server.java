package com.practice.creational.abstractfactory;

public class Server extends Computer {

    String ram;
    String storage;
    String cpu;

    public Server(String ram, String storage, String cpu) {
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