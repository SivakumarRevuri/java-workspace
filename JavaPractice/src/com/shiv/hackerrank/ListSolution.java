package com.shiv.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSolution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add(scanner.nextInt());
		}
		int no = scanner.nextInt();
		for (int i = 0; i < no; i++) {
			String input = scanner.next();
			switch (input) {
			case "Insert":
				int index = scanner.nextInt();
				list.add(index, scanner.nextInt());
				break;
			case "Delete":
				int delete = scanner.nextInt();
				list.remove(delete);
				break;
			default:
				break;
			}
		}
		scanner.close();
		for (Integer integer : list) {
			System.out.print(integer);
			System.out.println(" ");
		}
	}
}
