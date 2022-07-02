package jspidersApp.Applications.dataSource.dbConnections;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlServerCon implements Database
{
	public Connection con2=null;

	@Override
	public void createCon(String user, String pass) {
		String ConnectionUrl2="jdbc:sqlserver://localhost:1433;";
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con2=DriverManager.getConnection(ConnectionUrl2,user,pass);
			System.out.println("Connection Established");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
	}
	
	
}
