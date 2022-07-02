package com.practice.structural.adapter;

/**
 * Adapter design pattern is one of the structural design pattern and its used
 * so that two unrelated interfaces can work together. The object that joins
 * these unrelated interface is called an Adapter.
 * 
 * @author SivakumarRevuri
 *
 */

public class TestAdopterDesign {

    public static void main(String[] args) {
	testClassAdapter();
	testObjectAdapter();
    }

    private static void testObjectAdapter() {
	SocketInterface sockAdapter = new SocketObjectImplementation();
	Volts v3 = getVolts(sockAdapter, 3);
	Volts v12 = getVolts(sockAdapter, 12);
	Volts v120 = getVolts(sockAdapter, 120);
	System.out.println("v3 Voltss using Object Adapter=" + v3.getVolts());
	System.out.println("v12 Voltss using Object Adapter=" + v12.getVolts());
	System.out.println("v120 Voltss using Object Adapter=" + v120.getVolts());
    }

    private static void testClassAdapter() {
	SocketInterface sockAdapter = new SocketClassImplementation();
	Volts v3 = getVolts(sockAdapter, 3);
	Volts v12 = getVolts(sockAdapter, 12);
	Volts v120 = getVolts(sockAdapter, 120);
	System.out.println("v3 Voltss using Class Adapter=" + v3.getVolts());
	System.out.println("v12 Voltss using Class Adapter=" + v12.getVolts());
	System.out.println("v120 Voltss using Class Adapter=" + v120.getVolts());
    }

    private static Volts getVolts(SocketInterface sockAdapter, int i) {
	switch (i) {
	case 3:
	    return sockAdapter.get3Volts();
	case 12:
	    return sockAdapter.get12Volts();
	case 120:
	    return sockAdapter.get120Volts();
	default:
	    return sockAdapter.get120Volts();
	}
    }
}

/**
 * Some of the adapter design pattern example I could easily find in JDK classes
 * are;
 * 
 * java.util.Arrays#asList() java.io.InputStreamReader(InputStream) (returns a
 * Reader) java.io.OutputStreamWriter(OutputStream) (returns a Writer)
 */
