package com.gentech.return1;

class Sum
{
	int[] print(int num)
	{
		int res[]=new int[11];
		int j=0;
		for(int i=0;i<=10;i++)
		{
			res[j]=num*i;
			res[j]=res[j]+i;
			j++;
		}
		return res;
	}
}
public class Sumtable {

	public static void main(String[] args) {
		Sum f=new Sum();
		
		int c[]=f.print(2);
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}

	}

}

