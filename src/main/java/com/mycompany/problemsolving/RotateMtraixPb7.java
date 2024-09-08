package com.mycompany.problemsolving;

public class RotateMtraixPb7 {
    public static void main(String[] args) {
        int[][]  a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                for(int k=0;k<a[i].length;k++)
                {
                    System.out.print(a[i][k]+" ");

                }
            }
        }
    }
    }
