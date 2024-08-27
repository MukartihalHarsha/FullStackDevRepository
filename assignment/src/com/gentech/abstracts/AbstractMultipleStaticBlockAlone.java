package com.gentech.abstracts;
abstract class Person1 
{
	static class PersonDetails 
	{
		static 
		{
			String personName = "Rakesh";
			String job = "Data Analyst";
			int personId = 80889;
			System.out.println("Person Name: " + personName);
			System.out.println("Person Job: " + job);
			System.out.println("Person Id: " + personId);
			System.err.println("--------------");
		}
		static 
		{
			String personName = "Ravi";
			String job = "Accountant";
			int personId = 80884;
			System.out.println("Person Name: " + personName);
			System.out.println("Person Job: " + job);
			System.out.println("Person Id: " + personId);
			System.err.println("--------------");
		}		
		static 
		{
			String personName = "Kiran";
			String job = "Developer";
			int personId = 80886;
			System.out.println("Person Name: " + personName);
			System.out.println("Person Job: " + job);
			System.out.println("Person Id: " + personId);
		}
	}
} 
public class AbstractMultipleStaticBlockAlone {
	public static void main(String[] args) {
		Person1.PersonDetails o = new Person1.PersonDetails();
	}
}
