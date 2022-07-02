package com.shiv.services;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.shiv.business.StudentBusinessOperations;
import com.shiv.model.Student;

public class ConnectionPoolSpringJDBC implements StudentBusinessOperations {

	private JdbcTemplate jdbcTemplate;
	protected static ConfigurableApplicationContext context;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public static void main(String[] args) throws Exception {

		context = new ClassPathXmlApplicationContext("com/shiv/resources/springjdbc.xml");
		Student student = new Student(9, "kumar", "kumar@gmail.com", "india");
		System.out.println(new ConnectionPoolSpringJDBC().createStudent(student));
		context.close();
	}

	@Override
	public int createStudent(Student student) throws Exception {
		ConnectionPoolSpringJDBC jdbc = (ConnectionPoolSpringJDBC) context.getBean("connection");
		Object array = new Object[] { student.getStudentId(), student.getStudentName(), student.getStudentEmail(),
				student.getStudentAddress() };
		return jdbc.jdbcTemplate.update("insert into student values(?,?,?,?)", array);
	}

	@Override
	public boolean updateStudent(Student student) throws Exception {
		return false;
	}

	@Override
	public boolean deleteStudent(Student student) throws Exception {
		return false;
	}

}
