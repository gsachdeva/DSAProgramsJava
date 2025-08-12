package com.dsa.recursion;

/**
 * Author: Gaurav Sachdeva
 * Date: 28/07/25
 */
public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int size = 5;
        int index = 0;
        printArray(arr,size,index);
    }
    public static void printArray(int[] arr,int size,int index){
        if(index>=size){
            return ;
        }
        System.out.println(" Array is "+arr[index]);
        printArray(arr,size,index+1);
    }
}