package com.mycompany.problemsolving.arraySolve;

import java.util.stream.IntStream;

public class MissingNumber268 {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 3};
        //int[] range=new int[4];
        //int[] range = IntStream.rangeClosed(0, 3).toArray();
        int n = nums.length;
        int val = n * (n + 1) / 2; //1*(1+1)/2=1,2*(2+2)/2=4
        int sum = 0;
        for (int num : nums) { //0
            sum += num;  //num=1
        }
        int a= val-sum; //6-4=2
        System.out.println(a);
    }
}
