package com.buzzfreeze.helloWorld;

public class Lab9 {
	public static void main(String[] args) {
		int count = 20;
		for (int i = 0; i <= count; i++) {
			if(i == 11)
			{
				System.out.println("Counter : " + i);
				continue;
			}
			
			System.out.println(i);
		}
	}
}
