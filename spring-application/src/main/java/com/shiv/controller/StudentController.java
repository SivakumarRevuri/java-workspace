package com.shiv.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shiv.dao.StudentService;
import com.shiv.model.Student;

@RestController
@RequestMapping("students")
public class StudentController {

	@Autowired
	private StudentService studentDAO;

	@PostMapping
	public Student addStudent(@Valid @RequestBody Student student) {
		return studentDAO.save(student);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudent(@Valid @PathVariable Long id) {
		Optional<Student> optionalStudent = studentDAO.findStudent(id);
		return optionalStudent.isPresent() ? ResponseEntity.ok().body(optionalStudent.get())
				: ResponseEntity.notFound().build();

	}

	@GetMapping
	public List<Student> getAllStudents() {
		return studentDAO.fetchAll();
	}

	@PutMapping("/{id}")
	public ResponseEntity<Student> updateStudent(@Valid @PathVariable Long id, @Valid @RequestBody Student student) {
		Optional<Student> optionalStudent = studentDAO.findStudent(id);
		Student st = optionalStudent.get();
		if (st == null) {
			return ResponseEntity.notFound().build();
		}
		st.setName(student.getName());
		st.setQualification(student.getQualification());
		Student updateStudent = studentDAO.save(st);

		return ResponseEntity.ok().body(updateStudent);
	}

	@DeleteMapping("/{id}")
	public boolean deleteStudent(@Valid @PathVariable Long id) {
		return studentDAO.delete(id);
	}

}
