package com.mycompany.problemsolving.arraySolve;

public class MaxConsecutiveOne485 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount=Math.max(maxCount, currentCount);//max=0,current=1
            } else {
                currentCount = 0;
            }
        }
        System.out.println(maxCount);
    }
}
