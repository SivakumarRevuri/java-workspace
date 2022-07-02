package com.practice;

import java.util.Scanner;

public class ScannerClass implements Cloneable {

    private static Scanner scanner;

    private ScannerClass() {
	super();
    }

    public synchronized static Scanner getInstance() {
	if (scanner == null) {
	    scanner = new Scanner(System.in);
	}
	return scanner;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
	return new CloneNotSupportedException();
    }

    @Override
    protected void finalize() throws Throwable {
	if (scanner != null) {
	    scanner.close();
	}
    }

}
