/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;

	public myCharacter() {
		role = "Wizard";
		strength = 4;
		dexterity = 3;
		intelligence = 3;
		charisma = 10;
	}
	
	public void myToString(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexterity trait is " + dexterity);
		System.out.println("Your intelligence trait is " + intelligence);
		System.out.print("Your charisma trait is " + charisma);
	}

}

