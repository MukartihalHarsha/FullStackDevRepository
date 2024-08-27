package com.gentech.return1;

class Firstarray
{
	String[] firsthalfprint(String a[])
	{
		String res[]=new String[a.length/2];
		int k=0;
		for(int i=0;i<(a.length/2);i++)
		{
			res[k]=a[i];
			k++;
		}
		return res;
	}
}
public class Firsthalf {

	public static void main(String[] args) {
		Firstarray f=new Firstarray();
		String a[]= {"1","2","3","4","5","6"};
		String c[]=f.firsthalfprint(a);
		for(int i=0;i<(c.length);i++)
		{
			System.out.print(c[i]+" ");
		}

	}
}
