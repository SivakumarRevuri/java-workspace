package main.java;

public class StringReverse {

	public String reverseString(String string) {
		char charArray[] = string.toCharArray();
		StringBuilder builder = new StringBuilder();
		for (int i = charArray.length-1; i >= 0; i--) {
			builder.append(charArray[i]);
		}
		return new String(builder);
	}

	// write a method which will int array as input and it should return the difference between min & max value.
}
