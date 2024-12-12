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
		int a = (int)(Math.random()*10);
		int b = (int)(Math.random()*100)+1;
		double c = Math.random()+2.5;
		double d = (Math.random()*575)+14;
		System.out.println("A number between 0 and 9: " + a);
		System.out.println("A number between 1 and 100: " + b);
		System.out.println("A double between 2.5 and 3.5: " + c);
		System.out.print("A double between 14 and 589: " + d);
	}
}
