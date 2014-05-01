package edu.web;


import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named
@Scope("session")
public class ClientBean {
	private int id;
	private String login;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
