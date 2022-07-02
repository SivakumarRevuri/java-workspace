package com.practice.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * When you run the above test class, you will notice that hashCode of both the
 * instances is not same that destroys the singleton pattern.
 * 
 * @author SivakumarRevuri
 *
 */

public class ReflectSingletonTest {

    public static void main(String[] args) {
	SingletonExample singleton1 = SingletonExample.getInstance();
	SingletonExample singleton2 = null;

	Constructor<?>[] array = SingletonExample.class.getDeclaredConstructors();
	for (Constructor<?> constructor : array) {
	    constructor.setAccessible(Boolean.TRUE);
	    try {
		singleton2 = (SingletonExample) constructor.newInstance();
	    } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
		    | InvocationTargetException e) {
		e.printStackTrace();
	    }
	}
	System.out.println(singleton1.hashCode());
	System.out.println(singleton2.hashCode());
    }
}

/**
 * To overcome this situation with Reflection, Joshua Bloch suggests the use of
 * Enum to implement Singleton design pattern as Java ensures that any enum
 * value is instantiated only once in a Java program. Since Java Enum values are
 * globally accessible, so is the singleton. The drawback is that the enum type
 * is somewhat inflexible; for example, it does not allow lazy initialization.
 */

enum EnumSingleton {
    INSTANCE;
}