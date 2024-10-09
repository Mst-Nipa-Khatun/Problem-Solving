package com.mycompany.problemsolving.arraySolve;

public class Transposematrix867 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] transpose = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
