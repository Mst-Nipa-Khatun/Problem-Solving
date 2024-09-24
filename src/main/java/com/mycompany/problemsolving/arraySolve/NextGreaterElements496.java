package com.mycompany.problemsolving.arraySolve;

import java.util.Arrays;

public class NextGreaterElements496 {
    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1, 2, 3, 4};

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int currentNum = nums1[i];
            int indexInNums2 = -1;

            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == currentNum) {
                    indexInNums2 = j;
                    break;
                }
            }

            int nextGreater = -1;
            for (int k = indexInNums2 + 1; k < nums2.length; k++) {
                if (nums2[k] > currentNum) {
                    nextGreater = nums2[k];
                    break;
                }
            }
            result[i] = nextGreater;
            System.out.println(Arrays.toString(result));
        }

    }
    }

