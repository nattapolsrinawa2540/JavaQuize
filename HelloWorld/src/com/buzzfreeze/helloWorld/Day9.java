package com.buzzfreeze.helloWorld;

public class Day9 {
	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee("name"+i, "lastname"+i, i*10000, "position"+i);
		}
		System.out.println(employees[1].firstname);
		System.out.println(employees[2].firstname);
		System.out.println(employees[1].getSalary());
		employees[0].checkPositon();
	}
}
