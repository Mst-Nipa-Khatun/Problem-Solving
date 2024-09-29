package com.mycompany.problemsolving.arraySolve;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        //leetCode accepted solution
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}