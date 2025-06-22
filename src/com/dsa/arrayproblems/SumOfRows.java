package com.dsa.arrayproblems;

public class SumOfRows {
    public static void main(String[] args) {
        int[][] arr ={{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        printColumnSums(arr);
    }
    public static void printColumnSums(int[][] arr){
        int sum=0;
        {
            for(int row=0;row<arr.length;row++){
            for(int column=0;column<arr[0].length;column++){
                    sum=arr[row][column]+sum;
                }
                System.out.print("Sum is "+ sum);
                sum=0;
            }

        }
    }
}