package jspidersApp.Account.Register.CreateUser;

import java.util.Scanner;

import jspidersApp.Account.Register.RandomGenerator.RandomGen;


public class SignUp 
{

	public void register(boolean fUser) 
	{
		Scanner s=new Scanner(System.in);
		NewUser n= NewUser.getInstance();


		boolean isInvalidData=true;
		boolean vFirstName=false;
		boolean vLastName=false;
		boolean vUserName=false;
		boolean vPassword=false;
		boolean vCPassword=false;
		boolean vEmID=false;
		boolean vContactNO=false;
		boolean vDOB=false;
		boolean vU_id=false;

		while(isInvalidData)
		{

			if(!vFirstName)
			{
				System.out.println("Enter FirstName: ");
				vFirstName=n.setFirstName(s.next());
			}

			if(!vLastName)
			{
				System.out.println("Enter LastName: ");
				vLastName=n.setLastName(s.next());
			}

			if(!vUserName)
			{
				System.out.println("Enter the Username: ");
				vUserName=n.setUserName(s.next(),fUser);

			}

			if(!vPassword)
			{
				System.out.println("Enter the Password: /n/t"
						+ "(hint:- password must contain atleast 1 lowercase & "
						+ "1 uppercase and 1 number");
				vPassword=n.setHassedPassword(s.next().toCharArray());

			}

			if(!vCPassword)
			{
				System.out.println("Confirm Password");
				vCPassword=n.setPassword(s.next().toCharArray());

			}

			if(!vEmID)
			{
				System.out.println("Enter Email_ID");
				vEmID=n.setEmail_id(s.next(),fUser);

			}

			if(!vContactNO)
			{
				System.out.println("Enter Contact_No");
				vContactNO=n.setContactNo(s.next());

			}

			if(!vDOB)
			{
				System.out.println("Enter Date Of Birth");
				vDOB=n.setDateOfBirth(s.next());			

			}
			
			if(!vU_id)
			{
				RandomGen r= new RandomGen();
				vU_id=n.setU_id(r.randomId().toString(),fUser);
			}

			if(vFirstName==true && vLastName==true && vUserName==true && vPassword==true 
					&& vCPassword==true  && vEmID==true && vContactNO==true && vDOB==true)
			{
				isInvalidData=false;
				n.dbo.register();
			}
		}	

		System.out.println("            REGISTRATION SUCCESFULL            ");
	}

}


