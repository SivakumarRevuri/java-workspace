package jspidersApp.Account.Register.ValidateUserData.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateForm 
{
	public Date checkValidDOB(String dt)
	{
		Date d=null;
		int i=0;
		char dob[]=dt.toCharArray();
		if( dob.length!=10 )
			return d;
		for (char c : dob) 
		{
			if(c=='/')
			{
				dob[i]='-';
			}
			else if(c=='.')
				dob[i]='-';
			i++;
		}

		dt=new String(dob);
		boolean v=isValidDate(dob);

		if(v)
		{
			try
			{
				SimpleDateFormat sdfmt= new SimpleDateFormat("dd-MM-yyyy");
				d = sdfmt.parse( dt );
			}
			catch(ParseException e)
			{

			}
		}

		return d;
	}



	private boolean isValidDate(char[] dob) 
	{
		String date="",mon="",year="";
		int dd=0,mm=0,yy=0;
		boolean lpYear=false;

		for(int i=0;i<dob.length;i++) 
		{
			if(i<2) 
			{
				date=date+dob[i];
			}
			else if(i>2 && i<5)
			{
				mon=mon+dob[i];
			}
			else if(i>5)
			{
				year=year+dob[i];
			}
		}
		dd=Integer.parseInt(date);
		mm=Integer.parseInt(mon);
		yy=Integer.parseInt(year);

		lpYear = isLeapYear(yy);

		if((dd<1 || dd>31) || (mm<1 || mm>12) || (yy<1920 || yy>2007) ||
				(dd==31 && (mm==4 || mm==6 || mm==9 || mm==11)) || (mm==2 && dd>29) ||
				(mm==2 && dd==29 && !lpYear))
		{
			return false;

		}

		else
			return true;
	}

	
	private static boolean isLeapYear(int n)
	{
		if(n%400==0)
			return true;
		else if (n%4==0) 
		{
			if(n%100!=0) 
				return true;
			else
				return false;
		}
		else
			return false;
	}

}

