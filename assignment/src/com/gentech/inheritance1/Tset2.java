package com.gentech.inheritance1;
class Employee1
{
	{
		int employee_id=101;
		String employee_name="Harsha";
		
	}
	{
		System.out.println("Employee id is : "+employee_id);
		System.out.println("Employee name is : "+employee_name);
	}
}
class Department
{
	String dept_name;
	int dept_id;
	Department(int dept_id,String dept_name)
	{
		Employee1 emp = new Employee1();
		this.dept_id=dept_id;
		this.dept_name=dept_name;
	}
}
class Tset2
{
	public static void main(String[] args)
	{
		Department dept = new Department();
		dept.Department(201,"Accounts");
	}
}
