package com.mycompany.problemsolving.arraySolve;

import java.util.Arrays;

public class CandiesPb575 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3};
        Arrays.sort(arr);

        int count = 1;
        int n = arr.length / 2;

        for (int i = 1; i < arr.length && count < n; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
    }
