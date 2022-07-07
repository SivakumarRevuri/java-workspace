package com.shiv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiv.model.Student;

public interface StudentRepository  extends JpaRepository<Student, Long>{
	public List<Student> findByName(String name);
}
