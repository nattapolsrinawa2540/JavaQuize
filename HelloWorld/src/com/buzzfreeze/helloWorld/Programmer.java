package com.buzzfreeze.helloWorld;

public class Programmer extends Employee {
	
	public static void main(String[] args) {
		Programmer programmer = new Programmer("Nattapol", "Srinawa", 10000, "CEO");
		System.out.println(programmer.getSalary());
	}
	
	//public Programmer () {
	//	this.firstname = "Anonymous";
	//	this.lastname = "Anonymous";
	//}

	public Programmer(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
		super(firstnameInput, lastnameInput, salaryInput, positionInput);
		// TODO Auto-generated constructor stub
	}
	
	public void createWebsite(String template, String titleName) {
		
	}
	
	public void installWindows(String version, String productKey) {
		
	}
}
