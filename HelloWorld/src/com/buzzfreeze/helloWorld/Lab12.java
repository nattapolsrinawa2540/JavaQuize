package com.buzzfreeze.helloWorld;

public class Lab12 {
	public static void main(String[] args) {
		String String1 = "You and Me";
		String String2 = " you and me";
		String check = "Me";
		
		//Quize Create String
		char[] myChar = {'H','e','l','l','o',' ','W','o','r','l','d'};
		String myWorld = new String(myChar);
		System.out.println(myWorld);
		
		//Quize 1
		System.out.println(String1.equals(String2));
		//Quize 2
		if(String1.contains(check)) {
			System.out.println(check);
		}
		//Quize 3
		System.out.println(String1.length());
		//Quize 4
		System.out.println(String1.substring(1,4));
		//Quize 5
		System.out.println(String2.trim());
		//Quize 6
		System.out.println(String1.toUpperCase());
		//Quize 7
		System.out.println(String1.toUpperCase().trim());
	}
}
