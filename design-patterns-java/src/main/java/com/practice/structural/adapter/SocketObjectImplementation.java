package com.practice.structural.adapter;

public class SocketObjectImplementation implements SocketInterface {
    
    // Using Composition for adapter design pattern
    Socket socket = new Socket();

    @Override
    public Volts get120Volts() {
	return socket.getVolts();
    }

    @Override
    public Volts get12Volts() {
	Volts v = socket.getVolts();
	return covertVolts(v, 10);
    }

    @Override
    public Volts get3Volts() {
	Volts v = socket.getVolts();
	return covertVolts(v, 40);
    }
    
    public Volts covertVolts(Volts v, int i) {
	return new Volts(v.getVolts()/i);
    }

}
