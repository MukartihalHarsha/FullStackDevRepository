package com.gentech.methods;
class Findsum
{
	void sum()
	{
		int sum=0;
		for(int i=1;i<=50;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of numbers: "+sum);
		
	}
}

public class SumOfNumbers {

	public static void main(String[] args) {
		Findsum o1=new Findsum();
		o1.sum();
		

	}

}

