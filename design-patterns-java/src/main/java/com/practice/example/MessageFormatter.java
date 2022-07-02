package com.practice.example;

public class MessageFormatter {
	
	IMessageFormatter iMessageFormatter;
	
	public void formatMessage(String type, String message) {
		String convertedMessage = null;
		
		iMessageFormatter = MessageFormatterFactory.createMessageFormatter(type);
		convertedMessage = iMessageFormatter.formatMessage(message);
		
		System.out.println(convertedMessage);
	}

}
