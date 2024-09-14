package com.mycompany.problemsolving;

public class ArrayDupicatePb10 {
    public static void main(String[] args) {
        int[] a = { 1, 1, 3, 4, 4, 6, 7, 7, 9, 10,10 };

        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]==a[j])
                {
                    System.out.print(a[j]+" ");
                }
            }
        }
    }
}
