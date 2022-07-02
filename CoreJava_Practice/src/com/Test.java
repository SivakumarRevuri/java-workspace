package com;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello \nSivakumar Revuri");
		System.out.println(Integer.sum(74, 36));
		System.out.println(Integer.divideUnsigned(50, 3));
		System.out.println(Math.multiplyExact(25, 5));

		List<String> arrayList = new ArrayList<>();
		arrayList.add("Sivakumar");
		arrayList.add("Revuri");
		arrayList.add("Tony");
		arrayList.add("Shiv");

		List<String> duplicate = new ArrayList<>(arrayList);
	//	duplicate.addAll(arrayList);

		for (String string : arrayList) {
			System.out.println(duplicate.contains(string));
		}
	}
}
