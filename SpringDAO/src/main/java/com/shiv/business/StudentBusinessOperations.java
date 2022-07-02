package com.shiv.business;

import com.shiv.model.Student;

public interface StudentBusinessOperations {

	public int createStudent(Student student) throws Exception;

	public boolean updateStudent(Student student) throws Exception;

	public boolean deleteStudent(Student student) throws Exception;

}
