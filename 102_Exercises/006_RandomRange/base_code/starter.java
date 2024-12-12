/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a starting range (int): ");
		int start = sc.nextInt();
		System.out.println("Please enter an ending range (int): ");
		int end = sc.nextInt();
		int range = end-start;
		int a = (int)(Math.random()*range)+start;
		int b = (int)(Math.random()*range)+start;
		int c = (int)(Math.random()*range)+start;
		int d = (int)(Math.random()*range)+start;
		int e = (int)(Math.random()*range)+start;
		System.out.println("Your range is " + start + " to " + end);
		System.out.print("5 random numbers in this range are " + a + ", " + b + ", " + c + ", " + d + ", " + e);
	}
}
