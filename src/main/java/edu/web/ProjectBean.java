package edu.web;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named
@Scope("session")
public class ProjectBean {
	private int id;
	private String name;
	private int client;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClient() {
		return client;
	}
	public void setClient(int client) {
		this.client = client;
	}
}
