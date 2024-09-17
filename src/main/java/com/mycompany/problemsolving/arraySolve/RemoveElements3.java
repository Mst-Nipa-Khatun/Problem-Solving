package com.mycompany.problemsolving.arraySolve;

import java.util.Arrays;

public class RemoveElements3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int[] arr2 = new int[arr.length];
        int val = 3;
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


