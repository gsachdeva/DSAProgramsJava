package com.dsa.sorting;

/**
 * Author: Gaurav Sachdeva
 * Date: 08/07/25
 */
public class SearchMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,  4,  7, 11, 15},
                {2,  5,  8, 12, 19},
                {3,  6,  9, 16, 22},
                {10,13,14,17, 24},
                {18,21,23,26, 30}
        };
        int target = 5;
        boolean found = SearchMatrixFunction(matrix,target);
    }
    public static boolean SearchMatrixFunction(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int total = rows * cols;
        int start =0;
        int end = total - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            int rowIndex = mid / cols;
            int colIndex = mid % cols;

            if(target == matrix[rowIndex][colIndex]){
                return true;
            }else if(target < matrix[rowIndex][colIndex]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return false;
    }
}