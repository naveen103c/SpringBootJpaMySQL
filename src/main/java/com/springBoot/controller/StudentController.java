package com.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import com.springBoot.model.*;
import com.springBoot.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/")
	private ModelAndView getForm() {
		ModelAndView mc = new ModelAndView();
		mc.setViewName("index");
		return mc;
	}
	@GetMapping("/student")
	private List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}

	@GetMapping("/student/{id}")
	private Student getStudent(@PathVariable("id") int id) {
		return studentService.getStudent(id);
	}

	@PostMapping("/student")
	private Student saveStudent(@RequestBody Student student) {
		return studentService.saveStduent(student);
	}

	@GetMapping("/getForm")
	private ModelAndView studentForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employeeForm");
		return mv;
	}
	
	@PostMapping("/saveDetails")
	public ModelAndView saveDetails(@RequestParam("employeeName") String employeeName,
			@RequestParam("employeeEmail") String employeeEmail, ModelMap modelMap) {
		modelMap.put("employeeName", employeeName);
		modelMap.put("employeeEmail", employeeEmail);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewDetails");
		return mv;
	}
}
