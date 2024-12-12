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
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title?");
		String title = sc.nextLine();
		
		System.out.println("Would you like to be a Wizard, a Warrior, or a Rogue?");
		String choice = sc.nextLine();
		if(choice.equals("Warrior") || choice.equals("warrior")){
			System.out.println("You have chosen the Warrior!");
		}else if(choice.equals("Wizard") || choice.equals("wizard")){
			System.out.println("You have chosen the Wizard!");
		}else if(choice.equals("Rogue") || choice.equals("rogue")){
			System.out.println("You have chosen the Rogue!");
		}else{
			System.out.print("You decided not to choose a role. Rerun program.");
		}
		System.out.println(" ");
		
		int remaining = 20;
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend wisely.");
		System.out.println(" ");
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		remaining = remaining-strength;
		if(strength>10 || strength>remaining){
			System.out.print("Please input a smaller value. Strength (1-10): ");
			strength = sc.nextInt();
			remaining = remaining-strength;
		}
		System.out.println("You have " + remaining + " points left.");
		System.out.println(" ");
		System.out.print("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		remaining = remaining-dexterity;
		if(dexterity>10 || dexterity>remaining){
			System.out.print("Please input a smaller value. Dexterity (1-10): ");
			dexterity = sc.nextInt();
			remaining = remaining-dexterity;
		}
		System.out.println("You have " + remaining + " points left.");
		System.out.println(" ");
		System.out.print("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		remaining = remaining-intelligence;
		if(intelligence>10 || intelligence>remaining){
		System.out.print("Please input a smaller value. Intelligence (1-10): ");
		intelligence = sc.nextInt();
		remaining = remaining-intelligence;
		}
		System.out.println("You have " + remaining + " points left.");
		System.out.println(" ");
		System.out.print("Charisma (1-10): ");
		int charisma = sc.nextInt();
		remaining = remaining-charisma;
		if(charisma>10 || charisma>remaining){
		System.out.print("Please input a smaller value. Charisma (1-10): ");
		charisma = sc.nextInt();
		remaining = remaining-(charisma);
		}
		System.out.println(" ");
		if(remaining>0){
		System.out.println("You have " + remaining + " points to spend for next time.");
		}
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("You are " + name + ", the " + title + " of CVHS.");
		System.out.println("You're a " + choice + " with the following stats:");
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("Charisma: " + charisma);
		System.out.println(" ");
		
		System.out.print("Good luck on your quest, " + name + "!");
	}
}
