/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*1000)+1;
		System.out.print("Pick a number from 1 to 1000: ");
		int number = sc.nextInt();
		if(number>random){
			System.out.print("Your number was larger than the number. The number was " + random);
		}else if(number<random){
			System.out.print("Your number was smaller than the number. The number was " + random);
		}else{
			System.out.print("You guessed the correct number! Congratulations!");
		}
	}
}
