package com.springBoot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.springBoot.service.UserService;
import java.util.List;
import com.springBoot.model.UserRecord;

@RestController
public class UserController {
	@Autowired
	UserService userservice;

	@GetMapping("/Users")
	public List<UserRecord> UsersPage() {
		return userservice.getAllUsers();
	}

	@GetMapping("/Home")
	public String HomePage() {
		return "index";
	}

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
}
