package com.practice.encapsulation;

import java.math.BigInteger;

/**
 * @author Sivakumar Revuri; Encapsulation describes the ability of an object to
 *         hide its data and methods from the rest of the world and is one of
 *         the fundamental principles of object-oriented programming. Here, we
 *         will be writing User class as example for Encapsulation.
 */
public class User {

    // private variables declared,
    // these can only be accessed by
    // public methods of class
    private long userId;
    private String userFirstName;
    private String userLastName;
    private String userFullName;
    private int userAge;
    private String userMailId;
    private BigInteger userMobileNumber;

    /*
     * Hiding the data, by making the data variable private, and we will be creating
     * access, by using setter and getter methods.
     */

    public long getUserId() {
	return userId;
    }

    public String getUserFirstName() {
	return userFirstName;
    }

    public String getUserLastName() {
	return userLastName;
    }

    public String getUserFullName() {
	return userFullName;
    }

    public int getUserAge() {
	return userAge;
    }

    public String getUserMailId() {
	return userMailId;
    }

    public BigInteger getUserMobileNumber() {
	return userMobileNumber;
    }

    public void setUserId(long userId) {
	this.userId = userId;
    }

    public void setUserFirstName(String userFirstName) {
	this.userFirstName = userFirstName;
    }

    public void setUserLastName(String userLastName) {
	this.userLastName = userLastName;
    }

    public void setUserFullName(String userFullName) {
	this.userFullName = userFullName;
    }

    public void setUserAge(int userAge) {
	this.userAge = userAge;
    }

    public void setUserMailId(String userMailId) {
	this.userMailId = userMailId;
    }

    public void setUserMobileNumber(BigInteger userMobileNumber) {
	this.userMobileNumber = userMobileNumber;
    }

}
