package com.example.demo.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	public UserController() {
		System.out.println("Helllo User controller");
	}
	
	@Autowired
	UserDao userDao;

	@GetMapping("/list")
	public String getAllUsers(Model model) {
		try {
			List<User> usersList =  (List<User>) userDao.findAll();
			if (!usersList.isEmpty()) {
				List<com.example.demo.controllers.util.User> usersListCon = new LinkedList<com.example.demo.controllers.util.User>();
				for (User user : usersList) {
					com.example.demo.controllers.util.User controllerUser = new com.example.demo.controllers.util.User();
					
					controllerUser.setUsername(user.getUsername());
					controllerUser.setId(user.getId());
					controllerUser.setPassword(user.getPassword());
					controllerUser.setName(user.getName());
					controllerUser.setEmail(user.getEmail());
					
					usersListCon.add(controllerUser);
				}
				model.addAttribute("userList", usersListCon);
			}
			return "user_list";
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return "redirect:/error";
		}
	}
}
