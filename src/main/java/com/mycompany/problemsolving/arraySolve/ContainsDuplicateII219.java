package com.mycompany.problemsolving.arraySolve;


import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII219 {

    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        System.out.println(containsNearbyDuplicate(nums, 1));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        //leetCode accepted solution
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer value = map.get(nums[i]);
            if (value != null) {

               if ((i - value) <= k)
                   return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
