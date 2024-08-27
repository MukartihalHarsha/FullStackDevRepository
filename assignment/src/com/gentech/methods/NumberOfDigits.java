package com.gentech.methods;
class Digits
{
	void digits(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("number of digits: "+count);
	}
}

public class NumberOfDigits {

	public static void main(String[] args) {
		Digits o1=new Digits();
		o1.digits(234);
		

	}

}

