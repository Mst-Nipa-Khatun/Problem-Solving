package com.mycompany.problemsolving.arraySolve;

import java.util.HashMap;
import java.util.Map;

public class LongestContineous2 {
    public static void main(String[] args) {
        Map<Integer,Integer> nums = new HashMap<Integer,Integer>();
        nums.put(1,1);
        nums.put(2,2);
        nums.put(3,3);
        nums.put(4,2);
        nums.put(5,2);
       // System.out.println(nums);
        System.out.println(nums.values());
        int count=0;int max=0;
        for(Integer i:nums.values()){
            int current=nums.get(i);
            if(current<=max){
                //nums.put(i,nums.count());
               // nums.put(i,current+1);
               nums.put(i,nums.get(i));
                max=current;
                //max=nums.get(i);
                count=1;
            }
            else{
                //max=nums.get(i);
                max=current;
                count++;

            }
        }
        System.out.println(count);

    }
}
