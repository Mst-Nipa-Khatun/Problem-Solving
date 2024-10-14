
package com.mycompany.problemsolving.arraySolve;

public class SortArraybyParityTwo922 {
    public static void main(String[] args) {
        int[] nums = {2, 6, 9, 7};
        int[] nums2 = new int[nums.length];
        int even = 0, odd = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums2[even] = nums[i];
                even += 2;
            } else {
                nums2[odd] = nums[i];
                odd = odd + 2;
            }
        }
        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }
}



