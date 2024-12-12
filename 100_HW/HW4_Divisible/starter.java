/*
 *	Author:
 *  Date:
 * 	Collaborator: 
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
		if(a%2 == 0){
			System.out.println(a + " is even!");
		}else{
			System.out.println(a + " is odd!");
		}
		if(a%3 == 0 && a%4 == 0 && a%5 == 0){
			System.out.println(a + " is divisible by 3, 4, and 5!");
		}else{
			System.out.println(a + " is not divisible by all 3, 4, and 5.");
		}
		System.out.println(" ");
		
		if(b%2 == 0){
			System.out.println(b + " is even!");
		}else{
			System.out.println(b + " is odd!");
		}
		if(b%3 == 0 && b%4 == 0 && b%5 == 0){
			System.out.println(b + " is divisible by 3, 4, and 5!");
		}else{
			System.out.println(b + " is not divisible by all 3, 4, and 5.");
		}
	}
}
