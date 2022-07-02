package jspidersApp.Applications.dataSource.sqlOperstions;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jspidersApp.Applications.dataSource.dbConnections.SqlServerCon;

public class CreateDtabase extends SqlServerCon
{
	public void crNewDatabase()
	{

		String ConnectionUrl="jdbc:sqlserver://localhost:1433" ;
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try{
			//STEP 2: Register JDBC driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			con = DriverManager.getConnection(ConnectionUrl, "sa", "tiger");

			//STEP 4: Execute a query
			System.out.println("Creating database...");
			stmt = con.createStatement();

			String sql = "CREATE DATABASE STUDENTS";
			stmt.executeUpdate(sql);
			System.out.println("Database created successfully...");
		}
		catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2){
			}// nothing we can do
			try{
				if(con!=null)
					con.close();
			}catch(SQLException se){
				se.printStackTrace();
			}//end finally try
		}//end try
		System.out.println("Goodbye!");
	}//end main	
}

