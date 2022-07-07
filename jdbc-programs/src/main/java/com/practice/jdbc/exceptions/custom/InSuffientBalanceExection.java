package com.practice.jdbc.exceptions.custom;

/**
 * Creating a custom exception class, by extending RuntimeExcepiton class.
 * And overriding the toString() and getMessage();
 * @author SivakumarRevuri
 *
 */

public class InSuffientBalanceExection extends RuntimeException {

    private static final long serialVersionUID = 5930699781741974910L;
    String message = "insuffient balance, min balance must be RS1000/-";

    @Override
    public String toString() {
	return message;
    }

    @Override
    public String getMessage() {
	return message;
    }

}
