/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Warrior[] x = new Warrior[100];
		Wizard[] y = new Wizard[100];
		for(int i = 0; i < x.length; i++){
			x[i] = new Warrior();
			y[i] = new Wizard();		
		}
		int ix = 0;
		int iy = 0;
		int remainingx = x.length;
		int remainingy = y.length;
		while(true){
			y[iy].attack(x[ix]);
			x[ix].attack(y[iy]);
			if(x[ix].isDead()){
				ix++;
				remainingx--;
			}
			if(y[iy].isDead()){
				iy++;
				remainingy--;
			}
			if(remainingx<=0 || remainingy<=0)
				break;
		}
		if(remainingx<=0)
			System.out.print("Wizards won with " + remainingy + " remaining.");
		else if(remainingy<=0)
			System.out.print("Warriors won with " + remainingx + " remaining.");
	}
}
