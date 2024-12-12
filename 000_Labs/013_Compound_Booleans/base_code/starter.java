/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a number: ");
		int a = sc.nextInt();
		System.out.print("Give me another number: ");
		int b = sc.nextInt();
		System.out.print("Give me one more number: ");
		int c = sc.nextInt();
		if(a>b && a>c){
			System.out.println("Your first number (" + a + ") was the largest!");
		}if(b>a && b>c){
			System.out.println("Your second number (" + b + ") was the largest!");
		}if(c>a && c>b){
			System.out.println("Your third number (" + c + ") was the largest!");
		}
		
		if(a<b && a<c){
			System.out.print("Your first number (" + a + ") was the smallest!");
		}if(b<a && b<c){
			System.out.print("Your second number (" + b + ") was the smallest!");
		}if(c<a && c<b){
			System.out.print("Your third number (" + c + ") was the smallest!");
		}
	}
}
