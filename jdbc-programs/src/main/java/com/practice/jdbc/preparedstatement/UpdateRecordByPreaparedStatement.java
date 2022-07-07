package com.practice.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRecordByPreaparedStatement {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Connection con=null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");// load and register a driver
			// establish a connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root","shiva");
			// create a platform
			PreparedStatement pstmt=con.prepareStatement("update m_jdbc.user set age=? where name=? ");
			
			System.out.println("enter the user name");
			pstmt.setString(2,s.next());
			System.out.println("enter the age");
			pstmt.setInt(1,s.nextInt());
			// execute a statement
			int a= pstmt.executeUpdate();			
			System.out.println(a);
			
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally {
			if (con!=null) {
				try {
					s.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
