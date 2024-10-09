package com.mycompany.problemsolving.arraySolve;

public class MonotonicArray896 {
    public static void main(String[] args) {
        //int[] nums = {1, 2, 2,3,5, 4};
        int[] nums={4,3,2,1,1,1};
        //int[] nums2 = new int[nums.length];

        System.out.println(monotonictest(nums));
    }

    public static boolean monotonictest(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {//2<(2-1)=2<1,4<(4-1)=4<3,3<(3-1)=3<2
                increasing=false;
                //return false;
            }
            if (nums[i] > nums[i - 1]) { //2>(2-1)=2>1,4>(4-1)=4>3,3>(3-1)=3>2
                decreasing=false;
               // return false;
            }

        }
        return true;
    }
}
