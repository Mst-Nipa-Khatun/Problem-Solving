package com.mycompany.problemsolving.arraySolve;

public class ToeplitzMatrix766 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        //System.out.println(ToeplitzMatrixmethod(matrix);
    }

    public static boolean ToeplitzMatrixmethod(int[][] matrix) {
        int[][] matrix2 = new int[matrix.length][matrix[0].length]; //row and col

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {//diogonal matrix condition
                    //System.out.print(false);
                    return false;
                }
            }
        }
        return true;
        // System.out.println(true);
    }
}