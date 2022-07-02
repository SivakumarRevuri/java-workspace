package jspidersApp.Applications.dataSource.sqlOperstions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jspidersApp.Applications.dataSource.dbConnections.SqlServerCon;

public class InsertRecords extends SqlServerCon
{
	public void addNewRecords() 
	{
		String ConnectionUrl="jdbc:sqlserver://localhost:1433;" + "databaseName=STUDENTS; integratedSecurity=false" ;
		Connection con=null;
		Statement stmt=null;
		int e=0;
		while(true)
		{
			try
			{
				//STEP 2: Register JDBC driver
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

				//STEP 3: Open a connection
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter the UesrName");
				String userName=sc.next();
				System.out.println("Enter the Password");
				String password=sc.next();
				con = DriverManager.getConnection(ConnectionUrl, userName , password);
				e=1;
				System.out.println("Connected database successfully...");

				//STEP 4: Execute a query
				System.out.println("Inserting records into the table...");
				stmt = con.createStatement();

				String sql = "INSERT INTO Registration " + "VALUES (100, 'Somnath', 'Sarkar', 25)";
				stmt.executeUpdate(sql);
				e=2;

				sql = "INSERT INTO Registration " + "VALUES (101, 'Akhil', 'Kumar', 25)";
				stmt.executeUpdate(sql);
				e=3;

				sql = "INSERT INTO Registration " + "VALUES (102, 'Sanghamesh', 'Motagi', 30)";
				stmt.executeUpdate(sql);
				e=4;

				sql = "INSERT INTO Registration " + "VALUES(103, 'Sumit', 'Mittal', 28)";
				stmt.executeUpdate(sql);
				e=5;

				System.out.println("Inserted records into the table...");
				System.out.println("Goodbye!");
				sc.close();
				break;

			}
			catch(SQLException se)
			{
				//Handle errors for JDBC
				if(e==0)
				{
					System.out.println("Invlid Login ID or Password");
				}
				else
					System.out.println("Duplicate records not possible");
			}
			catch(Exception de)
			{
				//Handle errors for Class.forName
				de.printStackTrace();
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
		}
	}//end main
}
