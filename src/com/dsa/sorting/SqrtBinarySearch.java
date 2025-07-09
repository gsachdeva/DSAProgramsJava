package com.dsa.sorting;

/**
 * Author: Gaurav Sachdeva
 * Date: 08/07/25
 */
public class SqrtBinarySearch {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        int x = 16;
        int sqrt = mySqrt(x);
        System.out.print("Sqrt "+sqrt);
    }
    public static int mySqrt(int x){
        int start = 0;
        int end = x;
        while(start<end){
            int mid = start + (end-start)/2;
            if(mid * mid == x){
                return mid;
            }
            else if(mid * mid > x){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return end;
    }
}