package com.gentech.methods;
class IntegerSum
{
	void sum(int[] arr)
	{
		int res=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			res=res+arr[i];
		}
		System.out.println("sum of elements in array: "+res);
	}
}

public class ArraySum {

	public static void main(String[] args) {
		int[] arr=new int[]{2,4,6,8,10};
		IntegerSum o1=new IntegerSum();
		o1.sum(arr);
		

	}

}
