package com.dsa.arrayproblems;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr={1,-1, 1, -1};
        int size=arr.length;
        double sum=printAverageOfArray(arr,size);
        System.out.print("Sum "+sum);
    }
    public static double printAverageOfArray(int[] arr,int size){
        double sum=0;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }

        return sum/size;
    }
}