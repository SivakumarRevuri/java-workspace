package com.practice.jdbc.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.practice.jdbc.ConnectionSingleton;

public class CallableStatementDemo {

    public static void main(String[] args) {
	Connection connection = ConnectionSingleton.getConnection();
	try {
	 // to call a StoredProcs
	    CallableStatement call = connection.prepareCall("{call insertR(?,?,?)}"); 
	    call.setInt(1, 7);
	    call.setString(2, "revanuru");
	    call.setInt(3, 23000);
	    // execute a statement
	    int a = call.executeUpdate();
	    System.out.println(a);
	} catch (SQLException e) {
	    e.printStackTrace();
	}
    }

}
