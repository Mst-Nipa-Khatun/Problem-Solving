package com.mycompany.problemsolving.arraySolve;

public class SortArrayByParity905 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] nums2 = new int[nums.length];
        int val = 0, k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums2[i] = nums[i];
                k++;
                System.out.print(nums2[i] + " ");
//            }else if (nums[i] != nums2[i]) {
//                nums2[k] = nums[i];
//                k++;
//            }
//

            }
        }
    }}
