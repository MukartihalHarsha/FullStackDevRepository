package com.gentech.polymorphism;
class Employee1
{
	 void calculateSalary() 
	 {
	     System.out.println("Calculating generic employee salary");
	 }
}
class FullTimeEmployee extends Employee1 
{
	 void calculateSalary() 
	 {
	     System.out.println("Calculating full-time employee salary");
	 }
}
class PartTimeEmployee extends Employee1
{
	 void calculateSalary() 
	 {
	     System.out.println("Calculating part-time employee salary");
	 }
}

public class Employee {

	public static void main(String[] args) {
		Employee1 fullTime = new FullTimeEmployee();
	    Employee1 partTime = new PartTimeEmployee();
        fullTime.calculateSalary();  
	    partTime.calculateSalary();
		

	}

}

