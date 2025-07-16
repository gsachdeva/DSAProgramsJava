package com.dsa.sorting;

/**
 * Author: Gaurav Sachdeva
 * Date: 28/06/25
 */
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        int[] arr = {-1,0,3,5,8,9,12};
        int target =0;

        int result = checkTargetIndexUsingBinarySearch(arr,target);
        System.out.print("Target Index is "+ result);
    }
    public static int checkTargetIndexUsingBinarySearch(int[] arr,int target){
        int startIndex=0;
        int endIndex = arr.length-1;
        while(startIndex<=endIndex){
            // Find the mid of the array
            int midIndex= startIndex + (endIndex-startIndex)/2;
            //Check if target is equals to midIndex
            if(target == arr[midIndex]){
                return midIndex;
            }else if(target > midIndex){
                startIndex = midIndex + 1;
            }
            else{
                endIndex = midIndex -1;
            }
        }
       return -1;
    }
}