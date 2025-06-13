package com.dsa.arrayproblems;

public class MoveAllZeroToEnd {
    public static void main(String[] args){
        int[] arr={10,1,0,1,0,0,0,5};
        int size= arr.length;
        printArrayMoveAllZero(arr,size);
    }
    public static void printArrayMoveAllZero(int[] arr, int size){
        int[] temp = new int[0];
        int num = 0;
        for(int i=0;i<=size-1;i++){
            num=arr[i];
            if(num!=0){
             //   num==temp[i];
            }
        }
    }
}
