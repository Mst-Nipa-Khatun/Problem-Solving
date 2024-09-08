
package com.mycompany.problemsolving;


public class ArrayTransposePb4 {
    public static void main(String[] args) {

        //int[][] arr = new int[3][3];
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int b[][] = {{}, {}, {}};

        for (int i = 0; i < a[0].length; i++) {
            for (int j =  0 ; j < a.length; j++) {
                System.out.print(a[i][i] + " ");
                System.out.println();
            }
        }
    }
}
