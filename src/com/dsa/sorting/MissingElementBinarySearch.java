package com.dsa.sorting;

/**
 * Author: Gaurav Sachdeva
 * Date: 01/07/25
 */
public class MissingElementBinarySearch {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        int[] arr= {0,1,2,3,5,6,7};
        int result=missingElement(arr);
        System.out.println("Result "+result);

    }
    public static int missingElement(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]==mid){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
            return start;
        }
    }
