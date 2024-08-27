package com.gentech.return1;

class Firstarray
{
	int[] firstprint(int a[])
	{
		int res[]=new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			res[k]=a[0];
		}
		return res;
	}
}
public class Firstelement {

	public static void main(String[] args) {
		Firstarray f=new Firstarray();
		int a[]= {40,10,60,30,50};
		System.out.print(a[0]);
		

	}
}

