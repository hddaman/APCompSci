/*
 *	Author:  
 *  Date: 
*/

public class Character{
	String role;
	int strength;
	int dexterity;
	int charisma;
	int intelligence;
	public Character(){
		role = "Wizard";
		strength = 7;
		dexterity = 3;
		charisma = 8;
		intelligence = 2;
	}
	public String giveRole(){
		return role;
	}
	public int giveStrength(){
		return strength;
	}
	public int giveDexterity(){
		return dexterity;
	}
	public int giveCharisma(){
		return charisma;
	}
	public int giveIntelligence(){
		return intelligence;
	}
}
