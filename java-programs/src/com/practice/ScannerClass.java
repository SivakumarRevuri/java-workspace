package com.practice;

import java.util.Scanner;

// creating Scanner object
public class ScannerClass {

    private static Scanner scanner;

    public static Scanner getInstance() {
	if (scanner == null) {
	  scanner = new Scanner(System.in);
	}
	return scanner;
    }
    @Override
    protected void finalize() throws Throwable {
        if (scanner != null) {
            scanner.close();
	}
    }
}
