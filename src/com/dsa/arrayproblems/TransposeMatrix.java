package com.dsa.arrayproblems;

public class TransposeMatrix {

        public static void main(String[] args) {
            int[][] arr = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            int[][] result = transposeMatrix(arr);
            int rowSize=result.length;
            int columnSize=result[0].length;
            // Print the transposed matrix
            for (int row = 0; row < rowSize; row++) {
                for (int col = 0; col < columnSize; col++) {
                    System.out.print(result[row][col] + " ");
                }
                System.out.println();
            }
        }

        public static int[][] transposeMatrix(int[][] matrix) {
            int rowSize=matrix.length;
            int colSize=matrix[0].length;
            int[][] newArr = new int[colSize][rowSize]; // note: dimensions flipped for transpose

            for (int row = 0; row < rowSize; row++) {
                for (int col = 0; col < colSize; col++) {
                    newArr[col][row] = matrix[row][col]; // transpose logic
                }
            }

            return newArr;
        }
    }

