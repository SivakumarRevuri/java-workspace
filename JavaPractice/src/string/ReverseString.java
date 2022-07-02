package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

	static String[] stringArray;

	public static void main(String[] args) throws IOException {
		System.out.println("Please enter the input: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String userInput = reader.readLine();
		stringArray = userInput.split(" ");
		
		for (String string : stringArray) {
			char[] charArray = string.toCharArray();
			for (int i = charArray.length-1; i >= 0; i--) {
				System.out.print(charArray[i]);
			}
			System.out.print(" ");
		}
	}

}
