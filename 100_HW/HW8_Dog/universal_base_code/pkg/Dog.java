package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	String breed;
	int age;
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public Dog(String n){
		name = n;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String a, String b){
		name = a;
		age = 1;
		breed = b;
	}
	public Dog(String c, int d){
		name = c;
		age = d;
		breed = "dog dog";
	}
	public void setName(String e){
		name = e;
	}
	public void setAge(int f){
		age = f;
	}
	public void setBreed(String g){
		breed = g;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		int x = (int)(Math.random()*2)+1;
		if(x == 1)
			return true;
		else if(x == 2)
			return false;
		else
			return true;
	}
	
	public void bark(){
		System.out.print(name + " barks! ");
	}

}
