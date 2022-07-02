package jspidersApp.Account.Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;
import java.util.Properties;

public class UserDetails 
{
	Connection conn=null;
	public boolean isFirstUser() 
	{
		boolean fUser=false;
		try
		{
			Class.forName("org.h2.Driver");
			String url = "jdbc:h2:~/jspidersApp4;IFEXISTS=TRUE";
			String user = "sam";
			char[] password = {'j','8', '7', '0', '1', '0', '@', '1','0','3','4','9','S'};

			Properties prop = new Properties();
			prop.setProperty("user", user);
			prop.put("password", password);
			conn = DriverManager.getConnection(url,prop);
			Arrays.fill(password, Character.MIN_VALUE);
			conn.close();
		}
		catch (Exception e) 
		{
			fUser=true;
		} 
		finally 
		{
			try 
			{
				conn.close();
			}
			catch (Exception e) 
			{
				System.out.println("             No  users  present              ");
			}
		}
		return fUser;
	}
}