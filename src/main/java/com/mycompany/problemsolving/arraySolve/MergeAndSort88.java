package com.mycompany.problemsolving.arraySolve;

import java.util.Arrays;

public class MergeAndSort88 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 8, 7, 9};

        int[] arr3 = new int[arr.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                while (i < arr.length && j < arr2.length) {
                    arr3[k++] = arr[i++];
                    arr3[k++] = arr2[j++];

                }
            }

        }
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
