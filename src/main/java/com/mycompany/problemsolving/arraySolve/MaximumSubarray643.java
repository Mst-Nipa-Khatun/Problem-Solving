package com.mycompany.problemsolving.arraySolve;

public class MaximumSubarray643 {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k=4;
        int sum = 0;
        for (int i = 0; i < k; ++i) {
            sum += nums[i];
        }
        int maxSum = sum;

        for (int i = k; i < nums.length; ++i) {
            sum += (nums[i] - nums[i - k]);
            maxSum = Math.max(maxSum, sum);
        }
        double v = maxSum * 1.0 / k;
        System.out.println(v);
    }
}
