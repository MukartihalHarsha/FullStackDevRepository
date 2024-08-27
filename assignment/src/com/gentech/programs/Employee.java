package com.gentech.programs;
class employee1
{
	String EmpName;
	int EmpID;
	int Age;
	String Address;
	employee1()
	{
		EmpName="Naveen";
		EmpID=01;
		Age=26;
		Address="Whitefeild";
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
	department()
	{
		deptname="physical education";
		deptid=15;
	    contact=9113666087l;
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
	insurance()
	{
		insurancename="houseloan";
		insuranceid=205;
	    date="20/6/24";
		System.out.println("insurance name:"+insurancename);
		
		System.out.println("insurance id:"+insuranceid);
		System.out.println("registered date:"+date);
		System.out.println("++++++++++++++++++");
	}
}
public class Employee {

	public static void main(String[] args) {
		employee1 emp=new employee1();
		department dept =new department();
		insurance house=new insurance();
		

	}

}
