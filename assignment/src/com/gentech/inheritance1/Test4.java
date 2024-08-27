package com.gentech.inheritance1;

public class Test4
{
    static int[][] matrix = new int[3][3];
    static int[][] transposedMatrix = new int[3][3];

    static {
        
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++)
            {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
    }

    public static void main(String[] args) 
    {
        
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
