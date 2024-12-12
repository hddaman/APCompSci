/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf a = new PooleDwarf(randName(),1);
		PooleDwarf b = new PooleDwarf(randName(),1);
		PooleDwarf c = new PooleDwarf(randName(),1);
		PooleDwarf d = new PooleDwarf(randName(),1);
		PooleDwarf e = new PooleDwarf(randName(),1);
		PooleDwarf f = new PooleDwarf(randName(),1);
		PooleDwarf g = new PooleDwarf(randName(),1);
		int sum = 0;
		if(a.isSameName(b.getName()))
			sum++;
		if(a.isSameName(c.getName()))
			sum++;
		if(a.isSameName(d.getName()))
			sum++;
		if(a.isSameName(e.getName()))
			sum++;
		if(a.isSameName(f.getName()))
			sum++;
		if(a.isSameName(g.getName()))
			sum++;
		if(sum==1)
			System.out.print(a.getName() + " was the name with " + sum + " match!");
		else
			System.out.print(a.getName() + " was the name with " + sum + " matches!");
	}
}
