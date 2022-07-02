package com.practice.example;

public class MessageFormatterFactory {
	
	static IMessageFormatter formatter;

	public static IMessageFormatter createMessageFormatter(String type) {
		if (type != null) {
			if (type.equalsIgnoreCase("pdf")) {
				formatter = new PDFMessageFormatterImpl();
			} else if(type.equalsIgnoreCase("html")) {
				formatter = new HTMLMessageFormatterImpl();
			}
			return formatter;
		}else
			throw new NullPointerException("Please Enter valid Message Format");
	}
}
