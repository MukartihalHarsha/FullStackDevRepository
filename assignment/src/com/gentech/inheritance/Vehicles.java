package com.gentech.inheritance;

class Vehicle 
{
     void start()
     {
         System.out.println("The vehicle starts.");
     }
}

class Car extends Vehicle 
{
     void drive()
     {
         System.out.println("The car is being driven.");
     }
}

class Bike extends Vehicle 
{
     void ride() 
     {
         System.out.println("The bike is being ridden.");
     }
}

public class Vehicles {

	public static void main(String[] args) {
		 Car car = new Car();
	     Bike bike = new Bike();
	     
	     car.start();  
	     car.drive();  
	     
	     bike.start(); 
	     bike.ride();
		

	}

}
