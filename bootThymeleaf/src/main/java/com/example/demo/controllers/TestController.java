package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
		return "NewFile";
	}

}
