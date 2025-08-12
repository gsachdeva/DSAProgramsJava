package com.dsa.recursion;

/**
 * Author: Gaurav Sachdeva
 * Date: 28/07/25
 */
public class SearchInArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int target = 40;
        int size = arr.length;
        int value=searchArray(arr,target,size,0);
        System.out.print("Index is  "+value);

    }
    public static int searchArray(int[] arr,int target,int size,int index){
        if(index >= size){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return searchArray(arr,target,size,index+1);
    }
}