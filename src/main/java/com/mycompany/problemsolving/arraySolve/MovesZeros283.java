package com.mycompany.problemsolving.arraySolve;

import java.util.Arrays;

public class MovesZeros283 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int[] arr2 = new int[arr.length];
        int val = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr2[k] = arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
    }
