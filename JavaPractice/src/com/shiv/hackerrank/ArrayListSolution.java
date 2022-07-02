package com.shiv.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSolution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		ArrayList[] array = new ArrayList[size];
		for (int i = 0; i < size; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			while (scanner.hasNext()) {
				list.add(scanner.nextInt());
			}
			array[i] = list;
		}

		scanner.close();
	}
}
