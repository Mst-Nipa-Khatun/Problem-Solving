package com.mycompany.problemsolving;


public class DiogonalPb8 {
    public static void main(String[] args) {
        int[][]  a = {{1, 2, -3}, {4, 5, 6}, {7, 8, -9}};
        int sumOfDiagonal=0;
        int sum=0;
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a.length; col++) {
                if (row == col)
                {
                sumOfDiagonal = sumOfDiagonal + a[row][col];
            }
        }}
        for (int row = 0; row < a.length; row++) {
            for (int col =a.length-1; col>0; col--)
            {
                if (row != col)
                {
                    sum = sum + a[row][col];

                }
            }

            }

        System.out.println("Sum of primary Diagonal : "+sumOfDiagonal);
        System.out.println("Sum of secondary Diagonal : "+sum);


    }}
