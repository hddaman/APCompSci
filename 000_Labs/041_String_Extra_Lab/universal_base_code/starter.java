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
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String sentence  = sc.nextLine();
		String result = " ";
		while(true){
            if(sentence.indexOf(" ") == -1){
                System.out.print(sentence + " ");
                break;
            }
            int space = sentence.indexOf(" ");
            String word = sentence.substring(0,space);
            sentence = sentence.substring(space+1);
            result = word + " " + result;
        }
        System.out.print(result);
	}
}
