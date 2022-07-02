package jspidersApp.Account.Register.ValidateUserData.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class date 
{
	public static void main(String[] args) throws ParseException
	{
		Scanner s=new Scanner(System.in);
		SimpleDateFormat sdfmt1 = new SimpleDateFormat("dd/MM/yy");
		SimpleDateFormat sdfmt2= new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println("enter date");
		String strInput=s.next();
		java.util.Date dDate = sdfmt1.parse( strInput );
		String strOutput = sdfmt2.format( dDate );
		System.out.println(strOutput);
	}
}
