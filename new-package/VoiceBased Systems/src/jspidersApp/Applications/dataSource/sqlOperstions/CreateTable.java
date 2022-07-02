package jspidersApp.Applications.dataSource.sqlOperstions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jspidersApp.Applications.dataSource.dbConnections.SqlServerCon;

public class CreateTable extends SqlServerCon
{
	public void crNewTable()
	{
		String ConnectionUrl="jdbc:sqlserver://localhost:1433;" + "databaseName=STUDENTS; integratedSecurity=false" ;
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try
		{
			//STEP 2: Register JDBC driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			//STEP 3: Open a connection
			System.out.println("Connecting to a selected database...");
			con = DriverManager.getConnection(ConnectionUrl, "sa", "tiger");
			System.out.println("Connected database successfully...");

			//STEP 4: Execute a query
			System.out.println("Creating table in given database...");
			stmt = con.createStatement();

			String sql = "CREATE TABLE REGISTRATION " +
					"(id INTEGER not NULL, " +
					" first VARCHAR(255), " + 
					" last VARCHAR(255), " + 
					" age INTEGER, " + 
					" PRIMARY KEY ( id ))"; 

			stmt.executeUpdate(sql);
			System.out.println("Created table in given database...");
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
				if(stmt!=null)
					con.close();
			}
			catch(SQLException se)
			{
			}// do nothing
			try
			{
				if(con!=null)
					con.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}//end finally try
		}//end try
		System.out.println("Goodbye!");
	}//end main

}


