package com.gentech.parameterized;

class student
{
	String name;
	int rollno;
	String dept;
	student(String Name,int Rollno,String Dept)
	{
		name=Name;
		rollno=Rollno;
		dept=Dept;
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
	library(int Libid,int Bookno,String Bookname)
	{
		libid=Libid;
		bookno=Bookno;
		bookname=Bookname;
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
	sports(int id,String name)
	{
		sportsid=id;
		sportsname=name;
		System.out.println("spoprts id:"+sportsid);
		System.out.println("sports name:"+sportsname);
		System.out.println("++++++++++++++++++");
	}
	
}
class computerlabs
{
	int noofsystems;
	String labname;
	computerlabs(int number,String name)
	{
		noofsystems=number;
		labname=name;
		System.out.println("number of systems:"+noofsystems);
		System.out.println("lab name:"+labname);
		System.out.println("++++++++++++++++++");
	}
	
}
public class college {


	public static void main(String[] args) {
		student st=new student("naveen",41,"computer science");
		library lb=new library(125,565,"Operating systems");
		sports sp=new sports(5,"Cricket");
		computerlabs cl=new computerlabs(30,"Charles babbage lab");
		

	}

}
