package com.buzzfreeze.helloWorld;

public class Lab6 {
	public static void main(String[] args) {
		int i = 0;
		int b = 0;
		int c = 1;
		int total_2 = 0;
		int total = 0;
		int array_int[] = {1,2,3,4,5};
		while (i <= 10) {
		  System.out.println(i);
		  i++;
		}
		
		while( b <= 10) {
			total += b;
			if(b == 10) {
				System.out.println("ผลรวม : " + total);
			}
			b++;
		}
		
		while (c <= 100) {
			if(c % 12 == 0) {
				System.out.println(c);
			}
			c++;
		}
		
		for(int counter : array_int) {
			System.out.println("Counter : " + counter);
		}
	}
}
