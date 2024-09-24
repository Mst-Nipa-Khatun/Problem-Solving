package com.mycompany.problemsolving.arraySolve;

import java.util.Arrays;

public class ReshapeMatrix566 {
        public static void main(String[] args) {
            int[][] mat = {{1, 2}, {3, 4}};
            int r = 2, c = 4;

            int[][] result = matrixReshape(mat, r, c);
            System.out.println("Reshaped Matrix:");

            for (int[] row : result)
            {
                System.out.print(Arrays.toString(row));
            }
        }

        public static int[][] matrixReshape(int[][] mat, int r, int c) {
            int m = mat.length;
            int n = mat[0].length;

            if (m * n != r * c) {
                return mat;
            }

            int[][] reshapedMatrix = new int[r][c];
            int index = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    reshapedMatrix[index / c][index % c] = mat[i][j];
                    index++;
                }
            }
            return reshapedMatrix;
        }
    }

