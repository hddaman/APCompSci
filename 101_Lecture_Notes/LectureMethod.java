/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        printAnimal();
        
        greeting("Mortis");
        
        double num = raise(200000.8,64);
        System.out.println(num);
        num = raise(num,7);
        System.out.println(num);
        num = raise(num,7);
        System.out.print(num);
	}
	
	public static double raise(double salary, int percent){
	    double amount = salary + (salary * (percent/100.0));
	    return amount;
	}
	
	public static void greeting(String name){
	    System.out.println("Howdy " + name);
	}
	
	public static void printAnimal(){
	    System.out.println("              ,");
	    System.out.println("           __)\\_  ");
	    System.out.println("     (\\_-'    a`-.");
	    System.out.println("jgs  (/~~````(/~^^`");
	}
	
}