package com.dsa.sorting;

/**
 * Author: Gaurav Sachdeva
 * Date: 09/07/25
 */
public class NonDuplicateElementSearch {
    public static void main(String[] args) {
        int[] arr= {1, 1, 2, 2, 3, 3, 4, 8, 8};
        int number = findDuplicateElement(arr);
        System.out.print("Number is "+number);
    }
    public static int findDuplicateElement(int[] arr){
        int start =0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }
            if(mid > arr[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return start;
    }
}