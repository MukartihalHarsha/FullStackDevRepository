package com.gentech.inheritance;

class Vehicle1
{
     void displayInfo()
     {
         System.out.println("Vehicle information.");
     }
}
class Car1 extends Vehicle1
{
     void displayInfo()
     {
         System.out.println("Car information.");
     }
}

class ElectricCar extends Car1
{
	 void displayInfo()
	 {
         System.out.println("ElectricCar information.");
     }

     void displayAllInfo() 
     {
         super.displayInfo(); 
         ((Vehicle1)this).displayInfo(); 
         this.displayInfo(); 
     }
}


public class Vehicle2 {

	public static void main(String[] args) {
		ElectricCar car = new ElectricCar();
        car.displayAllInfo();
		
	}

}
