package com.Apps.pdfGenrate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.Apps.pdfGenrate.service.ClientUsage;
import com.Apps.pdfGenrate.service.OurClients;

@Controller
public class ClientInfo {

//	@GetMapping("/clientInfo")
//	public String clientInfo(Model model) {
	@GetMapping("/clientInfo")
	public String clientInfo(ModelMap modelMap, @ModelAttribute("clientInfo") OurClients clientInfo) {
		OurClients client = new OurClients();
		System.out.println(client.getClientUsage());
//		client.setDate(new Date());
		modelMap.addAttribute("client", client);

		ClientUsage clientUsage = new ClientUsage();
//		modelMap.addAttribute("clientUsage", clientUsage);
		return "client_info";
	}
}
