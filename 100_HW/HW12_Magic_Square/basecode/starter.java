import pkg.*;
import java.util.Scanner;

class starter {
	public static boolean isSqrt(int x){
		return Math.sqrt(x)-(int)(Math.sqrt(x)) == 0.0;
	}
	public static int getSum(int x){
		int sum = 0;
		for(int c = 1; c <= x; c++){
			sum = sum + c;
		}
		return sum;
	}
	public static boolean isSum(int x){
		for(int c = 0; c <= x; c++){
			if(getSum(c) == x)
				return true;
		}
		return false;
	}
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many magic squares would you like to see?: ");
		int n = sc.nextInt();
		int sum = 0;
		for(int c = 1; sum < n; c++){
			if(isSqrt(c) && isSum(c)){
				System.out.println(c);
				sum++;
			}
		}
	}
}
