package com.buzzfreeze.helloWorld;

public class Lab7 {
	public static void main(String[] args) {
		int i = 20;
		int b = 100;
		int index = 0;
		do {
			System.out.println(i);
			i--;
		}while (0 <= i);
	
		do {
			System.out.println("Index : " + index);
			index++;
		}while(b % index == 1);
	}
}
