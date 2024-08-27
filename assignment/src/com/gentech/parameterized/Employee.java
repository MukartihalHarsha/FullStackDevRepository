package com.gentech.parameterized;


class employee1
{
	String EmpName;
	int EmpID;
	int Age;
	String Address;
	employee1(String emp,int empid,int age,String adr)
	{
		EmpName=emp;
		EmpID=empid;
		Age=age;
		Address=adr;
		System.out.println("Employee name:"+EmpName);
		System.out.println("Employee ID:"+EmpID);
		System.out.println("Employee Age:"+Age);
		System.out.println("Employee Address:"+Address);
		System.out.println("++++++++++++++++++");
	}
}
class department
{
	String deptname;
	int deptid;
	long contact;
	department(String name,int id,long Contact)
	{
		deptname=name;
		deptid=id;
	    contact=Contact;
		System.out.println("department name:"+deptname);
		
		System.out.println("department id:"+deptid);
		System.out.println("department contact:"+contact);
		System.out.println("++++++++++++++++++");
	}
}
class insurance
{
	String insurancename;
	int insuranceid;
	String date;
	insurance(String name,int id,String Date)
	{
		insurancename=name;
		insuranceid=id;
	    date=Date;
		System.out.println("insurance name:"+insurancename);
		
		System.out.println("insurance id:"+insuranceid);
		System.out.println("registered date:"+date);
		System.out.println("++++++++++++++++++");
	}
}
public class Employee {

	public static void main(String[] args) {
		employee1 emp=new employee1("santosh",20,28,"vijayanagar");
		department dept =new department("praveen",25,9113666087l);
		insurance house=new insurance("vehicle insurance",355,"10thjune2024");
		

	}

}

