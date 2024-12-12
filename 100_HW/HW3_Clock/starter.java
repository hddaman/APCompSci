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
		System.out.print("What day is it? (0-6): ");
		int day = sc.nextInt();
		if((day >= 1) && (day <= 5)){
			System.out.print("It's a weekday! Wake up! It's 7 AM!");
		}else{
			System.out.print("It's the weekend! It's 10 AM!");
		}
	}
}
