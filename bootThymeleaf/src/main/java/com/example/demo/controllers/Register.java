package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.controllers.util.User;
import com.example.demo.dao.UserDao;

//@RestController
@Controller
//@RequestMapping("/register")
public class Register {
	
	@Autowired
	UserDao userDao;

//	@GetMapping
//	public User register(@ModelAttribute("user") User user) {
//		return user;
//	}
	
//	@GetMapping
	@GetMapping("/register")
//	@RequestMapping("/register")
	public String register(Model model) {
		
		User user =new User();
		model.addAttribute("user", user);
		
		List<String> list = Arrays.asList("shanth5100", "shanth5", "shant5", "shanthANU", "shanthAMMA", "123456", "12345", "1234", "123", "132");
		model.addAttribute("usernames", list);
		return "register";
	}
	
	@PostMapping("/success")
//	@PostMapping("/register")
//	@RequestMapping
	public String submit(@ModelAttribute("user") User user) {
		com.example.demo.model.User userEntity = new com.example.demo.model.User();
		
		userEntity.setUsername(user.getUsername());
		userEntity.setPassword(user.getPassword());
		userEntity.setEmail(user.getEmail());
		userEntity.setName(user.getName());
//		userEntity.setDob(user.getDob());		
		
		com.example.demo.model.User usercreated = null;
		try {
			usercreated = userDao.save(userEntity);
			System.out.println(user.getName());
//			return "redirect:/error";
			return "register_success";
		} catch (Exception e) {
			return "redirect:/error";
		}
		
//		if(usercreated == null) {
//			return "redirect:/error";
////			return "redirect:/error";
//		}
		
//		System.out.println(user.getName());
//		User user =new User();
//		model.addAttribute("user", user);
		
//		return "register_success";
	}
}
