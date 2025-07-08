package com.dsa.sorting;

/**
 * Author: Gaurav Sachdeva
 * Date: 07/07/25
 */
public class SmallestPivotIndex {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        int pivotIndex = findPivotIndex(arr);
        System.out.print("Smallest Pivot Index "+pivotIndex);
    }
    public static int findPivotIndex(int[] arr){
        int left =0;
        int right = arr.length-1;

        if (arr[left] < arr[right]) return 0;

        while(left < right){
            int mid = left + (right - left)/2;

            // if pivot is in the right half
            if(arr[mid] > arr[right]){
                left = mid + 1;
            }
            else{
                right = mid ;
            }
        }

        return left;
    }
}