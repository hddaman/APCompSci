import pkg.*;
import java.util.Scanner;

class starter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your role?: ");
        String a = sc.nextLine();
        myCharacter bob = new myCharacter();
        myCharacter jeff = new myCharacter(a);
        if(a.equals("")){
            System.out.print(bob.giveRole());
        }else{
            jeff.showRole();
        }
    }
}