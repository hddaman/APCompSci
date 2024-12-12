/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence");
        String sentence = sc.nextLine();
		while(true){
            if(sentence.indexOf(" ") == -1){
                System.out.print(pigLatin(sentence));
                break;
            }
            int space = sentence.indexOf(" ");
            String word = sentence.substring(0,space);
            System.out.print(pigLatin(word) + " ");
            sentence = sentence.substring(space+1);
        }
	}
	public static String pigLatin(String word){
	    String firstLetter = word.substring(0,1);
	    if(isVowel(firstLetter)){
	        return word + "-way";
	    }else if(!isVowel(firstLetter) && !isVowel(word.substring(1,2))){
	        String secondLetter = word.substring(1,2);
	        return word.substring(2) + "-" + firstLetter + secondLetter + "ay";
	    }else{
	        return word.substring(1) + "-" + firstLetter + "ay";
	    }
	}
	public static boolean isVowel(String letter){
	    return letter.equals("A") || letter.equals("a") || letter.equals("E") || letter.equals("e") || letter.equals("I") || letter.equals("i") || letter.equals("O") || letter.equals("o") || letter.equals("U") || letter.equals("u") || letter.equals("Y") || letter.equals("y");
	}
}
