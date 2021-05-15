package com.buzzfreeze.helloWorld;

public class HelloWorld {
	public static void main (String [] args) {
		/*System.out.println("Hello World");
		System.out.println("Hello World");*/
		//System.out.println("Hello World");
		//String[] cars;
		/*int num_1 = 1;
		float num_2 = 5.99f;
		boolean a = true;
		String b = "Macky";
		char myLetter = 'D';
		System.out.println("This is a int" + num_1);
		System.out.println("This is a float" + num_2);
		System.out.println("This is a boolean" + a);
		System.out.println("This is a String" + b);
		System.out.println("This is a char" + myLetter);*/
		bark();
		float a = 5.5f;
		int aa = (int)a;
		int b = 10;
		float bb = b;
		double c = 56.3466666666f;
		float cc = (float)c;
		char d = 'C';
		int dd = d;
		System.out.println("float -> int " + aa);
		System.out.println("int -> float " + bb);
		System.out.println("double -> float " + cc);
		System.out.println("char -> int " + dd);
		final String hello = "Hello";
		//hello = "World";
	}
	
	public static void bark () {
		String dogName = "Noodle";
		System.out.println("My dog name: " + dogName);
	}
}
