package com.springBoot.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.springBoot.Repo.StudentRepo;
import com.springBoot.model.Student;

@Service
public class StudentService {
	StudentRepo studentRepo;
	public StudentService(StudentRepo studentRepo) {		
		this.studentRepo=studentRepo;		
	}
	public List<Student> getAllStudent() {
		List<Student> stList = new ArrayList<>();
		studentRepo.findAll().forEach(stList::add);
		return stList;
	}
	public Student getStudent(int id) {
		return studentRepo.findById(id).get();
		}
	public Student saveStduent(Student student) {
		return studentRepo.save(student);
		//return student;
	}

}
