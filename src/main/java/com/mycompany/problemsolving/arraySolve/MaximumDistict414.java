package com.mycompany.problemsolving.arraySolve;

public class MaximumDistict414 {
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 16};
        //int n = arr.length;
        int arr_size = arr.length;

        if (arr_size < 3) {
            System.out.printf(" Invalid Input ");

        }

        int first = arr[0];
        for (int i = 1; i < arr_size; i++)
            if (arr[i] > first) {
                first = arr[i];

            }
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr_size; i++)
            if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < arr_size; i++)
            if (arr[i] > third && arr[i] < second){
                third = arr[i];
}
        System.out.printf("The third Largest " +
                "element is %d\n", third);

//        long m1 = Long.MIN_VALUE;
//        long m2 = Long.MIN_VALUE;
//        long m3 = Long.MIN_VALUE;
//        for (int num : nums) {
//            if (num == m1 || num == m2 || num == m3) {
//                continue;
//            }
//            if (num > m1) {
//                m3 = m2;
//                m2 = m1;
//                m1 = num;
//            } else if (num > m2) {
//                m3 = m2;
//                m2 = num;
//            } else if (num > m3) {
//                m3 = num;
    }
}
// return (int) (m3 != Long.MIN_VALUE ? m3 : m1);


