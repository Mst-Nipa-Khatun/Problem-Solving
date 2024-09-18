package com.mycompany.problemsolving.arraySolve;

public class MajorityElements169 {
    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1, 1, 1, 2, 2};
        int[] arr2 = new int[nums1.length];

        int count = 0, temp = 0;

//        for(int i = 1; i < nums1.length; i++){
//            for(int j = i+1; j < nums1.length; j++){
//                if(nums1[i] == nums1[j]){
//                    System.out.println("Num"+nums1[i]);
//                }
//            }
//        }

        for (int num : nums1) {
            if (count == 0) {
                temp = num;
            }
            if (num == temp) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(temp);
    }
}
