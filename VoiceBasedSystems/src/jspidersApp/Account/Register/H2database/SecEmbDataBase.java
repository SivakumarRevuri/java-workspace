package jspidersApp.Account.Register.H2database;

import jspidersApp.Account.Register.CreateUser.NewUser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;



public class SecEmbDataBase 
{
	private static int objCount = 1;

	private String userTable="UserDetails";
	private String logTable="LoginDetails";
	private String pRecTable="PasswordRecovery";
	private String appLog="AppLog";
	private String userSetting="U_Settings";

	private boolean passRecov=true;
	private Date c_Date= new Date();

	DbOperations h2= DbOperations.getInstance();


	private  SecEmbDataBase() 
	{
		objCount++;
	}

	public static synchronized SecEmbDataBase getInstance() 
	{
		if(objCount < 2 ){
			return new SecEmbDataBase();
		}
		return null;
	}


	public void register() 
	{
		try
		{
			Connection con=h2.CreateCon();
			boolean tPresent=h2.tablesPresent(con);
			if(!tPresent)
			{
				h2.createTables(con);
			}

			NewUser user= NewUser.getInstance();
			String fullName=user.getFirstName()+user.getLastName();

			PreparedStatement prep=h2.insertSecData(con);
			prep.setString(2, user.getUserName());
			prep.setBytes(3, user.getPassword() );
			prep.setBoolean(4, passRecov);
			prep.setString(5, user.getEmail_id());
			prep.execute();

			String s1="U_Name,Contact_No,DateOfBirth,Age";
			String s2="'"+fullName+"',"+user.getContactNo()+","+user.getDateOfBirth()+","+user.getAge()+","+this.c_Date+"";
			h2.insertData(userTable, s1, s2);
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
	}

	public boolean isEmIdPresent(String email_id2)
	{
		boolean e=h2.checkDupData("Email_Id",logTable, "Email_Id="+email_id2+"");
		return e;
	}


	public boolean isUNPresent(String uName)
	{
		boolean un=h2.checkDupData("Log_Id",logTable, "Log_Id="+uName+"");
		return un;
	}

	public boolean isUIdPresent(String u_id) 
	{
		boolean uI=h2.checkDupData("U_Id",logTable, "U_Id="+u_id+"");
		return uI;
	}

}
