package com.buzzfreeze.helloWorld;

public class Lab10 {
	public static void main(String[] args) {
		int count = 10;
		for (int i = 0; i <= count; i++) {
			if(i == 2) {
				continue;
			}
			System.out.println(i);
		}
	}
}
