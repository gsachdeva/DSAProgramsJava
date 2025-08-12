package com.dsa.recursion;

/**
 * Author: Gaurav Sachdeva
 * Date: 28/07/25
 */
public class MinimumElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int size = 5;
        int index = 0;
        int value = arr[index];
        int minValue= findMinElement(arr,size,index,value);
        System.out.print("Min Value is "+minValue);
    }
    public static int findMinElement(int[] arr,int size,int index,int value){
        if(index>=size){
            return value;
        }
        if(arr[index]<value){
            value = arr[index];

            System.out.println("Min Value "+value);
        }
        return findMinElement(arr,size,index+1,value);
    }
}