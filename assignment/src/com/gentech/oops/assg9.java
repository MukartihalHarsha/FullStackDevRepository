package com.gentech.oops;

class Payment1 
{
	 void makePayment(double amount)
	 {
	     System.out.println("Making a payment of $" + amount);
	 }
}
class CreditCardPayment extends Payment1 
{
	 void makePayment(double amount)
	 {
	     System.out.println("Making a credit card payment of $" + amount);
	 }
}
class PayPalPayment extends Payment1 
{
	 void makePayment(double amount) 
	 {
	     System.out.println("Making a PayPal payment of $" + amount);
	 }
}
class NetBanking extends Payment1 
{
	 void makePayment(double amount) 
	 {
	     System.out.println("Making a NetBanking payment of $" + amount);
	 }
}

public class assg9 {

	public static void main(String[] args) {
		Payment1 payment1 = new CreditCardPayment();
	    Payment1 payment2 = new PayPalPayment();
	    Payment1 payment3 = new NetBanking();
	    
	    payment1.makePayment(100.00);  
	    payment2.makePayment(150.00);
	    payment3.makePayment(200.00);

	}

}



