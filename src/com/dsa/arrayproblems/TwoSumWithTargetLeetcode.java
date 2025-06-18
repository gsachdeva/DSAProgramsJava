package com.dsa.arrayproblems;

import java.lang.reflect.Array;

public class TwoSumWithTargetLeetcode {
    public static void main(String[] args) {
        int[] arr={15,7,11,2};
        int target=9;
        int size=arr.length-1;
        int[] result=sumOfTwoNumber(arr,target,size);
        System.out.print("Indices: "+result[0]+" "+result[1]);
    }
    public static int[] sumOfTwoNumber(int arr[], int target, int size){
        int temp=0;
        for(int i=0;i<=size;i++){
            for(int j=i+1;j<=size;j++){
                temp=arr[i]+arr[j];
                if(temp==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}