/*
 *	Author:  
 *  Date: 
*/

class starter{
	public static void main(String args[]) {
		// Your code goes below here
	Character henry = new Character();
	System.out.println("You are a " + henry.giveRole() + " with the following stats: ");
	System.out.println("Strength: " + henry.giveStrength());
	System.out.println("Dexterity: " + henry.giveDexterity());
	System.out.println("Charisma: " + henry.giveCharisma());
	System.out.print("Intelligence: " + henry.giveIntelligence());
	}
}
