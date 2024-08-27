package com.gentech.methods;
class Findcount
{
	void divisibleby6()
	{
		int count=0;
		for(int i=50;i<=150;i++)
		{
			if(i%6==0)
			{
				count+=1;	
			}
			
		}
		System.out.println("count of numbers: "+count);
	}
}

public class CountOfNumbers {

	public static void main(String[] args) {
		Findcount o1=new Findcount();
		o1.divisibleby6();
		

	}

}
