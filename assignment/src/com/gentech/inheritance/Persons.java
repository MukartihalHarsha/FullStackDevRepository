package com.gentech.inheritance;
class Person
{
     String name;
     int age;
     Person(String name, int age)
     {
         this.name = name;
         this.age = age;
         System.out.println("Person name and age: " + name + ", " + age);
     }
}

class Employee extends Person
{
     int employeeId;
     Employee(String name, int age, int employeeId) 
     {
         super(name, age); 
         this.employeeId = employeeId;
         System.out.println("Employee id: " + employeeId);
     }
}

class Manager extends Employee 
{
     String department;
     Manager(String name, int age, int employeeId, String department) 
     {
         super(name, age, employeeId); 
         this.department = department;
         System.out.println("Manager department: " + department);
     }
}

public class Persons {

	public static void main(String[] args) {
		 Manager manager = new Manager("Alice", 35, 12345, "Sales");

	}

}
