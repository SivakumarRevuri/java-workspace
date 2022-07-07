package com.shiv.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiv.model.Student;
import com.shiv.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public Student save(Student student) {
		return studentRepository.save(student);
	}

	public Optional<Student> findStudent(Long id) {
		return studentRepository.findById(id);
	}

	public List<Student> fetchAll() {
		return (List<Student>) studentRepository.findAll();
	}

	public Boolean delete(Long id) {
		if (id != null) {
			studentRepository.deleteById(id);
			return Boolean.TRUE;
		}else
			return Boolean.FALSE;
	}
	
}
