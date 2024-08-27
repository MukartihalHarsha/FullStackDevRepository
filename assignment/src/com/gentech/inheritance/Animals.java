package com.gentech.inheritance;

class Animal 
{
     void eat() 
     {
         System.out.println("This animal eats food.");
     }
}

class Mammal extends Animal 
{
     void breathe() 
     {
         System.out.println("This mammal breathes air.");
     }
}

class Dog extends Mammal 
{
     void bark() 
     {
         System.out.println("The dog barks.");
     }
}




public class Animals {

	public static void main(String[] args) {
		Dog animal = new Dog();
	     
	     animal.eat();      
	     animal.breathe();  
	     animal.bark();     
		

	}

}
