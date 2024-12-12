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
		System.out.println("Would you like to be a Wizard, a Warrior, or a Rogue?");
		String choice = sc.nextLine();
		if(choice.equals("Warrior") || choice.equals("warrior")){
			System.out.print("You have chosen the Warrior!");
		}else if(choice.equals("Wizard") || choice.equals("wizard")){
			System.out.print("You have chosen the Wizard!");
		}else if(choice.equals("Rogue") || choice.equals("rogue")){
			System.out.print("You have chosen the Rogue!");
		}else{
			System.out.print("You decided not to choose a role. Rerun program.");
		}
	}
}
