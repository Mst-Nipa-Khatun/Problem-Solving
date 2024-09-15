package com.mycompany.problemsolving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayToHashSetPb23 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));


        Set<Integer> hashSet = new HashSet<Integer>(arr.length);
        for(int i : arr) {
            hashSet.add(i);
        }
        System.out.println(hashSet);
    }

}

