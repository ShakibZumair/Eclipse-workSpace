package com.java.form;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.validator.ValidatorForm;

//public class Employee1 extends ActionForm{
//	private String name;
//	private String id;
//	private String email;
//	private String mobile;
//	private String password;
//	private String parameter;
//	private String age;
//	public Employee1(){
//		
//	}
//
//	public Employee1(String name, String id, String email, String mobile,String password) {
//		super();
//		this.name = name;
//		this.id = id;
//		this.email = email;
//		this.mobile = mobile;
//		this.password=password;
//	}
//
//	public String getParameter() {
//		return parameter;
//	}
//
//	public void setParameter(String parameter) {
//		this.parameter = parameter;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getMobile() {
//		return mobile;
//	}
//
//	public void setMobile(String mobile) {
//		this.mobile = mobile;
//	}
//
//
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
//
//	public String getAge() {
//		return age;
//	}
//
//	public void setAge(String age) {
//		this.age = age;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee1 [name=" + name + ", id=" + id + ", email=" + email + ", mobile=" + mobile + ", password="
//				+ password + ", parameter=" + parameter + ", Age=" + age + "]";
//	}
//
//	@Override
//	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//		// TODO Auto-generated method stub
//		ActionErrors errors=new ActionErrors();
//		if(this.name==null || this.name.length()==0)
//			errors.add("name" , new ActionMessage("emp.required","Name"));
//		if(this.email==null || this.email.length()==0)
//			errors.add("email" , new ActionMessage("emp.required","Email"));
//		if(this.mobile==null || this.mobile.length()==0)
//			errors.add("mobile" , new ActionMessage("emp.required","Mobile"));
//		if(this.age==null || this.age.length()==0)
//			errors.add("age" , new ActionMessage("emp.required","Age"));
//		return errors;
//		
//	}
//
//
//
//
//	
//
//}
public class Employee1 extends ValidatorForm{
	private String name;
	private String id;
	private String email;
	private String mobile;
	private String password;
	private String parameter;
	private int age;
	public Employee1(){
		
	}

	public Employee1(String name, String id, String email, String mobile,String password) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.mobile = mobile;
		this.password=password;
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
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



	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", id=" + id + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + ", parameter=" + parameter + ", Age=" + age + "]";
	}





	

}


