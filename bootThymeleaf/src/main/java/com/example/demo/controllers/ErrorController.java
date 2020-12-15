package com.example.demo.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/error")
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController{

	private static final Logger LOGGER = LoggerFactory.getLogger(ErrorController.class);
	
//	@GetMapping
//	public String errorPage() {
//		return "error";
//	}
	
	@Override
	public String getErrorPath() {
		return "/error";
	}

	@RequestMapping("/error")
	public String errorPage(HttpServletRequest req, Model model) {
		
		String pageTitle = "Error";
		String errorPage = "error";
		
		Object status = req.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		System.out.println(Integer.valueOf(status.toString()));
		if (status != null) {
			Integer statusCode = Integer.valueOf(status.toString());
			
			if (statusCode == HttpStatus.NOT_FOUND.value()) {
				pageTitle =  "Page not found";
				errorPage = "error/404";
				LOGGER.error("Error 404");
			} else if (statusCode == HttpStatus.FORBIDDEN.value()) {
				pageTitle =  "Forbidden Error";
				errorPage = "error/403";
				LOGGER.error("Error 403");
			} else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
				pageTitle =  "INTERNAL SERVER ERROR";
				errorPage = "error/500";
				LOGGER.error("Error 500");
			}
			
		} 
		
		model.addAttribute("pageTitle", pageTitle);
		
		return errorPage;
	}
	
}
