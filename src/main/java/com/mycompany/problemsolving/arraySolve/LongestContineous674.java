package com.mycompany.problemsolving.arraySolve;

public class LongestContineous674 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 7};
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < max) {
                break;
            } else {
                max = nums[i];
                count++;
            }
            System.out.print(" "+max);
        }
    }

//    public static int longestContinuous(int a,int b ) {
//        if(a>b) return a;
//        return b;

}
