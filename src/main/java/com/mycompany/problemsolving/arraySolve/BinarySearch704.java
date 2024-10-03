package com.mycompany.problemsolving.arraySolve;

public class BinarySearch704 {
    public static void main(String[] args) {
        //int array declare
        //target value in binary method
        //find out mid value if target value >< mid thn move.
        //loop check if value in this array print index number
        //if not found number in this array return -1.

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
       System.out.println(nums[left] == target ? left : -1);
//            if (nums[left] == target) {
//                System.out.println(nums[left]);
//            } else {
//                System.out.println(-1);
//           }
        }
    }