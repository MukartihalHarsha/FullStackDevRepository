package com.gentech.abstracts;
abstract class Person 
{	
	static class PersonDetails 
	{
		String personName;
		String job;
		int personId;

		PersonDetails() 
		{
			personName = "Kiran";
			job = "Accountant";
			personId = 80883;
		}

		void displayPersonDetails() {
			System.out.println("Person Name: " + personName);
			System.out.println("Person Job: " + job);
			System.out.println("Person Id: " + personId);
		}
	}
	static class PersonAddress 
	{
		String country;
		String state;
		String city;
		int pincode;
		PersonAddress() 
		{
			country = "India";
			state = "Karnataka";
			city = "Bangalore";
			pincode = 560093;
		}
		void displayPersonAddress() 
		{
			System.out.println("Country: " + country);
			System.out.println("State: " + state);
			System.out.println("City: " + city);
			System.out.println("Pincode: " + pincode);

		}
	}	 
	static void displayDetails() 
	{
		PersonDetails o = new PersonDetails();
		o.displayPersonDetails();
	}

	static void displayAddress() {
		PersonAddress  o = new PersonAddress();
		o.displayPersonAddress();
	}
} 
public class AbstractMultipleStaticMethod {
	public static void main(String[] args) {			
		Person.displayDetails();
		Person.displayAddress();


	}
}