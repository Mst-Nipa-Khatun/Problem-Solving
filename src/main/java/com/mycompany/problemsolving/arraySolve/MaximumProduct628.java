package com.mycompany.problemsolving.arraySolve;

import static java.lang.Math.max;

public class MaximumProduct628 {
    public static void main(String[] args) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int[] nums = {-1, -2, -3};
        for ( int num : nums) {
            if (num <= min1) {
                min2 = min1;
                min1 = num;
            } else if (num <= min2) {
                min2 = num;
            }
            if (num >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num >= max2) {
                max3 = max2;
                max2 = num;
            } else if (num >= max3) {
                max3 = num;
            }
        }
        int result = max(max1 * min1 * min2, max1 * max2 * max3);
        System.out.println(result);
    }
}

