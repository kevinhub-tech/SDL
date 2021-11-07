package com.lithan.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.lithan.dao.LoginDao;

public class LoginAction implements SessionAware{

	private String username;
	private String password;
	SessionMap<String,String> sessionmap;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void setSession(Map map) {  
	    sessionmap=(SessionMap<String, String>)map;  
	    sessionmap.put("login","true");  
	}  
	  

	public String logout() {
		sessionmap.invalidate();
		return "logout";
	}
	
	public String execute() {
		if(LoginDao.login(username, password)){  
	        return "success";  
	    }  
	    else{  
	        return "error";  
	    }  
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
