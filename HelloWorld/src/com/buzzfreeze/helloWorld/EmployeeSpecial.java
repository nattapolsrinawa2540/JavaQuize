package com.buzzfreeze.helloWorld;

//1. extends Employee
//2. EmployeeSpecial มี property เพิ่มเข้ามา เป็น Stirng ชื่อ specialSkill
//3. มี Contructor เพิ่มเข้ามา โดย สามารถใส่ specialSkill เข้ามาได้ แล้วก็จะ assign special skill เข้า property เรา
public class EmployeeSpecial extends Employee {
	public String specialSkill;
	
	public EmployeeSpecial(String firstnameInput, String lastnameInput, int salaryInput, String positionInput, String specialSkillInput) {
		super(firstnameInput, lastnameInput, salaryInput, positionInput);
		// TODO Auto-generated constructor stub
	}

}
