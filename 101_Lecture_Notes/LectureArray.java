/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        int [] arr = new int[20];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*10)+1;
            System.out.print(arr[i] + " ");
        }
        int x = 8;
        for(int i = 0; i < arr.length; i++){
            if(x == arr[i]){
                System.out.print(i);
            }
        }
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.print("Consect at " + i + " and " + (i+1));
            }
        }
	}
}