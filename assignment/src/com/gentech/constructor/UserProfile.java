package com.gentech.constructor;

class Profile
{
	void profile(String name)
	{
		System.out.println("User name: "+name);
	}
	void profile(String name,String email)
	{
		System.out.println("User name: "+name);
		System.out.println("Email: "+email);
	}
	void profile(String name,String email,int age)
	{
		System.out.println("User name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Age: "+age);
	}
	void profile(String name,String email,int age,String address)
	{
		System.out.println("User name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
	}
}
public class UserProfile {

	public static void main(String[] args) {
		Profile user=new Profile();
		user.profile("Harsha");
		user.profile("Abhi","abi@gmail.com",22,"Bagalkot");
		
		

	}

}
