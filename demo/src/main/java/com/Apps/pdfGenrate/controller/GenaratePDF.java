package com.Apps.pdfGenrate.controller;

import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Apps.pdfGenrate.service.OurClients;

@Controller
//@RequestMapping("/genaratePDF")
public class GenaratePDF extends HttpServlet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	public GenaratePDF() {
//		System.out.println("Constuctor :   GenaratePDF");
//	}
	
	@GetMapping
	@RequestMapping(value = {"/", "/home"})
	public String getStartPage(Model model) {
//		@ModelAttribute("client") 
		OurClients client = new OurClients();
		model.addAttribute("clent", client);
		return "index";
	}
	
	@PostMapping("/genaratePDF")
	public String name(@ModelAttribute("clients") OurClients client, Model model, HttpServletRequest req) {
		System.out.println("req.getAttributeNames : "+ req.getParameter("name1").toString());
		System.out.println("req.getAttributeNames : "+ req.getParameterMap().containsKey("name1"));
//		System.out.println(req.);
		System.out.println("clients names : "+ client.getClient_name());
		client.setDate(new Date());
//		OurClients.setInvoiceId(client.getInvoiceId()+ 1);
//		System.out.println("client name : "+ client.getName());
		model.addAttribute("cleientInfo", client);
		return "pdfPage";
	}
	
//	@PostMapping
//	public String name() {
//		System.out.println("GenaratePDF");
//		try {
//			ClassLoader classLoader = getClass().getClassLoader();
////			File file = new File(classLoader.getResource("templates/pdfPage.html").getFile());
//			File file = new File(classLoader.getResource("templates/index.html").getFile());
////			File file = new File(classLoader.getResource("/static/text.txt").getFile());
//			if (file.exists()) {
//				System.out.println(file.length());
//				System.out.println(file.list());
//				HtmlConverter.convertToPdf(new FileInputStream(file), new FileOutputStream( "hella.pdf"));
////				HtmlConverter.convertToPdf(new FileInputStream(file), new FileOutputStream( System.getProperty("user.home") + "/hella.pdf"));
//				System.out.println("Working file = there");
//			} 
////			HtmlConverter.convertToPdf(new FileInputStream(file), new FileOutputStream("hello.pdf"));
//			
////			HtmlConverter.convertToPdf(new FileInputStream("/demo/src/main/resources/static/text.txt"), new FileOutputStream("hello.pdf"));
////			HtmlConverter.convertToPdf(new FileInputStream("classpath:/templates/pdfTemp2.html"), new FileOutputStream("hello.pdf"));
//		} catch (FileNotFoundException e) {
//			System.out.println("FileNotFoundException " + e.getMessage());
//		} catch (IOException e) {
//			System.out.println("IOException " + e.getMessage());
//			e.printStackTrace();
//		} 
//		return "pdfPage";
//	}
}

