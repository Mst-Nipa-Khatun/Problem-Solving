package com.mycompany.problemsolving.arraySolve;

import java.util.*;

public class LongestContineous674 {
    public static void main(String[] args) {
       // int[] nums = {3,0,6,2,4,7,0,0};
        int[] nums = {1,3,5,7};
        System.out.println(""+findLengthOfLCIS(nums));
    }

    public static int findLengthOfLCIS(int[] nums) {
        int count = 0;
        int max = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int current  = nums[i];
            if (current <= max) {
                list.add(count);
                max = current;
                count = 1;
            } else {
                max = current;
                count++;
            }
        }
        //below 2 line for sort array and arrayList
        //for array Arrays.sort();
        //for list  Collections.sort();
        Collections.sort(list, Collections.reverseOrder());
        if (list.isEmpty()) {
            return Math.max(count, 0);
        }
        return Math.max(count, list.get(0));
    }

}
