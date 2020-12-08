package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

//	@RequestMapping("hello")
//	public void main() {
//		System.out.println("Hello controller");
//	}
	
	@RequestMapping("hello")
//	@ResponseBody // making the application to return data
	public String main() {
		System.out.println("Hello controller");
//		return "NewFile.jsp";
		return "index";
	}

}
