package jspidersApp.Applications.dataSource.sqlOperstions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jspidersApp.Applications.dataSource.dbConnections.SqlServerCon;

public class UpdateTable extends SqlServerCon
{
	public void updateReords()
	{String ConnectionUrl="jdbc:sqlserver://localhost:1433;" + "databaseName=STUDENTS; integratedSecurity=false" ;
	Connection con=null;
	Statement stmt=null;
	int e=0;
	while(true)
	{

		try
		{//STEP 2: Register JDBC driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			//STEP 3: Open a connection
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the UesrName");
			String userName=sc.next();
			System.out.println("Enter the Password");
			String password=sc.next();

			System.out.println("Connecting to a selected database...");
			con = DriverManager.getConnection(ConnectionUrl, userName , password);
			System.out.println("Connected database successfully...");

			System.out.println("Values before updation");
			String sql = "SELECT * FROM Registration ";
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				//Retrieve by column name
				int id  = rs.getInt("id");
				int age = rs.getInt("age");
				String first = rs.getString("first");
				String last = rs.getString("last");

				//Display values
				System.out.print("ID: " + id);
				System.out.print(", Age: " + age);
				System.out.print(", First: " + first);
				System.out.println(", Last: " + last);
			}




			//STEP 4: Execute a query
			System.out.println("Creating statement...");
			sql = "UPDATE Registration SET age = "+"70"+" WHERE id in (100, 101)";
			stmt = con.createStatement();
			stmt.executeUpdate(sql);

			// Now you can extract all the records
			// to see the updated records
			sql = "SELECT id, first, last, age FROM Registration";

			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				//Retrieve by column name
				int id  = rs.getInt("id");
				int age = rs.getInt("age");
				String first = rs.getString("first");
				String last = rs.getString("last");

				//Display values
				System.out.print("ID: " + id);
				System.out.print(", Age: " + age);
				System.out.print(", First: " + first);
				System.out.println(", Last: " + last);
			}

			rs = stmt.executeQuery("SELECT * FROM Registration");
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			String name[]=new String[6];
			// The column count starts from 1
			for (int i = 1; i <= columnCount; i++ ) {
				name[i] = rsmd.getColumnName(i);
				// Do stuff with name
			}

			for (int i = 1; i <= columnCount; i++ ) 
			{
				System.out.print(name[i]+"     "   );
				// Do stuff with name
			}

			rs.close();
			sc.close();
			break;
		}
		catch(SQLException se)
		{
			if(e==0)
			{
				System.out.println("Invlid Login ID or Password");
			}
			else
				System.out.println("Duplicate records not possible");
			//Handle errors for JDBC
		}
		catch(Exception de)
		{
			//Handle errors for Class.forName
			de.printStackTrace();
		}
		finally
		{
			//finally block used to close resources
			try{
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

	}
	}//end main
}
