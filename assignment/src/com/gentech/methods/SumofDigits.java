package com.gentech.methods;
class Digits1
{
	void sum1(int num)
	{
		int sum=0;
		while(num!=0)
		{
			sum+=num % 10;
            num /= 10;
		}
		System.out.println("sum of digits: "+sum);
	}
}

public class SumofDigits {

	public static void main(String[] args) {
		Digits1 o1=new Digits1();
		o1.sum1(234);
		
	}

}
