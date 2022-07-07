package com.practice.jdbc.sqlstatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.practice.jdbc.ConnectionSingleton;

public class DQLusingPrepareStatement {

    public static void main(String[] args) {

	Connection con = null;

	try {
	    con = ConnectionSingleton.getConnection();
	    PreparedStatement pstmt = con.prepareStatement("select * from m_jdbc.user where age>?");
	    pstmt.setInt(1, 23);
	 // for DQL statements only we use executeQuery() method
	    ResultSet rs = pstmt.executeQuery();
	    while (rs.next()) {
		String name = rs.getString(1);
		int age = rs.getInt(2);
		String phone = rs.getString(3);
		double sal = rs.getDouble(4);

		System.out.println("Name: " + name + "  Age:  " + age + "  Phone:  " + phone + "  Sal:  " + sal);
	    }

	} catch (SQLException e) {
	    e.printStackTrace();
	} finally {
	    if (con != null) {
		try {
		    con.close();
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	    }
	}
    }

}
