package com.buzzfreeze.helloWorld;

//1. extends Employee
//2. EmployeeSpecial �� property ��������� �� Stirng ���� specialSkill
//3. �� Contructor ��������� �� ����ö��� specialSkill ������� ���ǡ�� assign special skill ��� property ���
public class EmployeeSpecial extends Employee {
	public String specialSkill;
	
	public EmployeeSpecial(String firstnameInput, String lastnameInput, int salaryInput, String positionInput, String specialSkillInput) {
		super(firstnameInput, lastnameInput, salaryInput, positionInput);
		// TODO Auto-generated constructor stub
	}

}
