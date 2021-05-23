package com.buzzfreeze.helloWorld;

public class Employee {
	public String firstname;
	public String lastname;
	protected int salary;
	public String position;
	
	public static void main(String[] args) {
		Employee em1 = new Employee("Nattapol", "Srinawa", 10000, "CEO");
		System.out.println(em1);
		//em1.helloFriend("Mack");
		//String employeeString = em1.toString();
		//System.out.println(employeeString);
		//test();
		//em1.checkPositon();
		//Employee[] employees = new Employee[3];
		//for (int i = 0; i < employees.length; i++) {
		//	employees[i] = new Employee("First name " + i, "last "+ i, 10000 *i, "position "+ i);
		//}
		//System.out.println(employees[1].firstname);
		//System.out.println(employees[2].firstname);
		//System.out.println(employees[1].salary);
		//System.out.println(employees[0].position);
	}
	@Override
	public String toString() {
		return "First Name : " + this.firstname + " Last name " + this.lastname;
	}
	
	public static void test() {
		System.out.println("This is static method");
	}
	
	public Employee(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.salary = salaryInput;
		this.position = positionInput;
	}
	public void hello() {
		System.out.println("Hello " + this.firstname );
	}
	public void helloFriend(String firstName) {
		System.out.println("I am "+ this.firstname + " I want to meet you " + firstName);
	}
	public int getSalary() {
		return salary;
	}	
	
	public void checkPositon() {
		System.out.println("Postion: " + this.position);
	}
}

