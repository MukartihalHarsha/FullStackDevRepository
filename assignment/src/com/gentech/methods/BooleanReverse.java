package com.gentech.methods;
class Booleanarray
{
	void reversearray(Boolean[] arr)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}

public class BooleanReverse {

	public static void main(String[] args) {
			Boolean[] arr=new Boolean[] {true,false,false,true,false};
			Booleanarray o1=new Booleanarray();
			o1.reversearray(arr);
		

	}

}

