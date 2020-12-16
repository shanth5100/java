package com.Apps.pdfGenrate.service;

import java.util.Date;
import java.util.List;

public class OurClients {
	
	private static Long invoiceId;
	private Date date;
	
	private List<ClientUsage> clientUsage;
	
	public List<ClientUsage> getClientUsage() {
		return clientUsage;
	}

	public void setClientUsage(List<ClientUsage> clientUsage) {
		this.clientUsage = clientUsage;
	}

	public static Long getInvoiceId() {
		return invoiceId;
	}

	public OurClients() {
		System.out.println("Model bind");
	}

	private String client_name = "Prashanth"; // = "Prashanth"

	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

//	public static Long getInvoiceId() {
//		return invoiceId;
//	}

	public static void setInvoiceId(Long invoiceId) {
		OurClients.invoiceId = invoiceId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
