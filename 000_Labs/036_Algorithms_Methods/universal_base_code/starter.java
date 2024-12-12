/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] x){
		for(int i = 0; i < x.length; i++){
			System.out.println(x[i]);
		}
	}
	public static int getArrayAverage(int[] x){
		int sum = 0;
		for(int i = 0; i < x.length; i++){
			sum = sum + x[i];
		}
		return sum/x.length;
	}
	public static int getArrayMax(int[] x){
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < x.length; i++){
			if(x[i] > max)
				max = x[i];
		}
		return max;
	}
	public static int getArrayMin(int[] x){
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < x.length; i++){
			if(x[i] < min)
				min = x[i];
		}
		return min;
	}
	public static void main(String args[]){
		// Your code goes below here
		int [] arr = new int[100];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100)+1;
		}
		toStringArray(arr);
		System.out.println("The average of the array is " + getArrayAverage(arr));
		System.out.println("The maximum of the array is " + getArrayMax(arr));
		System.out.println("The minimum of the array is " + getArrayMin(arr));
	}
}
