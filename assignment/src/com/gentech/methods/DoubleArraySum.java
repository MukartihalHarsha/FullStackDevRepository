package com.gentech.methods;
class Doublearray
{
	void array(double[][] arr)
	{
		double sum=0;
		for(int i=0;i<arr[1].length;i++)
		{
			sum+=arr[1][i];
		}
		System.out.println("sum of second row: "+sum);
	}
}
	

public class DoubleArraySum {

	public static void main(String[] args) {
		double[][] arr=new double[][] {{1.1,2.2,3.3},{4.4,5.5,6.6},{7.7,8.8,9.9}};
		Doublearray o1=new Doublearray();
		o1.array(arr);
	}
		

}
