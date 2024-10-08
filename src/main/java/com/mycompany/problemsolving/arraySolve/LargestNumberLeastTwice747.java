package com.mycompany.problemsolving.arraySolve;

import java.util.ArrayList;
import java.util.List;

public class LargestNumberLeastTwice747 {
    public static void main(String[] args) {
        //int nums declare
        //full array theke findout kora max konta
        //sei max k full array te j value gulo ase double hoy kina check kora
        //double hole return 1 otherwise return -1.


        //incomplete
        //int[] nums = {3,6,1,0};
        int[] nums = {3,4,1,7};
        int max=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                //max=nums[i]*2;
                max=nums[i];
            }else if(max==nums[i]*2){
                max=nums[i];
                //return 1;
            }else {
                //return -1;
            }

        }
        System.out.println(max);


//        List<Integer> values = new ArrayList<>();
//        for (int num : nums) {
//            if (num => nums[k]) {
//                 values.add(num);
//                 System.out.println(num);
//            }

        }
    }

