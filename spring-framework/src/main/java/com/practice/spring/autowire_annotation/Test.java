package com.practice.spring.autowire_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/autowite-annotation.xml");
		Car car = (Car)context.getBean("car");
		car.printData();
	}
}