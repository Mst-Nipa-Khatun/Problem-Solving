package com.mycompany.problemsolving.arraySolve;


public class ContainsDuplicateII219 {
    public static void main(String[] args) {
        //int[] nums = {1,2,3,1,2,3};
        int[] nums = {1,2,3,1};
        int k = 3;
        //int k=2;
        for (int i = 0; i < nums.length; i++) { //i=0; nums[0]=1
            for (int j = i + 1; j <= i + k && j < nums.length; j++) {// j=1,nums[1]=2 No match;
                // j=2,nums[2]=3,no match;j=3,nums[3]=1;match
                // because i from nums[0]=1;so(abs(3 - 0) = 3, which satisfies <= k)
                if (nums[i] == nums[j]) {//nums[0]=nums[3] match
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);

    }
}
