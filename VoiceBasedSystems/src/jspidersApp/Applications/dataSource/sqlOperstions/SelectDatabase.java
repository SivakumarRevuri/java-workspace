package jspidersApp.Applications.dataSource.sqlOperstions;

import java.sql.DriverManager;
import java.sql.SQLException;

import jspidersApp.Applications.dataSource.dbConnections.SqlServerCon;

public class SelectDatabase extends SqlServerCon
{
	public void sDatabase()
	{
		String ConnectionUrl="jdbc:sqlserver://localhost:1433;" + "databaseName=SysDB; integratedSecurity=false" ;
		try 
		{
			con2 = DriverManager.getConnection(ConnectionUrl,"sa","tiger");
			System.out.println("Connected database successfully...");
		}
		catch(SQLException se)
		{
			//Handle errors for JDBC
			se.printStackTrace();
		}
		catch(Exception e)
		{
			//Handle errors for Class.forName
			e.printStackTrace();
		}
		finally
		{
			//finally block used to close resources
			try
			{
				if(con2!=null)
					con2.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}//end finally try
		}//end try
		System.out.println("Goodbye!");
	}//end main
}

