package com.mycompany.problemsolving.arraySolve;

import java.util.Arrays;

public class IntersectionTwoArrays349 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,13};
        int [] arr2 = {2,1,4,3,12};
        int[] arr3 = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr2[i]) {
                arr3[k] = arr[i];
                k++;
            }
        }
        int[] result = Arrays.copyOf(arr3, k);
        System.out.println(Arrays.toString(result));
    }
}


