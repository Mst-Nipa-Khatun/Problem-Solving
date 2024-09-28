package com.mycompany.problemsolving.arraySolve;

public class MaximumSubarray643 {
    public static void main(String[] args) {
        int[] nums = {-1};
        int k = 1;
        /*
            int[] nums = {5};
            int k=1;
         */
        System.out.printf("" + findMaxAverage(nums, k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int length = nums.length;
        double maxSum = 0;
        for (int i = 0; i < length; i++) {
            int expected = i + (k - 1);
            if (expected > length - 1)
                break;
            int subSum = 0;
            for (int j = i; j <= expected; j++)
                subSum += nums[j];
            if (subSum<0 && maxSum==0){
                maxSum = subSum;
                continue;
            }
            maxSum = getMaxNumber(maxSum, subSum);
        }
        return maxSum / k;
    }

    public static double getMaxNumber(double a, double b) {
        if (a > b) return a;//we can also do this logic using Math.max() function.
        return b;
    }

}
