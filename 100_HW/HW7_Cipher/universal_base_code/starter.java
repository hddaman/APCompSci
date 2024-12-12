/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a message you want me to encode: ");
		String message = sc.nextLine();
		System.out.println("Your message encoded is: ");
		System.out.print(Cipher.encode(message));
	}
}