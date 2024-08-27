package com.gentech.methods;
class Cube
{
	void cube(int[] arr)
	{
		int res=1;
		for(int i=0;i<=arr.length;i++);
		{
			res=arr[i]*arr[i]*arr[i];
		}
		System.out.println("cube of elements: "+res);
	}
}

public class CubeofElements {

	public static void main(String[] args) {
		int[] arr=new int[]{1,2,3,4,5,6};
		Cube o1=new Cube();
		o1.cube(arr);
		

	}

}
