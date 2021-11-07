package com.lithan.action;

import com.lithan.dao.RegisterDao;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{

	private static final long serialVersionUID = 1L;

	private String firstname;
	private String lastname;
	private String username;
	private String email;
	private String password;
	private String country;
	private String city;
	private String companyname;
	private String address;
	
	@Override
	public String execute() throws Exception {
		
		RegisterDao dao = new RegisterDao();
		try{
			dao.insertdata(firstname,lastname, username, email, password, country, city, companyname, address);
			System.out.print("Data are successfully saved");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "THANKYOU";
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getCompanyname() {
		return companyname;
	}



	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}
}
