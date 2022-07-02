package jspidersApp.Account.Register.ValidateUserData.Date;
import java.util.Scanner;

public class CheckInstr {

	public boolean stringPresent(String s, String s2) 
	{
		char str[]=s.toCharArray();
		char subStr[]=s2.toCharArray();
		for (char c : str) 
		{
			System.out.print(c);
		}
		System.out.println();
		for (char c : subStr)
		{
			System.out.print(c);
		}
		System.out.println();
		int l=0,l2=0;
		int c=0;
		if(subStr.length>str.length)
		{
			System.out.println("yes");
			return false;
		}
		else
		{
			for (int i = 0; i < str.length; i++) 
			{
				l=0;
				l2=i;
				for (int j = 0; j < subStr.length; j++) 
				{
					if(subStr[l]==str[l2])
					{
						l++;
						l2++;
						if(l2==str.length)
							break;
					}
					else
						break;
				}
				if(l==subStr.length)
					c++;

			}
		}
		if(c>0)
			return true;
		else
			return false;
	}
}
