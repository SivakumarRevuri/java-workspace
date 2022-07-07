package com.shiv.main.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shiv.main.model.Courses;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	private static List<Courses> courses = new ArrayList<>(
			Arrays.asList(new Courses("java", "Java Programming language", "java course description"),
					new Courses("sql", "SQL Server", "sql course description"),
					new Courses("spring", "Spring Framework", "Spring course description")));

	@GetMapping
	public List<Courses> getAllCourses() {
		return courses;
	}

	@GetMapping("/{courseId}")
	public Courses getById(@PathVariable String courseId) {
		for (Courses course : courses) {
			if (course.getCourseId().equalsIgnoreCase(courseId)) {
				return course;
			}
		}
		return null;
	}

	@PostMapping
	public Courses addCourse(@RequestBody Courses course) {
		return courses.add(course) ? course : null;
	}

	@PutMapping("/{id}")
	public Courses updateCourse(@RequestBody Courses course, @PathVariable String id) {
		for (int i = 0; i < courses.size(); i++) {
			Courses c = courses.get(i);
			if (c.getCourseId().equals(id)) {
				courses.set(i, course);
				return course;
			}
		}
		return null;
	}

	@DeleteMapping("/{id}")
	public boolean deleteCourse(@PathVariable String id) {
		return courses.removeIf(c -> c.getCourseId().equals(id));
	}
}
