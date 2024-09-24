package com.mycompany.problemsolving.arraySolve;

import java.util.Arrays;

public class ArrayPartition561 {
    public static void main(String[] args) {
        int[] arr = {6,2,6,5,1,2};
        int sum = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

