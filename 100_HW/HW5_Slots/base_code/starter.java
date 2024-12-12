/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int remaining = 100;
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.print("Would you like to play? (Yes/yes/Y/y): ");
			String choice = sc.nextLine();
			if(choice.equals("Yes") || choice.equals("yes") || choice.equals("Y") || choice.equals("y")){
				System.out.print("You have $" + remaining + ". How much would you like to wager? ");
			}else if(choice.equals("No") || choice.equals("no") || choice.equals("N") || choice.equals("n")){
				System.out.print("You have $" + remaining + " left. Come back soon!");
				break;
			}
			int wager = sc.nextInt();
				if(wager <= 0){
					System.out.println("Sneaky! No negatives or zero.");
					System.out.print("Please enter a bigger number: ");
					wager = sc.nextInt();
				}else if(wager>remaining){
					System.out.print("You only have $" + remaining + "! Please enter a smaller number: ");
					wager = sc.nextInt();
				}
				remaining = remaining-wager;
				System.out.println("Great! Let's play!");
				System.out.println("Your rolls are: ");
				int a = (int)(Math.random()*9)+1;
				int b = (int)(Math.random()*9)+1;
				int c = (int)(Math.random()*9)+1;
				System.out.println("__________________________________");
				System.out.println(" | " + a + " | " + b + " | " + c + " |");
				System.out.println("__________________________________");
				if(a == b && a == c){
					System.out.println("Jackpot! Your wager has been tripled");
					remaining = remaining+wager*3;
					System.out.println("You now have $" + remaining + ".");
				}else if(a == b || a == c || b == c){
					System.out.println("You won! Your wager has been doubled!");
					remaining = remaining+wager*2;
					System.out.println("You now have $" + remaining + ".");
				}else{
					System.out.println("Didn't win this time, better luck next time!");
					System.out.println("You now have $" + remaining + ".");
				}
				System.out.println(" ");
				System.out.println("--------------------------------------------------");
				System.out.println(" ");
				if(remaining == 0){
					System.out.print("You ran out of money. Come back soon!");
					break;
			}
		}
	}
}
