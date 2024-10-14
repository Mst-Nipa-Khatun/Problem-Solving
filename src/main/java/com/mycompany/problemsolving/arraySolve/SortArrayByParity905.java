 package com.mycompany.problemsolving.arraySolve;

public class SortArrayByParity905 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] nums2 = new int[nums.length];
        int  even = 0, odd = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums2[even] = nums[i];
                even++;
               // System.out.println(nums2[even]);
            } else {
                nums2[odd] = nums[i];
                odd--;
            }
        }
        for(int num : nums2) {
            System.out.print(num + " ");
        }
        //System.out.println(nums2);
    }
}