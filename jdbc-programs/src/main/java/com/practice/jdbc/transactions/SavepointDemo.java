package com.practice.jdbc.transactions;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

import com.practice.jdbc.ConnectionSingleton;

public class SavepointDemo {

    public void transaction() {

	Connection connection = ConnectionSingleton.getConnection();
	Savepoint s1 = null;
	Savepoint s2 = null;
	Savepoint s3 = null;
	Savepoint s4 = null;
	try {
	    Statement stmt = connection.createStatement();
	    connection.setAutoCommit(Boolean.FALSE);

	    stmt.executeUpdate("insert into user values('siva',21,9491528587,23000)");
	    s1 = connection.setSavepoint();

	    stmt.executeUpdate("insert into user values('kumar',20,9491528587,23000)");
	    s2 = connection.setSavepoint();

	    stmt.executeUpdate("insert into user values('revuri',26,9491528587,23000)");
	    s3 = connection.setSavepoint();

	    stmt.executeUpdate("insert into user values('pavan',20a,9491528587,23000)");
	    s4 = connection.setSavepoint();

	    connection.commit();
	    // con.setAutoCommit(true);
	} catch (SQLException e) {
	    if (s1 != null) {
		try {
		    connection.commit();
		} catch (SQLException e1) {
		    e1.printStackTrace();
		}
	    } else {
		try {
		    connection.rollback();
		} catch (SQLException e1) {
		    e1.printStackTrace();
		}
	    }
	    if (s2 != null) {
		try {
		    connection.commit();
		} catch (SQLException e1) {
		    e1.printStackTrace();
		}
	    } else {
		try {
		    connection.rollback();
		} catch (SQLException e1) {
		    e1.printStackTrace();
		}
	    }
	}
	if (s3 != null) {
	    try {
		connection.commit();
	    } catch (SQLException e1) {
		e1.printStackTrace();
	    }
	} else {
	    try {
		connection.rollback();
	    } catch (SQLException e1) {
		e1.printStackTrace();
	    }
	}

	if (s4 != null) {
	    try {
		connection.commit();
	    } catch (SQLException e1) {
		e1.printStackTrace();
	    }
	}
    }

    public static void main(String[] args) {
	SavepointDemo t = new SavepointDemo();
	t.transaction();
    }
}
