package com.practice.structural.adapter;

// In Class implementation using Inheritance for adapter design pattern.
public class SocketClassImplementation extends Socket implements SocketInterface{

    @Override
    public Volts get120Volts() {
	return getVolts();
    }

    @Override
    public Volts get12Volts() {
	Volts v = getVolts();
	return covertVolts(v, 10);
    }

    @Override
    public Volts get3Volts() {
	Volts v = getVolts();
	return covertVolts(v, 40);
    }
    
    public Volts covertVolts(Volts v, int i) {
	return new Volts(v.getVolts()/i);
    }

}
