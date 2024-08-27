package com.gentech.methods;
class Stringarray
{
	void reversearray(String[] arr)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}

public class StringReverse {

	public static void main(String[] args) {
			String[] arr=new String[] {"abhi","sachin","akash","kiran","pavan"};
			Stringarray o1=new Stringarray();
			o1.reversearray(arr);
		

	}

}
