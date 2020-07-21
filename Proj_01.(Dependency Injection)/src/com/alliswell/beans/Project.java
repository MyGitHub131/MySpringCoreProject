package com.alliswell.beans;

import org.springframework.beans.factory.annotation.Value;

public class Project {
	@Value("${Project.project_id}")
	private int project_id;
	@Value("${Project.name}")
	private String name;
	@Value("${Project.domain}")
	private String domain;
	@Value("${Project.client}")
	private String client;
	@Value("${Project.duration}")
	private String duration;
	@Value("${Project.status}")
	private String status;

	/*public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public void setStatus(String status) {
		this.status = status;
	}
*/
	public void display_Project() {
		System.out.println("***Project Information Details***");
		System.out.println("---------------------------------");
		System.out.println("Project_Id : " + project_id);
		System.out.println("Name : " + name);
		System.out.println("Domain : " + domain);
		System.out.println("Client : " + client);
		System.out.println("Duration : " + duration);
		System.out.println("Status : " + status);
	}
}
