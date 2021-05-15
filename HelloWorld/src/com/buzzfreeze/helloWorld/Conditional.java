package com.buzzfreeze.helloWorld;

public class Conditional {
	public static void main(String[] args) {
		int i = 20;
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println("i == " + i);		
		--i;
		--i;
		--i;
		--i;
		--i;
		System.out.println("i == " + i);
		ConditionalSub();
	}
	public static void ConditionalSub () {
		int value_1 = 1;
		int value_2 = 2;
		if ((value_1 == 1) && (value_2 == 2))
			System.out.println("value1 is 1 AND value2 is 2");
		if ((value_1 == 1) || (value_2 == 1))
			System.out.println("value1 is 1 OR value2 is 1");
	}
}
