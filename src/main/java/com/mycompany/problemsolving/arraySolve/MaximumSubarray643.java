package com.mycompany.problemsolving.arraySolve;

public class MaximumSubarray643 {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k=4;
        int currentSum = 0;
        for (int i = 0; i < k; ++i) {
            currentSum += nums[i];
        }

        int maxSum = currentSum;

        for (int i = k; i < nums.length; ++i) {
            currentSum += (nums[i] - nums[i - k]);

            maxSum = Math.max(maxSum, currentSum);
        }
        double v = maxSum * 1.0 / k;
        System.out.println(v);
    }
}
