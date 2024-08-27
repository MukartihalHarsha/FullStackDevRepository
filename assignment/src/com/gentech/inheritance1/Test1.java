package com.gentech.inheritance1;
class Employee
{
	Employee()
	{
		System.out.println("This is a no-args constructor");
	}
	{
		String employee_name="Harsha";
		System.out.println("Employee name is : "+employee_name);
	}
}

class Test1{
	public static void main(String[] args)
	{
		Employee obj = new Employee();
	}
}


