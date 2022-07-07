package com.practice.casting;

public class CastingExample {

    public static void main(String[] args) {
	// assigning the sub class reference to subclass is: upcasting
	Object object = new StringBuilder("Upcasting example").toString();
	
	//by validating the data type using "instanceof" will assign the data members;
	if (object instanceof String) {
	    String string = (String)object;
	    System.out.println(string);
	}
    }
}
