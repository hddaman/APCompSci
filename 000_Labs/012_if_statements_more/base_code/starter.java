/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a number: ");
		int a = sc.nextInt();
		System.out.print("Give me another number: ");
		int b = sc.nextInt();
		if(a == b){
			System.out.print("Your numbers are equal!");
		}else{
			System.out.print("Your numbers are different!");
		}
	}
}
