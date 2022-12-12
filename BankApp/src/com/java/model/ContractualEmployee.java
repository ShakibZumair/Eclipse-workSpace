package com.java.model;

public class ContractualEmployee extends Employee{
private int dailywage;
private int periodofcontract;

public ContractualEmployee() {
	
}

public ContractualEmployee(String name, String department, int id, String email,int dailywage, int periodofcontract) {
	super(name,department,id,email);
	this.dailywage = dailywage;
	this.periodofcontract = periodofcontract;
}

public int getDailywage() {
	return dailywage;
}
public void setDailywage(int dailywage) {
	this.dailywage = dailywage;
}
public int getPeriodofcontract() {
	return periodofcontract;
}
public void setPeriodofcontract(int periodofcontract) {
	this.periodofcontract = periodofcontract;
}

}
