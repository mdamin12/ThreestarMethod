package day.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
		
		System.out.println("Q no-34:"+ getUniqueChar("This is a String"));
		
		int[] numberArrayThree ={ 10,20,30,40,45};
		System.out.println("Q no-35:"+ getSum(numberArrayThree));
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		numberList.add(50);
		System.out.println("Q no-36:"+getSum(numberList));
		
		System.out.println("Q no-37:"+getReverseString("This is a String"));
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(15);
		numList.add(10);
		numList.add(25);
		numList.add(35);
		numList.add(40);
		System.out.println("Q no-38:"+Arrays.toString(getConvertedListToArray(numList)));
		
		int[] numArray = { 20,30,40,50,60};
		System.out.println("Q no-39:"+getConvertedArrayToList(numArray));
		
		int[] numberArrayFour = { 50,30,10,40,55,80};
		System.out.println("Q no-40:"+Arrays.toString(getSortedArray(numberArrayFour)));
		
		ArrayList<Integer> numberListTwo = new ArrayList<Integer>();
		numberListTwo.add(50);
		numberListTwo.add(80);
		numberListTwo.add(90);
		numberListTwo.add(30);
		numberListTwo.add(20);
		System.out.println("Q no-41:"+ getSortedList(numberListTwo));
		
		int[] numberArrayFive = { 10,40,50,60,30,80,35};
		System.out.println("Q no-42:"+Arrays.toString(getBubbleSorted(numberArrayFive)));
		
		System.out.println("Q no-43:"+ getContainValue("This is a String wich contain 30"));
		
		System.out.println("Q no-44:"+getNumListFromString("This 30 is a 50 which contain 40"));
		
		System.out.println("Q no-45:"+ getEmail("This is a alamin.hawlader69@gmail.com which contain 40"));
		
		System.out.println("Q no-46:"+ getAlternateChar("This is a String"));
		
		System.out.println("Q no-47:"+ getAlernativeChar("This is a String"));
		
		
		
		
	}
	/**
	 * Q no:47
	 * write a method that take one String input and return the same String by making upperCase of all alternative 
	   characters and rest of the characters in lowerCase
	 * parameter:String text
	 * returnTYpe:String
	 * ServingBucket:variable
	 */
	public static String getAlernativeChar(String text){
		String alternativeChar = "";
		
		for(int i = 0; i < text.length(); i++){
			
			if(i % 2 == 0){
				alternativeChar = alternativeChar + Character.toUpperCase(text.charAt(i));
				
			}else if(i % 2 == 1){
				alternativeChar = alternativeChar +  Character.toLowerCase(text.charAt(i));
			}
		}
		
		return alternativeChar;
	}
	/**
	 * Q no:46
	 * write a method that take one String input and return the alternate characters as a String
	 * parameter:String text
	 * returnType:String
	 * ServingBucket:variable
	 */
	public static String getAlternateChar(String text){
		String alternateChar = "";
		
		for(int i = 0; i < text.length(); i= i+2){
			alternateChar = alternateChar + text.charAt(i);
		}
		return alternateChar;
	}
	/**
	 * Q no:45
	 * write a method that take one String input which contain an email address then collect and return that email
	 * parameter:String text
	 * returnType:String
	 * ServingBucket:variable
	 */
	public static String getEmail(String text ){
		String email = null;
		
		String[] wordArray = text.split(" ");
		
		for(int i = 0; i < wordArray.length; i++){
			
			if(wordArray[i].matches("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+")){
				
			email = wordArray[i];
			}
		}
		
		return email;
	}
	/**
	 * Q no:44
	 * write a method that take one String input which contain multiple number then collect and return in a list
	 * parameter:String number
	 * returnType:ArrayList<Integer>
	 * ServingBucket:List
	 */
	public static ArrayList<Integer> getNumListFromString(String number){
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		String[] wordArray = number.split(" ");
		for(int i = 0; i < wordArray.length; i++){
			
			if(wordArray[i].matches("[0-9]+")){
				int num = Integer.valueOf(wordArray[i]);
				
				numList.add(num);
			}
		}
		return numList;
	}
	/**
	 * Q no:43
	 * write a method that take one String input which contains a number and return that number as integer
	 * parameter:String number
	 * returnType:int
	 * ServingBucket:variable
	 */
	public static int getContainValue(String number){
		int containValue = 0;
		
		String[] wordArray = number.split(" ");
		
		for(int i = 0; i < wordArray.length; i++){
			
			 if(wordArray[i].matches("[0-9]+")){
				 int num = Integer.valueOf(wordArray[i]);
				 containValue = num;
			 }
		}
		return containValue;
	}
	/**
	 * Q no:42
	 * write a method that take one number array input and return the bubble sorted array
	 * parameter:int[] numberArray
	 * returnType:int[]
	 * ServingBucket:arry
	 */
	public static int[] getBubbleSorted(int[] numberArray){
		int[] bubbleSortedArray = new int[ numberArray.length];
		
		for(int i = 0; i < numberArray.length; i++){
			for(int j = i+1; j < numberArray.length; j++){
				
				if(numberArray[i] < numberArray[j]){
					int sortedValue = numberArray[i];
					
					numberArray[i] = numberArray[j];
					numberArray[j] = sortedValue;
				}
				
			}
		}
		bubbleSortedArray = numberArray;
		
		return bubbleSortedArray;
	}
	/**
	 * Q no:41
	 * write a method that one number List input and return the sorted List
	 * parameter:ArrayList<Integer> numberList
	 * returnType:ArrayList<Integer>
	 * ServingBucket:List
	 */
	public static ArrayList<Integer> getSortedList(ArrayList<Integer> numberList){
		ArrayList<Integer> sortedList = new ArrayList<Integer>();
		
		Collections.sort(numberList);
		sortedList = numberList;
		
		return sortedList;
	}
	/**
	 * Q no:40
	 * write a method that take one number array input and return the sorted array
	 * parameter:int[] numberArray
	 * returnType:int[]
	 * ServingBucket:array
	 */
	public static int[] getSortedArray(int[] numberArray){
		int[] sortedArray = new int[numberArray.length];
		
		Arrays.sort(numberArray);
		sortedArray = numberArray;
		
		return sortedArray;
	}
	/**
	 * Q no:39
	 * write a method that take one number Array input then convert that to a list and return list
	 * parameter:int[] numArray
	 * returnType:ArrayList<Integer>
	 * ServingBucket:List
	 */
	public static ArrayList<Integer> getConvertedArrayToList(int[] numArray){
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		for(int i = 0; i < numArray.length;i++){
			numberList.add(numArray[i]);
		}
		return numberList;
	}
	/**
	 * Q no:38
	 * write a method that take that one number list input then convert that to an Array and return that Array
	 * parameter:ArrayList<Integer>numList
	 * returnType;int[]
	 * ServingBucket:array
	 */
	public static int[] getConvertedListToArray(ArrayList<Integer> numList){
		int[] numberArray = new int[numList.size()];
		
		for(int i = 0; i < numList.size(); i++){
			numberArray[i] = numList.get(i);
		}
		return numberArray;
	}
	
	/**
	 * Q no:37
	 * write a method that take one String input and return same String in reverse order
	 * parameter:String text
	 * returnType:String
	 * ServingBucket:variable
	 */
	public static String getReverseString(String text){
		String reverseString = "";
		
		for(int i = text.length()-1; i >= 0; i--){
			reverseString = reverseString + text.charAt(i);
		}
		return reverseString;
	}
	/**
	 * Q no:36
	 * write a method that take one integer type list input and return sum of all values
	 * parameter:ArrayList<Integer> numberList
	 * returnType:int
	 * ServingBucket:variable
	 */
	public static int getSum(ArrayList<Integer> numberList){
		int sum = 0;
		
		for(int i = 0; i < numberList.size(); i++){
			sum = sum + numberList.get(i);
		}
		return sum;
	}
	
	/**
	 * Q no:35
	 * write a method that take one integer type array input and return sum of all values
	 * parameter:int[] numberArray
	 * returnType:int
	 * ServingBucket:variable
	 */
	public static int getSum(int[] numberArray){
		int sum = 0;
		
		for(int i = 0; i < numberArray.length; i++){
			sum = sum + numberArray[i];
		}
		return sum;
	}
	/**
	 * Q no:34
	 * write a method that take one String input and return all the unique character without whitespace
	 * parameter:String text
	 * returnType:String
	 * ServingBucket:variable
	 */
	public static String getUniqueChar(String text){
		String uniqueChar = "";
		
		text = text.replaceAll(" ", "");
		text = text.toLowerCase();
		
		for(int i = 0; i < text.length();i++){
			for(int j = i+1; j < text.length(); j++){
				
				if(text.charAt(i) == text.charAt(j)){
					String Character = String.valueOf(text.charAt(i));
					
					if(uniqueChar.contains(Character)){
						uniqueChar = uniqueChar.replaceAll(Character, "");
						break;
					}
				}
			}
		}
		return uniqueChar;
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
