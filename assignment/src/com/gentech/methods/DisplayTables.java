package com.gentech.methods;
class Display
{
	void tables()
	{
		for(int i=1;i<=20;i++)
		{
			for(int j=1;j<=20;j++)
			{
				System.out.println(j + " x " + i + " = " + (j * i));
			}
		}System.out.println();
	}
}

public class DisplayTables {

	public static void main(String[] args) {
		Display o1=new Display();
		o1.tables();
		

	}

}
