package com.buzzfreeze.helloWorld;

public class Lab13 {
	public static void main(String[] args) {
		int[][] twoD_array = {
				{1,2,3},{4,5,6},{7,8,9}	
		};
		int total = 0;
		
		
		
		//Quize 8
		for(int[] row : twoD_array) {
			for(int element : row) {
				System.out.println(element);
			}
		}
		
		for (int row = 0; row < twoD_array.length; row++) {
			for (int element = 0; element < twoD_array[row].length; element++) {
				if(element == 2) {
					//System.out.println(twoD_array[row][element]);
					total += twoD_array[row][element];
				}
				
			}
		}
		System.out.println("ผลรวมอาเรย์ตัวสุดท้ายแต่ละแถว : " + total);
		
	}
}
