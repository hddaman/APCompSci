/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog Greta = new Dog("Greta",7);
		Dog Lucy = new Dog("Lucy","Golden Doodle");
		if(Greta.isSleeping())
			System.out.print(Greta.getName() + " is sleeping");
		else{
			Greta.bark();
			if(Lucy.isSleeping())
				Lucy.bark();
			else
				Lucy.bark();
		}
	}
}
