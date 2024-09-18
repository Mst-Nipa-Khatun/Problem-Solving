package com.mycompany.problemsolving.arraySolve;

import java.util.*;

public class MergeAndSort88 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};

        merge2(arr, 3, arr2, 3);

        /*   int[] arr3 = new int[arr.length + arr2.length];
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
        System.out.println(Arrays.toString(arr3));*/

    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int totalGivenMergedItems = m + n;
        List<Integer> mergedItems = new ArrayList<>();
        ;
        for (int i = 0; i < totalGivenMergedItems; i++) {
            int currentExpectedValue;
            int currentExpectedIndex;
            if (i <= (m - 1)) {
                currentExpectedIndex = i;
                currentExpectedValue = nums1[currentExpectedIndex];
            } else {
                currentExpectedIndex = i - m;
                currentExpectedValue = nums2[currentExpectedIndex];
            }
            if (currentExpectedValue == 0) {
                continue;
            }
            mergedItems.add(currentExpectedValue);
        }
        for (int i = 0; i < mergedItems.toArray().length; i++) {
            nums1[i] = mergedItems.get(i);
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
