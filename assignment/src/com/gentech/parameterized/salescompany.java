package com.gentech.parameterized;

class product
{
	String name;
	String company;
	int id;
	String manufacture;
	product(String Name,String Company,int ID,String Manufacture)
	{
		name=Name;
	    company=Company;
	    id=ID;
	    manufacture=Manufacture;
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
	sales(int id,int sales)
	{
	    salesid=id;
	    noofsales=sales;
	    System.out.println("salesid:"+salesid);
		System.out.println("number of sales:"+noofsales);
		System.out.println("++++++++++++++++++");    
	}
}
class order
{
	int orderid;
    String orderdate;
	order(int ID,String date)
	{
	    orderid=ID;
	    orderdate=date;
	    System.out.println("orderid:"+orderid);
		System.out.println("order date:"+orderdate);
		System.out.println("++++++++++++++++++");    
	}
}
public class salescompany {

	public static void main(String[] args) {
		product pd=new product("laptop","lenovo",123,"20jul2024");
		sales sl=new sales(45,150);
		order od=new order(001,"30jul2024");
		
		
		

	}

}

