package com.gentech.parameterized;

class country1
{
	String name;
	int code;
	country1(String Name,int Code)
	{
		name=Name;
		code=Code;
		System.out.println("country name:"+name);
		System.out.println("country code:"+code);
		System.out.println("++++++++++++++++++");
	}
    
}
class state
{
	String name;
	String capital;
	state(String Name,String Capital)
	{
		name=Name;
		capital=Capital;
		System.out.println("state name:"+name);
		System.out.println("capital city:"+capital);
		System.out.println("++++++++++++++++++");
	}
    
}
class district
{
	String name;
	int nooftaluks;
	district(String Name,int taluks)
	{
		name=Name;
		nooftaluks=taluks;
		System.out.println("district name:"+name);
		System.out.println("number of taluks:"+nooftaluks);
		System.out.println("++++++++++++++++++");
	}
    
}
class village
{
	String name;
	int pincode;
	village(String Name,int Pincode)
	{
		name=Name;
		pincode=Pincode;
		System.out.println("village name:"+name);
		System.out.println("pincode:"+pincode);
		System.out.println("++++++++++++++++++");
	}
    
}
public class country {

	public static void main(String[] args) {
		country1 cn=new country1("India",91);
		state st=new state("Karnataka","bengaluru");
		district dt=new district("Belagavi",10);
		village vg=new village("bagewadi",591307);
		
	}

}