package main.java;

public class EvenNumbers {

	public static void main(String[] args) {
		evenNumbers();
	}

	private static void evenNumbers() {
		int i = 1;
		while (i <= 100) {
			if (i%2==0) 
				System.out.println(i);
			i++;
		}
	}
}
