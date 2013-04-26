package com.thalesgroup.authzforce.sdk.core.schema;

import java.util.ArrayList;
import java.util.List;

public class Responses {

	private List<Response> response;
	private String subject;
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Responses() {
		// TODO Auto-generated constructor stub
		response = new ArrayList<Response>();
	}
	
	public List<Response> getResponse() {
		return response;
	}

}
