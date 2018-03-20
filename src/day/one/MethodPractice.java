package day.one;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodPractice {
	
	public static void main(String[] args) {
		
		System.out.println("Q no-11:" +Arrays.toString(getNumber(20)));
		
		System.out.println("Q no-12:" +Arrays.toString(getNumb(20)));
		
		System.out.println("Q no-13: "+getNumberList(20));
		
		System.out.println("Q no-14: "+getFizzBuzz(21));
		
		int[] numberArray ={ 20,40,10,60,80,25};
		System.out.println("Q no-15: "+getMaxNumber(numberArray));
		
		int[] numberArrayTwo ={40,50,90,15,30,25};
		System.out.println("Q no-16:"+ getMinNumber(numberArrayTwo));
		
		
		
		
		
	}
	/**
	 * Q no:16
	 * write a method that take one number array input and return the min number
	 * parameter:int[] numberArray
	 * returnType:int
	 * ServinGbucket:variable
	 */
	public static int getMinNumber(int[] numberArray){
		int minNumber = numberArray[0];
		
		for(int i = 0; i < numberArray.length;i++){
			
			if(minNumber > numberArray[i]){
				minNumber = numberArray[i];
			}
		}
		return minNumber;
	}
	/**
	 * Q no:15
	 * write a method that take one number array input and return the max number
	 * parameter:int[] numberArray
	 * returnType:int
	 * ServingBucket:variable
	 */
	public static int getMaxNumber(int[] numberArray){
		int maxNumber = numberArray[0]; 
		
		for(int i = 0; i < numberArray.length;i++){
		
		if(maxNumber < numberArray[i]){
			maxNumber = numberArray[i];
		}
		}
		
		return maxNumber;
	}
	/**
	 * Q no:14
	 * write a method that take one number input and return 'fizz' if the given number divided by 5 and return 'buzz'
	 * if the given number divided by 5 && 3 otherwise return 'fizz buzz'
	 * parameter:int number
	 * returntype:String
	 * ServingBucket:variable
	 */
	public static String getFizzBuzz(int number){
		String message = null;
		
		if(number % 5 == 0 && number % 3 == 0){
			message = "buzz";
		}else if(number % 5 == 0){
			message = "fizz";
		}else{
			message = "fizz buzz";
		}
		return message;
	}
	/**
	 * Q no:13
	 * write a method that take one number input and return a number list starting from 0 to that given number
	 * parameter:int number
	 * returnType:ArrayList<Integer>
	 * ServinGbucket:List
	 */
	public static ArrayList<Integer> getNumberList(int number){
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		for(int i = 0; i <= number; i++){
			numberList.add(i);
		}
		return numberList;
	}

	/**
	 * Q no:12
	 * write a method that take one number input and return an Array that contains 1 to given number
	 * parameter:int number
	 * returnType:int[]
	 * ServingBucket:variable
	 */
	public static int[] getNumb(int number){
		int[] numArray = new int[number];
		
		for(int i = 1; i <= number; i++){
			numArray[i-1] = i;
		}
		return numArray;
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
