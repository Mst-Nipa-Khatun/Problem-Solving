package com.mycompany.problemsolving.arraySolve;

public class SortArrayByParity905 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] nums2 = new int[nums.length];
        int count = 0, k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                k = nums[i];
                System.out.print(k + " ");
               count++;
//            } else if (nums[i]% 2 != 0) {
//                k = nums[i];
//                System.out.print(k + " ");
            }
        }
       // System.out.print(count);

    }
}
