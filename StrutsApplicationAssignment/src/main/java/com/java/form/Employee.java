package com.java.form;

import java.util.Arrays;

import org.apache.struts.action.ActionForm;

public class Employee extends ActionForm{
	private String name;
	private String id;
	private String email;
	private String mobile;
	private String[] hobbies;
	public Employee(){
		
	}

	public Employee(String name, String id, String email, String mobile) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", email=" + email + ", mobile=" + mobile + ", hobbies="
				+ Arrays.toString(hobbies) + "]";
	}


	

}
