package com.practice.constructors;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Constructors {

    private String className;
    private boolean isVariableExist;
    private boolean isMethodsExist;

    // zero parameterized constructors.
    public Constructors() {
	// calling the super class constructor is the first statement.
	super();
    }

    // calling the constructor from another constructor.
    public Constructors(String className, boolean isVariableExist) {
	this(className, isVariableExist, Boolean.FALSE);
    }

    // Parameterized constructor, now the constructor is overloaded.
    public Constructors(String className, boolean isVariableExist, boolean isMethodsExist) {
	super();
	this.className = className;
	this.isVariableExist = isVariableExist;
	this.isMethodsExist = isMethodsExist;
    }

    public static void main(String[] args) {
	Constructors constructor = new Constructors();
	String string = new String("I am a String!!!");
	Class<? extends String> stringClass = string.getClass();
	constructor.className = stringClass.getName();

	// get constructors present is String class.
	Constructor<?>[] constructors = stringClass.getConstructors();
	System.out.println(constructors);
	
	Method methods[] = stringClass.getMethods();
	System.out.println(methods);
    }
}
