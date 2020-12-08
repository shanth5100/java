package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.User;

//@RestController
@Controller
@RequestMapping("/register")
public class Register {

//	@GetMapping
//	public User register(@ModelAttribute("user") User user) {
//		return user;
//	}
	
	@GetMapping
//	@GetMapping("/register")
//	@RequestMapping("/register")
	public String register(Model model) {
		
		User user =new User();
		model.addAttribute("user", user);
		
		return "register";
	}
	
	@PostMapping
//	@PostMapping("/register")
//	@RequestMapping
	public String submit(@ModelAttribute("user") User user) {
		System.out.println(user);
//		User user =new User();
//		model.addAttribute("user", user);
		
		return "register_success";
	}
}
