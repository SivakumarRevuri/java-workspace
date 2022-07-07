package com.practice.method;

import java.math.BigInteger;

public class MethodOverridingExample {

    String name;
    BigInteger accountNumber;

    // Overriding the Object class methods hashCode() and equals()
    @Override
    public int hashCode() {
	return -1;
    }

    @Override
    public boolean equals(Object obj) {

	boolean isSame = false;
	if (obj instanceof MethodOverridingExample) {
	    MethodOverridingExample b = (MethodOverridingExample) obj;
	    if (this.accountNumber == b.accountNumber) {
		isSame = true;
	    }
	}
	return isSame;

    }
}
