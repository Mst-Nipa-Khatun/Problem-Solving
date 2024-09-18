package com.mycompany.problemsolving.arraySolve;

import java.util.Arrays;

public class ContainsDuplicate217 {
public static void main(String[] args) {
    int[] arr={1,2,3,4,1};
    int[] arr2=new int[arr.length];
    Arrays.sort(arr);

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] == arr[i-1]) {
            System.out.println(true);
            return;
        }
    }
    System.out.println(false);
}
}