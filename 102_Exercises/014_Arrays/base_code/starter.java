/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int[1001];
		 for(int i = 0; i<arr.length; i++){
		 	arr[i] = (i+1)*3;
		 	System.out.print(arr[i] + ", ");
		 }
		 System.out.println("-----------------------------------------------------------------");
		 int [] arr2 = new int[1001];
		 for(int x = 0; x<arr2.length; x++){
		 	arr2[x] = 1000-x;
		 	System.out.print(arr2[x] + ", ");
		 }
	}
}
