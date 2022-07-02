package main.java;

public class BinaryNumber {

	public void binary(int number) {
		while (number > 0) {
			System.out.print(number % 2);
			number = number / 2;
		}
	}

	public static void main(String[] args) {
		new BinaryNumber().binary(7);
		System.out.println("===========");
		new BinaryNumber().test("Rank");
	}

	public String test(String name) {
		char array[] = name.toCharArray();
		StringBuilder odd = new StringBuilder();
		StringBuilder even = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				even.append(array[i]);
			} else {
				odd.append(array[i]);
			}
		}
		return even+" "+odd;
	}
}
