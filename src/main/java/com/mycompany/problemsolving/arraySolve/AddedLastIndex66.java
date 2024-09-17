package com.mycompany.problemsolving.arraySolve;

import java.util.Arrays;

public class AddedLastIndex66 {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        //int[] arr = {4, 3, 2, 1};
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
            arr2[2] = arr[i] + 1;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
