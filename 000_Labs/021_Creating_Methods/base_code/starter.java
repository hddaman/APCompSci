/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String sentence){
		System.out.println(sentence);
	}
	public static void toStringCombined(String sentence, String sentence2){
		System.out.println(sentence + " " + sentence2);
	}
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Write a sentence!");
	String sentence = sc.nextLine();
	System.out.println("Write a sentence!");
	toStringCombined(sentence,sc.nextLine());
	}
}
