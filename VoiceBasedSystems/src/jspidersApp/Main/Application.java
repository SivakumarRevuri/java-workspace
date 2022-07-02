package jspidersApp.Main;

import jspidersApp.Account.Register.CreateUser.*;
import jspidersApp.Account.Users.UserDetails;

public class Application 
{
	public static void main(String[] args) 
	{
		UserDetails u=new UserDetails();
		boolean fUser= u.isFirstUser();
		if(fUser)
		{
			System.out.println("              PLease Register               ");
			SignUp s=new SignUp();
			s.register(fUser);
		}
	}
}
