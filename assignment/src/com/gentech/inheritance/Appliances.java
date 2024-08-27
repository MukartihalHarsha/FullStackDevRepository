package com.gentech.inheritance;

class Appliance 
{
    String brand;
    int power;

     Appliance() 
     {
         System.out.println("Appliance ");
     }

     Appliance(String brand)
     {
         this.brand = brand;
         System.out.println("Appliance brand: " + brand);
     }

     Appliance(String brand, int power)
     {
         this.brand = brand;
         this.power = power;
         System.out.println("Appliance brand and power: " + brand + ", " + power + "W");
     }
}

class WashingMachine extends Appliance 
{
     int capacity;
     WashingMachine(String brand, int power, int capacity)
     { 
         super(brand, power); 
         this.capacity = capacity;
         System.out.println("WashingMachine capacity: " + capacity + "kg");
     }
}

class SmartWashingMachine extends WashingMachine
{
     boolean wifiEnabled;
     SmartWashingMachine(String brand, int power, int capacity, boolean wifiEnabled)
     {
         super(brand, power, capacity); 
         this.wifiEnabled = wifiEnabled;
         System.out.println("SmartWashingMachine with WiFi Enabled ? " + wifiEnabled);
     }
}




public class Appliances {

	public static void main(String[] args) {
		 SmartWashingMachine smartWashingMachine = new SmartWashingMachine("LG", 2000, 8, true);

	     

	}

}
