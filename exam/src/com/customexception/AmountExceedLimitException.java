package com.customexception;

public class AmountExceedLimitException extends Exception
{
 
	
	private static final long serialVersionUID = 1L;
	String msg="transfer amount exceded, you can transfer below 1 lakh";
	
	@Override
	public String toString() {
		return msg;
	}
	
	public String getMsg() {
		return msg;
	}
}
