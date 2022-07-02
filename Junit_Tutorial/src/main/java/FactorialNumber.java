package main.java;

public class FactorialNumber {
	private int result = 1;

	public int factorial(int input) {
		int output = 1;
		for (int i = input; i > 1; i--) {
			output *= i;
		}
		return output;
	}

	public int factorialRecursive(int in) {
		if (in > 1) {
			return in * factorialRecursive(in - 1);
		} else {
			return result;
		}
	}
}
