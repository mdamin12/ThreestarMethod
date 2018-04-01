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
		
		System.out.println("Q no-17:"+getConvertedString(20));
		
		System.out.println("Q no-18:"+getTextValue("30"));
		
		System.out.println("Q no-19:"+getChar("This is a String"));
		
		System.out.println("Q no-20:"+getSum("this is a String"));
		
		System.out.println("Q no-21:"+getLastFiveChar("This is a String"));
		
		System.out.println("Q no-22:"+getFirstFiveChar("this is a String"));
		
		System.out.println("Q no-23:"+ getFifthToTenthChar("This is a String"));
		
		System.out.println("Q no-24:"+ getWord("This is a String"));
		
		System.out.println("Q no-25: "+ getFirstWord("This is a String"));
		
		System.out.println("Q no-26:"+ getWord("This is a String", "is"));
		
		System.out.println("Q no-27:"+getCharCount("This is a String", 'a'));
		
		System.out.println("Q no-28:"+ searchSentence("This is a String", "is"));
		
		System.out.println("Q no-29:"+ getConsonantCount("This is a String"));
		
		System.out.println("Q no-30:"+ getVowels("This is a String"));
		
		System.out.println("Q no- 31:"+ getUpperCaseChar("This is A String"));
		
		System.out.println("Q no-32:"+getCgahCountWithoutWhitespace("This is a String"));
		
		System.out.println("Q no-33:"+ getRepeatedChar("This is a String"));
		
		
		
		
		
	}
	/**
	 * Q no:33
	 * write a method that take one String input and return all repeated character without whitespace
	 * parameter:String text
	 * returnTYpe:String
	 * ServingBucket:variable
	 */
	public static String getRepeatedChar(String text){
		String repeatedChar = "";
		
		text = text.replaceAll(" ", "");
		text = text.toLowerCase();
		
		for(int i = 0; i < text.length(); i++){
			for(int j = i+1; j < text.length();j++){
				
				if(text.charAt(i) == text.charAt(j)){
					String Character = String.valueOf(text.charAt(i));
					
					if(! repeatedChar.contains(Character)){
						repeatedChar = repeatedChar + text.charAt(i);
					}
				}
				
			}
		}
		
		return repeatedChar;
	}
	/**
	 * Q no:32
	 * write a method that take one String input and return the count of character without whitespace
	 * parameter:String text
	 * returnType:int
	 * ServingBucket:variable
	 */
	public static int  getCgahCountWithoutWhitespace(String text){
		int charCount = 0;
		text = text.replaceAll(" ", "");
		
		charCount = text.length();
	
		return charCount;
	}
	/**
	 * Q no :31
	 * write a method that take one String input and return the count of all upper case Character
	 * parameter:String text
	 * returnType:int
	 * ServingBucket:variable
	 */
	public static int getUpperCaseChar(String text){
		int charCount = 0;
		
		for(int i = 0; i < text.length(); i++){
			 if(Character.isUpperCase(text.charAt(i))){
				 charCount = charCount +1;
			 }
		}
		return charCount;
	}
	/**
	 * Q no:30
	 * write a method that take one String input and return the count of all vowels
	 * parameter:String text
	 * returnType:int
	 * ServingBucket:variable
	 */
	public static int getVowels(String text){
		int count = 0;
		
		String vowel = "aeiou";
		text = text.toLowerCase();
		
		for(int i = 0; i < text.length();i++){
			String character = String.valueOf(text.charAt(i));
			
			if(vowel.contains(character)){
				count = count+1;
			}
		}
		return count;
	}
	/**
	 * Q no:29
	 * write a method that take one String input and return the count of all consonant
	 * parameter:String text
	 * returnType:int
	 * ServingBucket:variable
	 */
	public static int getConsonantCount(String text){
		int count = 0;
		
		String consonant = "bcdfghjklmnpqrstvwxyz";
		text = text.toLowerCase();
		
		for(int i = 0; i < text.length(); i++){
			String character = String.valueOf(text.charAt(i));
			
			if(consonant.contains(character)){
				count = count +1;
			}
		}
		return count;
	}
	/**
	 * Q no:28
	 * write a method that take one String & one word input and return true if that sentence contain given word 
	 * otherwise return false
	 * parameter:String text,String word
	 * returnType:boolean
	 * ServingBucket:variable
	 */
	public static boolean searchSentence(String text,String word){
		boolean sentence = false;
		
		String[] wordArray = text.split(" ");
		
		for(int i = 0; i < wordArray.length;i++){
			if(wordArray[i].equalsIgnoreCase(word)){
				sentence = true;
			}
		}
		return sentence;
	}
	/**
	 * Q no:27
	 * write a method that take one String and one character input and return the count of that given character
	 * parameter:String text,char character
	 * returnType:int
	 * ServingBucket:variable
	 */
	public static int getCharCount(String text,char character){
		int count = 0;
		text = text.toLowerCase();
		character = Character.toLowerCase(character);
		
		for(int i = 0; i < text.length();i++){
			if(text.charAt(i) == character){
				count = count+1;
			}
		}
		return count;
	}
	/**
	 * Q no:26
	 * write a method that take one String and one word input and return the count of that given word
	 * parameter:String text,String word
	 * returnType:int
	 * ServingBucket:variable
	 */
	public static int getWord(String text,String word){
		int count = 0;
		String[] wordArray = text.split(" ");
		
		for(int i = 0; i < wordArray.length; i++){
			if(wordArray[i].equalsIgnoreCase(word)){
				count = count+1;
			}
		}
		return count;
	}
	/**
	 * Q no:25
	 * write a method that take one String input and return first word
	 * parameter:String text
	 * returnType:String
	 * ServingBucket:variable
	 */
	public static String getFirstWord(String text){
		String message = null;
		
		String[] wordArray = text.split(" ");
		
		message = wordArray[0];
		
		return message;
	}
	/**
	 * Q no:24
	 * write a method that take one String input and return a list of all word 
	 * parameter:String text
	 * returnType:ArrayList<String>
	 * ServingBucket:list
	 */
	public static ArrayList<String> getWord(String text){
		ArrayList<String> wordList = new ArrayList<String>();
		
		String[] wordArray = text.split(" ");
		
		for(int i = 0; i < wordArray.length; i++){
			wordList.add(wordArray[i]);
		}
		return wordList;
	}
	/**
	 * Q no:23
	 * write a method that take one String input and return fifth to tenth character as a String
	 * parameter:String text
	 * returnType:String
	 * ServingBucket:variable
	 */
	public static String getFifthToTenthChar(String text){
		String subsString = null;
		
	    subsString = text.substring(4, 10);
		
		return subsString;
	}
	/**
	 * Q no:22
	 * write a method that take one String input and return a list of first  five character
	 * parameter:String text
	 * returnType:ArrayList<Character>
	 * ServingBucket:List
	 */
	public static ArrayList<Character> getFirstFiveChar(String text){
		ArrayList<Character> charList = new ArrayList<Character>();
		
		for(int i = 0; i <= 4; i++){
			charList.add(text.charAt(i));
		}
		return charList;
	}
	/**
	 * Q no:21
	 * write a method that take one String input and return a list of last Five Character
	 * parameter:String text
	 * returnType:ArrayList<Character>
	 * ServingBucket:List
	 */
	public static ArrayList<Character> getLastFiveChar(String text){
		ArrayList<Character> charList = new ArrayList<Character>();
		
		for(int i = text.length()-5; i < text.length();i++){
			charList.add(text.charAt(i));
		}
		
		
		return charList;
	}
	/**
	 * Q no:20
	 * write a method that take a one String input and return the sum of all index
	 * parameter:String text
	 * returnType:int
	 * ServingBucket:variable
	 */
	public static int getSum(String text){
		int sum = 0;
		
		for(int i = 0; i < text.length(); i++){
			sum = sum+i;
		}
		return sum;
	}
	/**
	 * Q no:19
	 * write a method that String input and return true if it contains char 'a' otherwise return false
	 * parameter:String text
	 * returnTYpe:boolean
	 * ServingBucket: variable
	 */
	public static boolean getChar(String text){
		boolean result = false;
		
		text = text.toLowerCase();
		
		result = text.contains("a");
		
		return result;
	}
	
	/**
	 * Q no:18
	 * write a method that take one String representation of number input and return the same value as a integer
	 * parameter:String number
	 * returnType:int
	 * ServingBucket:variable
	 */
	public static int getTextValue(String number){
		int textValue = 0;
		
		textValue = Integer.valueOf(number);
		
		return textValue;
	}
	/**
	 * Q no:17
	 * write a method that take one number input and return the same value as a String
	 * parameter:int number
	 * returnType:String
	 * ServingBucket:variable
	 */
	public static String getConvertedString(int number){
		String text = null;
		
		text = String.valueOf(number);
		
		return text;
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
