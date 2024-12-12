/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee dwight = new Employee(1987,"Dwight","Schrute",4416.66);
		Employee jim = new Employee(2474,"Jim","Halpert",4416.66);
		Employee pam = new Employee(2011,"Pam","Beesly",2250);
		Employee Sebastian = new Employee(6699,"Sebastian","Blunt",30.59);
		
		michael.raiseSalary(20);
		dwight.raiseSalary(90);
		jim.raiseSalary(50);
		pam.raiseSalary(49);
		Sebastian.raiseSalary(25);
		
		System.out.println("Michael's Annual Salary: $" + michael.getAnnualSalary());
		michael.employeeToString();
		System.out.println("Dwight's Annual Salary: $" + dwight.getAnnualSalary());
		dwight.employeeToString();
		System.out.println("Jim's Annual Salary: $" + jim.getAnnualSalary());
		jim.employeeToString();
		System.out.println("Pam's Annual Salary: $" + pam.getAnnualSalary());
		pam.employeeToString();
		System.out.println("Sebastian's Annual Salary: $" + Sebastian.getAnnualSalary());
		Sebastian.employeeToString();
	}
}
