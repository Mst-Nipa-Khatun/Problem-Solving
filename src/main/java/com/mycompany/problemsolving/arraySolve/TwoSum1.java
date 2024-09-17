package com.mycompany.problemsolving.arraySolve;

import java.util.Arrays;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int[]a2 =new int[2];
        int target = 13;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    a2[0] = i;
                    a2[1] = j;
                    System.out.println(a[i] + " " + a[j]);
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(a2));

    }

}
