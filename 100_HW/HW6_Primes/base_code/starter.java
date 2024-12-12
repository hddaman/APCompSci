/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int a){
	int c = 2;
	while(c<a){
		if(a%c != 0){
			c++;
		}else{
			return false;
		}
	}
	return true;
}

	public static void printPrimes(int b){
		int count = 2;
		while(count<=b){
			if(checkPrime(count)){
				System.out.println(count);
			}
			count++;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input an integer: ");
		int num = sc.nextInt();
		System.out.println("All prime numbers up to that number are: ");
		printPrimes(num);
	}
}
