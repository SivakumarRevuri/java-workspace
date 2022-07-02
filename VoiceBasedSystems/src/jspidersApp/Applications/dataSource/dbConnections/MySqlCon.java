package jspidersApp.Applications.dataSource.dbConnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlCon implements Database
{

	public Connection con2=null;
	
	@Override
	public void createCon(String user, String pass) 
	{
		String ConnectionUrl2="jdbc:mysql://localhost/";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con2=DriverManager.getConnection(ConnectionUrl2,user,pass);
			System.out.println("Connection Established");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}	
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		catch(Exception s)
		{
			s.printStackTrace();
		}
	}

}
