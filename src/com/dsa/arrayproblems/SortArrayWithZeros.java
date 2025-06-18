package com.dsa.arrayproblems;

import java.util.Arrays;

public class SortArrayWithZeros {
    public static void main(String[] args) {
        int[] arr={1,0,1,0,1,0};
        int size=arr.length;
        arrayWithZeros(arr,size);
    }
    public static void arrayWithZeros(int[] arr,int size){
        int totalOne=0;
        int[] arrNew = new int[size];
        for(int i=0;i<=size-1;i++){
            if(arr[i]!=0){
                totalOne++;
            }
        }
        for(int j=size-1;j>=totalOne;j--){
            arrNew[j]=1;
        }

    }
}