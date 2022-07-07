package com.practice.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class TextDataWriteDemo {
	public static void main(String[] args) {
		FileWriter fr = null;
		try {
			fr = new FileWriter("data.txt");
			fr.write("hello all");
			fr.write("Good morning");
			fr.write("How is weekend");

			fr.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
