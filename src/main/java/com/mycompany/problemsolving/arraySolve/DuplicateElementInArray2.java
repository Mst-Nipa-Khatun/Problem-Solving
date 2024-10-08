package com.mycompany.problemsolving.arraySolve;

public class DuplicateElementInArray2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5, 6, 7, 7, 9, 10, 10};
        int[] arr2 = new int[arr.length];
        int k = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(" " + arr[j]);
                }
            }
        }
    }
}

