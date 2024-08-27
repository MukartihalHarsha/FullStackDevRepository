package com.gentech.programs;
class twowheelers
{
	String company;
	String model;
	String chassisno;
	long regnno;
	twowheelers()
	{
		company="royal enfield";
		model="GT650";
		chassisno="RE3675432GT";
		regnno=20240716l;
		System.out.println("company:"+company);
		System.out.println("model:"+model);
		System.out.println("chassis number:"+chassisno);
		System.out.println("registration number:"+regnno);
		System.out.println("++++++++++++++++++");
	}
}
class fourwheelers
{
	String company;
	String model;
	String chassisno;
	long regnno;
	fourwheelers()
	{
		company="toyota";
		model="fortuner";
		chassisno="RTY3675432FR";
		regnno=20240617l;
		System.out.println("company:"+company);
		System.out.println("model:"+model);
		System.out.println("chassis number:"+chassisno);
		System.out.println("registration number:"+regnno);
		System.out.println("++++++++++++++++++");
	}
}
class heavyvehicles
{
	String company;
	String model;
	String chassisno;
	long regnno;
	heavyvehicles()
	{
		company="Scania";
		model="trooter";
		chassisno="SC3675432TR";
		regnno=20230716l;
		System.out.println("company:"+company);
		System.out.println("model:"+model);
		System.out.println("chassis number:"+chassisno);
		System.out.println("registration number:"+regnno);
		System.out.println("++++++++++++++++++");
	}
}
public class vehicles {

	public static void main(String[] args) {
		twowheelers tw=new twowheelers();
		fourwheelers fw=new fourwheelers();
		heavyvehicles hv=new heavyvehicles();
		

	}

}
