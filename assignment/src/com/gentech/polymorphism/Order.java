package com.gentech.polymorphism;
class Order1
{
	 void processOrder() 
	 {
	     System.out.println("Processing a generic order");
	 }
}
class DineIn extends Order1 
{
	 void processOrder() 
	 {
	     System.out.println("Processing an DineIn order");
	 }
}
class HomeDelivery extends Order1
{
	 void processOrder() 
	 {
	     System.out.println("Processing a Home Delivery order");
	 }
}
class InstantOrder extends Order1
{
	 void processOrder() 
	 {
	     System.out.println("Processing a Instant order");
	 }
}

public class Order {

	public static void main(String[] args) {
		Order1 order1 = new DineIn();
	    Order1 order2 = new HomeDelivery();
	    Order1 order3 = new InstantOrder();
        order1.processOrder();  
	    order2.processOrder();
	    order3.processOrder();
	     
		

	}

}
