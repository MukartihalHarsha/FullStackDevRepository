package com.gentech.programs;
class product
{
	String name;
	String company;
	int id;
	String manufacture;
	product()
	{
		name="laptop";
	    company="lenovo";
	    id=250;
	    manufacture="jun2024";
	    System.out.println("product name:"+name);
		System.out.println("company:"+company);
		System.out.println("product id:"+id);
		System.out.println("manufacture:"+manufacture);
		System.out.println("++++++++++++++++++");    
	}
}
class sales
{
	int salesid;
    int noofsales;
	sales()
	{
	    salesid=250;
	    noofsales=50;
	    System.out.println("salesid:"+salesid);
		System.out.println("number of sales:"+noofsales);
		System.out.println("++++++++++++++++++");    
	}
}
class order
{
	int orderid;
    String orderdate;
	order()
	{
	    orderid=250;
	    orderdate="10thoctober2022";
	    System.out.println("orderid:"+orderid);
		System.out.println("order date:"+orderdate);
		System.out.println("++++++++++++++++++");    
	}
}
public class salescompany {

	public static void main(String[] args) {
		product pd=new product();
		sales sl=new sales();
		order od=new order();
		
		
		

	}

}
