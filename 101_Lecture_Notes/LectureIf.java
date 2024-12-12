/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("You've joined an alien exchange program.");
        System.out.println("Pick an alien to take in!");
        System.out.println("1. Joe, a fat bellied alien who loves eating.");
        System.out.println("2. Bob, a blue alien who loves trees.");
        System.out.println("3. Barney, a purple tailed alien who eats butterflies.");
        int answer1 = sc.nextInt();
        if(answer1 == 1){
            System.out.println("You picked Joe!");
            System.out.println("What burger should you get for Joe?");
            System.out.println("1. In n Out");
            System.out.println("2. McDonalds");
            System.out.println("3. Shake Shack");
            int answer2 = sc.nextInt();
            
            if(answer2 == 1)
                System.out.println("Joe is impressed and wants to stay.");
            else if(answer2 == 2)
                System.out.println("Joe gets diabetes and is deported back to his home plantet.");
            else if(answer2 == 3)
                System.out.println("Joe is very impressed and asks you to marry him.");
            else
                System.out.println("Joe gets very hungry and eats you instead");
        }
        else if(answer1 == 2){
            System.out.print("You picked Bob!");
        }
        else if(answer1 == 3){
            System.out.print("You picked Barney!");
        }
        else{
            System.out.print("You get Jerry.");
        }
	}
}