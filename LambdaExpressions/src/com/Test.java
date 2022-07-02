package com;

public class Test {

	public static void main(String[] args) {
		int n = 6, count = 0, temp = 0;
		while (n > 0) {
			if (n % 2 == 1) {
				count++;
				if (count > temp) {
					temp = count;
				}
			} else {
				count = 0;
			}
			n /= 2;
		}
		System.out.println(temp);
	}
}
