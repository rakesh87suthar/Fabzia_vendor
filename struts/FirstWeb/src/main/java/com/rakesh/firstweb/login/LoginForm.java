package com.rakesh.firstweb.login;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm{
	
	public String userName,password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public LoginForm() {
		// TODO Auto-generated constructor stub
	}

	public LoginForm(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

}
