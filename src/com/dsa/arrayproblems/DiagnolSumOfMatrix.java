package com.dsa.arrayproblems;

public class DiagnolSumOfMatrix {
    public static void main(String[] args) {
        int[][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int rowSize= 3;
        int colSize=3;
        printSumOfMatrix(arr,rowSize,colSize);
    }
    public static void printSumOfMatrix(int[][] arr, int rowSize, int colSize){
        int sum=0;
        for(int row=0;row<=rowSize-1;row++){
                for(int col=0;col<=colSize-1;col++){
                    if(row==col){
                        sum=arr[row][col]+sum;
                    }
                }
         }
        for(int row=rowSize-1;row>=0;row--){
            for(int col=colSize-1;col>=0;col--){
                if(row==col){
                    sum=arr[row][col]+sum;
                }
            }
        }
        int num=0;
        if((colSize & 1)==1){
             num=arr[rowSize/2][colSize/2];
        }
        sum=sum-num;
        System.out.print("Sum "+sum);
    }
}