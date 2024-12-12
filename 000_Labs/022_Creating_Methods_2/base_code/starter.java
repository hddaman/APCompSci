/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b){
		int c = 1;
		int result = a;
		while(c<b){
			result = result*a;
			c++;
		}
		return result;
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your base? ");
		int base = sc.nextInt();
		System.out.print("What is your exponent? ");
		int exponent = sc.nextInt();
		int answer = pow(base,exponent);
		System.out.print("Your answer is: " + answer);
	}
}
