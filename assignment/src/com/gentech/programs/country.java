package com.gentech.programs;
class country1
{
	String name;
	int code;
	country1()
	{
		name="India";
		code=91;
		System.out.println("country name:"+name);
		System.out.println("country code:"+code);
		System.out.println("++++++++++++++++++");
	}
    
}
class state
{
	String name;
	String capital;
	state()
	{
		name="Karnataka";
		capital="bengaluru";
		System.out.println("state name:"+name);
		System.out.println("capital city:"+capital);
		System.out.println("++++++++++++++++++");
	}
    
}
class district
{
	String name;
	int nooftaluks;
	district()
	{
		name="belagavi";
		nooftaluks=10;
		System.out.println("district name:"+name);
		System.out.println("number of taluks:"+nooftaluks);
		System.out.println("++++++++++++++++++");
	}
    
}
class village
{
	String name;
	int pincode;
	village()
	{
		name="bagewadi";
		pincode=591307;
		System.out.println("village name:"+name);
		System.out.println("pincode:"+pincode);
		System.out.println("++++++++++++++++++");
	}
    
}
public class country {

	public static void main(String[] args) {
		country cn=new country();
		state st=new state();
		district dt=new district();
		village vg=new village();
		
	}

}
