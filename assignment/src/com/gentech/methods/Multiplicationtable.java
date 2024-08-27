package com.gentech.methods;
class Table1
{
	void table(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		
	}
}

public class Multiplicationtable {

	public static void main(String[] args) {
		Table1 o1=new Table1();
		o1.table(2);
		

	}

}
