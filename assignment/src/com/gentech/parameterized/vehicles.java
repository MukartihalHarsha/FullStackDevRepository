package com.gentech.parameterized;

class twowheelers
{
	String company;
	String model;
	String chassisno;
	long regnno;
	twowheelers(String Company,String Model,String Chassis,long Regno)
	{
		company=Company;
		model=Model;
		chassisno=Chassis;
		regnno=Regno;
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
	fourwheelers(String Company,String Model,String Chassis,long Regno)
	{
		company=Company;
		model=Model;
		chassisno=Chassis;
		regnno=Regno;
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
	heavyvehicles(String Company,String Model,String Chassis,long Regno)
	{
		company=Company;
		model=Model;
		chassisno=Chassis;
		regnno=Regno;
		System.out.println("company:"+company);
		System.out.println("model:"+model);
		System.out.println("chassis number:"+chassisno);
		System.out.println("registration number:"+regnno);
		System.out.println("++++++++++++++++++");
	}
}
public class vehicles {

	public static void main(String[] args) {
		twowheelers tw=new twowheelers("suzuki","R15","SZ9876KI",67543267);
		fourwheelers fw=new fourwheelers("hyundai","i20","HY9346AI",56348976);
		heavyvehicles hv=new heavyvehicles("scania","trooter","SC9076IA",34908712);
		

	}

}
