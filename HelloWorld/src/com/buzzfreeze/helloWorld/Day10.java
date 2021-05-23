package com.buzzfreeze.helloWorld;

public class Day10 {
	public void main(String[] args) {
		Employee employee = new Employee("Nattapol", "Srinawa", 10000, "Bangkok");
		System.out.println(employee);
		
		CEO ceo = new CEO("Nattapol", "Srinawa", 10000, "Bangkok");
		System.out.println(ceo.getSalary());	
	}
}
