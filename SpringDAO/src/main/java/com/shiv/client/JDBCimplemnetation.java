package com.shiv.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shiv.business.StudentBOImplementaion;
import com.shiv.model.Student;

public class JDBCimplemnetation 
{
    public static void main( String[] args ) throws Exception
    {
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/shiv/resources/spring.xml");
    	
    	StudentBOImplementaion boImplementaion = new StudentBOImplementaion();
    	Student student = new Student(5, "Yashu", "yashu@hcl.com", "Rajamandri");
    	System.out.println(boImplementaion.createStudent(student));
    	
    	context.close();
    }
}
