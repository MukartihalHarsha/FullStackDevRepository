package com.gentech.practice;
class Prime {
	public static void main(String[] args) {
		int num=5;
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=flag+1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("it is a prime number");
		}
		else
		{
			System.out.println("it is not a prime number");
		}
	
	}

}
