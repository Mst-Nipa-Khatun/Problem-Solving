package com.mycompany.problemsolving.arraySolve;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1};
        int[] arr2 = new int[arr.length];
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }

    public static boolean containsDuplicate(int[] nums) {
        //for leetCode
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