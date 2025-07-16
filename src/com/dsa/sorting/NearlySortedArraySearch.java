package com.dsa.sorting;

/**
 * Author: Gaurav Sachdeva
 * Date: 09/07/25
 */
public class NearlySortedArraySearch {
    public static void main(String[] args) {
        int[] arr = {10, 3, 40, 20, 50, 80, 70};
        int target = 40;

        int index = findElement(arr, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
    public static int findElement(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
             if(target == arr[mid + 2]){
                return mid+1;
            }
            if(target == arr[mid-2]){
                return mid-1;
            }
            if(arr[mid]<target){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}