/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*1000);
		while(true){
			System.out.print("Guess a number: ");
			int guess = sc.nextInt();
			if(guess<random){
				System.out.println("Too low!");
				System.out.println(" ");
			}else if(guess>random){
				System.out.println("Too high!");
				System.out.println(" ");
			}else{
				System.out.print("You got it!");
				break;
			}
		}
	}
}
