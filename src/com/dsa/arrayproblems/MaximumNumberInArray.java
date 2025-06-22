package com.dsa.arrayproblems;

import java.util.Arrays;

public class MaximumNumberInArray {
    public static void main(String[] args) {
        int[] arr={-1,-2,-4,-3,-6,-5};
        int maximumNumber=printMaximumNumber(arr);
        System.out.print("Maximum Number "+maximumNumber);
    }
    public static int printMaximumNumber(int[] arr){
        int maxNumber=0;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                maxNumber=arr[i];
            }
        }

        return maxNumber;
    }
}