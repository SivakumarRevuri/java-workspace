package com.practice.numbers;

import java.util.Scanner;

import com.practice.ScannerClass;

public class PrintNumbersToN {

    public static void main(String[] args) {
	Scanner scanner = ScannerClass.getInstance();
	System.out.println("Please enter the value of N: ");
	int N = scanner.nextInt();
	for (int i = 0; i <= N; i++) {
	    System.out.print(i+", ");
	}
	scanner.close();
    }
}
