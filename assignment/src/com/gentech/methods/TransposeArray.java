package com.gentech.methods;
class Transposearray
{
	void array(int[][] arr)
	{
		int[][] transpose;
		int[][] matrix;
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				transpose[i][j]=matrix[j][i];
			}
		}
		System.out.println("transpose of matrix: "+transpose[][]);
	}
}

public class TransposeArray {

	public static void main(String[] args) {
		int[][] arr=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		Transposearray o1=new Transposearray();
		o1.array(arr);
		

	}

}
