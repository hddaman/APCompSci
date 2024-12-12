/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String rol;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
	public myCharacter(){
		rol = setRole("warrior");
		strength = setStrength(3);
		dexterity = setDexterity(5);
		intelligence = setIntelligence(2);
		charisma = setCharisma(10);
	}
	public String setRole(String role){
		if(role.equals("Warrior") || role.equals("warrior"))
			return "Warrior";
		else if(role.equals("Rogue") || role.equals("rogue"))
			return "Rogue";
		else if(role.equals("Wizard") || role.equals("wizard"))
			return "Wizard";
		else
			return "No Role";
	}
	public int setStrength(int a){
		if(a<0)
			return 0;
		else
			return a;
	}
	public int setDexterity(int b){
		if(b<0)
			return 0;
		else
			return b;
	}
	public int setCharisma(int c){
		if(c<0)
			return 0;
		else
			return c;
	}
	public int setIntelligence(int d){
		if(d<0)
			return 0;
		else
			return d;
	}
	public boolean setAll(String role, int a, int b, int c, int d){
		if(!role.equals("No Role") && a >= 0 && b >= 0 && c >= 0 && d >= 0)
			return true;
		else
			return false;
	}
	public void myToString(){
		System.out.println("Your role is " + rol);
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexterity trait is " + dexterity);
		System.out.println("Your intelligence trait is " + intelligence);
		System.out.print("Your charisma trait is " + charisma);
	}
}

