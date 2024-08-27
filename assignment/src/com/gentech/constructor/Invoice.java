package com.gentech.constructor;
class Einvoice
{
	void invoice(String number)
	{
		System.out.println("Invoice Number: "+number);
	}
	void invoice(String number,String customername)
	{
		System.out.println("Invoice Number: "+number);
		System.out.println("Customer Name: "+customername);
	}
	void invoice(String number,String customername,double amount)
	{
		System.out.println("Invoice Number: "+number);
		System.out.println("Customer Name: "+customername);
		System.out.println("Amount: "+amount);
	}
	void invoice(String number,String customername,double amount,String date)
	{
		System.out.println("Invoice Number: "+number);
		System.out.println("Customer Name: "+customername);
		System.out.println("Amount: "+amount);
		System.out.println("Date: "+date);
	}
}
public class Invoice {
	public static void main(String[] args) {
		Einvoice inv=new Einvoice();
		inv.invoice("INV001");
		inv.invoice("INV002","abishek",135.50,"10thjuly2024");
		
		

	}

}
