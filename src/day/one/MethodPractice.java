package day.one;

import java.util.Arrays;

public class MethodPractice {
	
	public static void main(String[] args) {
		
		System.out.println("Q no-11:" +Arrays.toString(getNumber(20)));
		
		
		
	}
	/**
	 * Q no:11
	 * write a method that take one number input and return an Array that contains 0 to given number
	 * parameter:int number
	 * returnType:int[]
	 * ServingBucket:variable
	 */
	public static int[] getNumber(int number){
		int[] numberArray = new int[number+1];
		
		for(int i = 0; i <= number; i++ ){
			numberArray[i] = i;
		}
		return numberArray;
	}

}
