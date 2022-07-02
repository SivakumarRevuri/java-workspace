package com.practice.creational.singleton;

// final - to avoid inheritance
// Best example is: java.util.Runtime && java.awt.Desktop
public class SingletonExample implements Cloneable {

    // crating a private static variable, so we can access directly by class name
    private static volatile SingletonExample object = null;

    // if class constructor is private, child class won't get created.
    private SingletonExample() {
	super();
    }

    // to avoid EGAR Object creation, checking null reference
    public static SingletonExample getInstance() {
	// by creating a synchronized block, object will be thread-safe.
	synchronized (SingletonExample.class) {
	    if (object == null) {
		object = new SingletonExample();
	    }
	    return object;
	}
    }

    // By Overriding the clone(), Singleton Object won't be cloned.
    @Override
    protected Object clone() throws CloneNotSupportedException {
	return new CloneNotSupportedException("It is a Singleton class");
    }
}
