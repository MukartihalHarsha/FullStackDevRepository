package com.gentech.inheritance1;
class Student
{
	int student_rollno;
	String student_name;
	static int marks;
	static String address;
}
class StudentDemo
{
	StudentDemo()
	{
	Student stud=new Student();
	stud.student_rollno=101;
	stud.student_name="Harsha";
	Student.marks=90;
	Student.address="Vijayanagar";
	System.out.println("Student id is : "+stud.student_rollno);
	System.out.println("Student name is : "+stud.student_name);
	System.out.println("Student marks is : "+Student.marks);
	System.out.println("Student address is : "+Student.address);
	}
}
class Test3
{
	public static void main(String[] args)
	{
		StudentDemo obj = new StudentDemo();
	}
}