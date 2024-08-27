package com.gentech.programs;
class student
{
	String name;
	int rollno;
	String dept;
	student()
	{
		name="harish";
		rollno=20;
		dept="computer science";
		System.out.println("student name:"+name);
		System.out.println("roll number:"+rollno);
		System.out.println("department:"+dept);
		System.out.println("++++++++++++++++++");
	}
	
}
class library
{
	int libid;
	int bookno;
	String bookname;
	library()
	{
		libid=201;
		bookno=355;
		bookname="operating systems";
		System.out.println("library id:"+libid);
		System.out.println("book number:"+bookno);
		System.out.println("book name:"+bookname);
		System.out.println("++++++++++++++++++");
	}
	
}
class sports
{
	int sportsid;
	String sportsname;
	sports()
	{
		sportsid=20;
		sportsname="Football";
		System.out.println("spoprts id:"+sportsid);
		System.out.println("sports name:"+sportsname);
		System.out.println("++++++++++++++++++");
	}
	
}
class computerlabs
{
	int noofsystems;
	String labname;
	computerlabs()
	{
		noofsystems=30;
		labname="charles babbage lab";
		System.out.println("number of systems:"+noofsystems);
		System.out.println("lab name:"+labname);
		System.out.println("++++++++++++++++++");
	}
	
}
public class college {


	public static void main(String[] args) {
		student st=new student();
		library lb=new library();
		sports sp=new sports();
		computerlabs cl=new computerlabs();
		

	}

}
