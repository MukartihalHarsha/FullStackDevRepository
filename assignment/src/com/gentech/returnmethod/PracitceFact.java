package com.gentech.returnmethod;
class Factorial1
{
	int factorial(int num) {
		int f=1;
		for(int i=1;i<num;i++)
		{
			f=f*i;
		}
		return f;
		
	}
	
}

public class PracitceFact {
	public static void main(String[] args)
	{
		Factorial1 f=new Factorial1();
		int num=5;
		int res=f.factorial(num);
		System.out.println(res);
	}

}
