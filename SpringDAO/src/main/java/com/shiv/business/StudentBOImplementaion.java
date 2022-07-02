package com.shiv.business;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.commons.dbcp.BasicDataSource;

import com.shiv.model.Student;

public class StudentBOImplementaion implements StudentBusinessOperations {

	private static BasicDataSource dataSource;

	public static void setDataSource(BasicDataSource dataSource) {
		StudentBOImplementaion.dataSource = dataSource;
	}

	@Override
	public int createStudent(Student student) throws Exception {
		Connection connection = dataSource.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student values(?,?,?,?)");
		preparedStatement.setLong(1, student.getStudentId());
		preparedStatement.setString(2, student.getStudentName());
		preparedStatement.setString(3, student.getStudentEmail());
		preparedStatement.setString(4, student.getStudentAddress());

		int i = preparedStatement.executeUpdate();

		connection.close();
		return i;
	}

	@Override
	public boolean updateStudent(Student student) throws Exception {
		updateStudentName(student.getStudentName());
		return false;
	}

	private void updateStudentName(String studentName) {
		
	}

	@Override
	public boolean deleteStudent(Student student) throws Exception {

		return false;
	}

}
