package com.dsa.arrayproblems;

public class SpiralPrintOfNumbers {
    public static void main(String[] args) {
        int[][] arr = {
                { 1,  2,  3,  4,  5},
                { 6,  7,  8,  9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int rowSize=5;
        int colSize=5;
        printSpiralMatrix(arr,rowSize,colSize);
    }
    public static void printSpiralMatrix(int[][] arr,int rowSize,int colSize){

        int endingRow= rowSize -1;
        int endingCol= colSize -1;

        int sum=0;
        for(int row = 0; row<= rowSize -1; row++){
            for(int col = 0; col<= colSize -1; col++){
                
                sum=sum+arr[row][col];
            }
        }
    }
}