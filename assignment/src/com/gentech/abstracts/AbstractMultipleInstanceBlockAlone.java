package com.gentech.abstracts;

abstract class Person2 
{
	abstract void PersonDetails(String personName, String job, int personId);
}

class PersonDetails extends Person2 
{
	String personName;
	String job;
	int personId;

	PersonDetails(String personName1, String pjob, int person1Id) 
	{
		personName = personName1;
		job = pjob;
		personId = person1Id;
	}
	void PersonDetails(String personName1, String pjob, int person1Id) 
	{
		System.out.println("Person Name: " + personName1);
		System.out.println("Person Job: " + job);
		System.out.println("Person Id: " + personId);
	}

	void displayDetails() 
	{
		PersonDetails(personName, job, personId);
	}
}

public class AbstractMultipleInstanceBlockAlone {
	public static void main(String[] args) {
		PersonDetails o = new PersonDetails("Ravi", "Accountant", 80883);
		o.displayDetails();
	}
}
