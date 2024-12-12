/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int range = (int)(Math.random()*150)+51;
		int [] arr = new int[range];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*500)+1;
		}
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min)
				min = arr[i];
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max)
				max = arr[i];
		}
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum = sum + arr[i];
		}
		int avg = sum/arr.length;
		System.out.println("There are " + range + " elements.");
		System.out.println("The minimum of 1000 random numbers is " + min);
		System.out.println("The maximum of 1000 random numbers is " + max);
		System.out.print("The average of 1000 random numbers is " + avg);


		
	}
}
