package com.buzzfreeze.helloWorld;

public class Lab4 {
	public static void main(String[] args) {
		int score = 55;
		boolean isHandSome = true;
		if(score >= 80) {
			System.out.println("Good");
		}else if((score >= 50) && (score < 80)) {
			if(isHandSome == true) {
				System.out.println("Good");
			}else {
				System.out.println("normal");
			}
		}else if(score < 50 ) {			
			if(isHandSome == true) {
				System.out.println("Good");
			}else {
				System.out.println("fail");
			}
		}
	}
}
