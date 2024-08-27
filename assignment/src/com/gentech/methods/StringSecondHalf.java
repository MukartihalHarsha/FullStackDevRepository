package com.gentech.methods;
class Stringarray1
{
	void array(String[] arr)
	{
		for(int i=arr.length-1;i>=arr.length/2;i--)
		{
			System.out.println(arr[i]);
		}
	}
}
public class StringSecondHalf {

	public static void main(String[] args) {
		String[] arr=new String[] {"abhi","sachin","akash","kiran","pavan"};
		Stringarray1 o1=new Stringarray1();
		o1.array(arr);

	}

}
