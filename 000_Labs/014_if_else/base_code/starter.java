/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int random = (int)((Math.random()*1000)+1);
		System.out.print("Pick a number between 1 and 1000: ");
		int input = sc.nextInt();
		if(random == input){
			System.out.print("You guessed the correct number! Congratualations!");
		}else{
			System.out.print("Your number wasn't the random number. The number was " + random + ".");
		}
	}
}
