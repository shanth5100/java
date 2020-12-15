package com.Apps.pdfGenrate.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itextpdf.html2pdf.HtmlConverter;

@Controller
@RequestMapping("/genaratePDF")
public class GenaratePDF {
	public GenaratePDF() {
		System.out.println("Constuctor :   GenaratePDF");
	}
	
	@PostMapping
	public String name() {
		System.out.println("GenaratePDF");
		try {
			ClassLoader classLoader = getClass().getClassLoader();
//			File file = new File(classLoader.getResource("templates/pdfPage.html").getFile());
			File file = new File(classLoader.getResource("templates/index.html").getFile());
//			File file = new File(classLoader.getResource("/static/text.txt").getFile());
			if (file.exists()) {
				System.out.println(file.length());
				System.out.println(file.list());
				HtmlConverter.convertToPdf(new FileInputStream(file), new FileOutputStream( "hella.pdf"));
//				HtmlConverter.convertToPdf(new FileInputStream(file), new FileOutputStream( System.getProperty("user.home") + "/hella.pdf"));
				System.out.println("Working file = there");
			} else {

			}
//			HtmlConverter.convertToPdf(new FileInputStream(file), new FileOutputStream("hello.pdf"));
			
//			HtmlConverter.convertToPdf(new FileInputStream("/demo/src/main/resources/static/text.txt"), new FileOutputStream("hello.pdf"));
//			HtmlConverter.convertToPdf(new FileInputStream("classpath:/templates/pdfTemp2.html"), new FileOutputStream("hello.pdf"));
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException " + e.getMessage());
			e.printStackTrace();
		} 
		return "pdfPage";
	}
}

