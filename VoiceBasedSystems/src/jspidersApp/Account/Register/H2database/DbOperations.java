package jspidersApp.Account.Register.H2database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;

public class DbOperations 
{
	private Connection con=null;
	private String connectionUrl=null;
	private Statement stat=null;
	private PreparedStatement prep=null;
	private String query=null;
	private Date c_Date= new Date();

	private static int objCount = 1;


	private  DbOperations() 
	{
		objCount++;
	}

	public static synchronized DbOperations getInstance() 
	{
		if(objCount < 2 ){
			return new DbOperations();
		}
		return null;
	}


	public Connection CreateCon()
	{
		connectionUrl="jdbc:h2:~/jspidersApp4;";
		try 
		{
			Class.forName("org.h2.Driver");
			String user = "sam";
			char[] password = {'j','8', '7', '0', '1', '0', '@', '1','0','3','4','9','S'};
			Properties prop = new Properties();
			prop.setProperty("user", user);
			prop.put("password", password);
			con =DriverManager.getConnection(connectionUrl,prop);
			return con;
		}

		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}	
		catch(Exception s)
		{
			s.printStackTrace();
		}
		return con;
	}



	public boolean  tablesPresent(Connection con)
	{
		try 
		{
			stat = con.createStatement();
			stat.execute("select * from TableList"); 
			stat.close();
		}
		catch( Exception e)
		{
			return false;
		}
		finally
		{
			try 
			{
				stat.close();
			} 
			catch (Exception e)
			{
			}
		}
		return true;
	}


	
	
	public void createTables(Connection con)
	{
		try 
		{
			stat = con.createStatement();
			stat.execute(
					"create table TableList("
							+ "T_Id auto_increment  primary key not null, "
							+ "T_Name varchar(15) not null , "
							+ "Created_Date Date ,"
							+ "No_Colmns number(5))" );
			stat.execute(
					"create table UserDetails(" 
							+ "U_Id varchar(2)  primary key , "
							+ "U_Name varchar(10) not null, "
							+ "Contact_No number(10) , "
							+ "DateOfBirth Date , "
							+ "Age number(10) , "
							+ "Cr_Date Date not null);"
							+ "insert into TableList (T_Name, Created_Date, No_Colmns) values('UserDetails',"+c_Date+",6)" );
			stat.execute(
					"create table LoginDetails(" 
							+ "U_Id varchar  unique, "
							+ "Log_Id varchar(15)  primary key, "
							+ "Password varchar(16) not null,"
							+ "Email_Id varchar not null"
							+ "ReqPassRecov boolean" 
							+ "FOREIGN KEY (U_Id) REFERENCES UserDetails(U_Id));"
							+ "insert into TableList (T_Name, Created_Date, No_Colmns) values('LoginDetails',"+c_Date+",5)" );
			stat.execute(
					"create table PasswordRecovery(" 
							+ "U_Id varchar(2)  primary key, "
							+ "OneTimePassword varchar(15) , "
							+ "Created_Date Date ,"
							+ "No_Rows varchar"
							+"FOREIGN KEY (U_Id) REFERENCES UserDetails(U_Id));"
							+"insert into TableList (T_Name, Created_Date, No_Colmns) values('PasswordRecovery',"+c_Date+",4)" );
			stat.execute(
					"create table AppLog(" 
							+ "U_Id varchar(2) , "
							+ "Login_Date Date ,"
							+"FOREIGN KEY (U_Id) REFERENCES UserDetails(U_Id));"
							+"insert into TableList (T_Name, Created_Date, No_Colmns) values('AppLog',"+c_Date+",2)" );
			stat.execute(
					"create table U_Settings(" 
							+ "U_Id varchar(2) , "
							+ "Login_Date Date ,"
							+"FOREIGN KEY (U_Id) REFERENCES UserDetails(U_Id));"
							+"insert into TableList (T_Name, Created_Date, No_Colmns) values('AppLog',"+c_Date+",2)" );

		}
		catch(Exception e)
		{
			System.out.println("Table Creation Failed");
		}
	} 

	
	
	
	public PreparedStatement insertSecData(Connection con)
	{

		try 
		{
			prep=con.prepareStatement("insert into LoginDetails(U_Id,Log_Id,Password,ReqPassRecov,Email_Id) values(?,?,?,?,?)");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}


		return prep;
	}

	
	
	
	public void insertData(String tableName, String columns, String values)
	{

		try
		{
			if(columns==null)
		{
			query="insert into "+tableName+" values("+values+")";
		}
		else
		{
			query="insert into "+tableName+" ("+columns+") values("+values+")";
		}
		stat=con.createStatement();
		stat.execute(query);
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
	}

	
	
	
	public boolean checkDupData(String columns, String tableName, String condition )
	{
		query= "Select "+columns+" from "+tableName+" where "+condition+"";
		boolean isDupData=false;
		try 
		{
			this.CreateCon();
			stat=con.createStatement();
			ResultSet pass=stat.executeQuery(query);
			while(pass.next())
			{
				isDupData=true;
				return isDupData;
			}
		} 
		catch (SQLException e) 
		{
			return isDupData;
		}	
		return isDupData;
	}

}