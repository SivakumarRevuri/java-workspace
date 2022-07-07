package com.practice.spring.messagesource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageSource {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("messageSource.xml");
		// type 1
		System.out.println(context.getMessage("greeting", null, "DefaultMsgIfNotFound", null));
		// type 2
		System.out.println(context.getMessage("dynamic", new Object[] {5, 6}, "error: 404", null));
	}
}
