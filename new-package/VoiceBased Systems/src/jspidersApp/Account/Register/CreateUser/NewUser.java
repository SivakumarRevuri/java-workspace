package jspidersApp.Account.Register.CreateUser;


import java.util.Date;

import jspidersApp.Account.Register.ValidateUserData.Age.*;
import jspidersApp.Account.Register.H2database.SecEmbDataBase;
import jspidersApp.Account.Register.Security.HashPass;
import jspidersApp.Account.Register.ValidateUserData.Date.CheckInstr;
import jspidersApp.Account.Register.ValidateUserData.Date.DateForm;


public class NewUser 
{
	private static int objCount = 1;

	private String firstName=null;
	private String lastName=null;
	private String userName=null;
	private byte[] password=null;
	private String email_id=null;
	private Date dateOfBirth=null;
	private long contactNo=0;
	private String u_id=null;
	private int age=0;

	private byte randomSalt[]=null;
	private byte hassedPassword[]=null;

	SecEmbDataBase dbo= SecEmbDataBase.getInstance();
	HashPass h= HashPass.getInstance();
	CheckInstr  c=new CheckInstr();
	DateForm d=new DateForm();
	AgeCalcuator ag=new AgeCalcuator();


	private  NewUser() 
	{
		objCount++;
	}

	public static synchronized NewUser getInstance() 
	{
		if(objCount < 3 )
		{
			return new NewUser();
		}
		return null;
	}

	public boolean setFirstName(String fName) 
	{
		boolean vFN=false;
		char[] fn=fName.toCharArray();
		for (char c : fn) 
		{
			if((c>=65 && c<=90) || (c>=97 && c<=122))
			{
			}
			else
				return vFN;
		}
		vFN=true;
		this.firstName = fName;
		return vFN;
	}

	public boolean setLastName(String lName) 
	{
		boolean vLN=false;
		char[] ln=lName.toCharArray();
		for (char c : ln) 
		{
			if((c>=65 && c<=90) || (c>=97 && c<=122))
			{

			}
			else
				return vLN;
		}
		vLN=true;
		this.lastName = lName;
		return vLN;
	}


	public boolean setUserName(String uName, boolean fUser) 
	{
		boolean vUN=false;
		boolean b=false;
		if(!fUser)
		{
			b=dbo.isUNPresent(uName);
			if(b)
				return vUN;
		}
		char[] un=uName.toCharArray();
		for (char c : un) 
		{
			if((c>=65 && c<=90) || (c>=97 && c<=122) || (c>=48 && c<=57))
			{

			}
			else
				return vUN;
		}
		vUN=true;
		this.userName = uName;
		return vUN;
	}


	public boolean setHassedPassword(char[] hPass)
	{
		boolean vhPass=false;
		char password[]=hPass;
		int lCase=0;
		int uCase=0;
		int num=0;
		for (char c : password) 
		{
			if(c>47 && c<=57)
				num++;
			if(c>64 && c<=90)
				uCase++;
			if(c>96 && c<=122)
				lCase++;
		}
		if(num>0 && uCase>0 && lCase>0 && (password.length>8 && password.length<16))
		{
			vhPass=true;

			byte salt[]=h.getNextSalt();
			byte hashPass[]=h.hash(password,salt);
			this.randomSalt=salt;
			this.hassedPassword = hashPass;
			return vhPass;
		}
		else
			return vhPass;
	}


	public boolean setPassword(char[] confirmPass) 
	{
		boolean vPass=false;
		char cPassword[]=confirmPass;
		if(hassedPassword!=null)
		{
			boolean b=h.isExpectedPassword(cPassword, randomSalt, hassedPassword);
			if(b)
			{
				vPass=true;
				this.password = hassedPassword;
			}
		}
		return vPass;
	}


	public boolean setEmail_id(String email_id, boolean fUser) 
	{
		boolean vEmID=false;
		boolean e= false;
		if(!fUser)
		{
			e=dbo.isUNPresent(email_id);
			if(e)
				return vEmID;
		}

		char[] emId=email_id.toCharArray();
		for (char c : emId) 
		{
			if((c>=64 && c<=90) || (c>=97 && c<=122) || (c>=48 && c<=57) || c==46)
			{
			}
			else
				return vEmID;
		}

		if(c.stringPresent(email_id, "@gmail.com") || c.stringPresent(email_id, "@yahoo.com"))
		{
			vEmID=true;
			this.email_id = email_id;
		}
		return vEmID;
	}


	public boolean setContactNo(String cont_No) 
	{
		boolean vcNO=false;
		char[] cNO=cont_No.toCharArray();
		for (char c : cNO) 
		{
			if(c<48 || c>57 )
				return vcNO;
		}
		if(cNO.length==10)
		{
			vcNO=true;
			long c_NO=Long.parseLong(cont_No);
			this.contactNo = c_NO;
		}
		return vcNO;
	}

	public boolean setDateOfBirth(String dateOfBirth) 
	{

		boolean vdOB=false;
		Date dOB=d.checkValidDOB(dateOfBirth);
		if(dOB==null)
			return vdOB;
		else 
		{

			int vAge=ag.isValidAge(dOB);
			if(vAge>10)
			{
				vdOB=true;
				this.dateOfBirth = dOB;
				this.setAge(vAge);
			}
		}
		return vdOB;
	}


	public void setAge(int vAge) 
	{
		this.age =vAge ;
	}


	public boolean setU_id(String u_id,boolean fUser) 
	{
		boolean vuId=false;
		boolean e= false;
		if(!fUser)
		{
			e=dbo.isUNPresent(u_id);
			if(e)
				return vuId;
		}

		this.u_id = u_id;
		vuId=true;
		return vuId;

	}




	public String getFirstName() 
	{
		return firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public String getUserName() 
	{
		return userName;
	}

	public byte[] getPassword() 
	{
		return password;
	}

	public String getEmail_id() 
	{
		return email_id;
	}

	public long getContactNo() 
	{
		return contactNo;
	}

	public Date getDateOfBirth() 
	{
		return dateOfBirth;
	}

	public int getAge() 
	{
		return age;
	}

	public String getU_id() 
	{
		return u_id;
	}

}

