package com.dsa.recursion;

/**
 * Author: Gaurav Sachdeva
 * Date: 29/07/25
 */
public class ReverseString {
    public static void main(String[] args) {
        String[] strArray = {"h", "e", "l", "l", "o"};
        int size = strArray.length;

        String[] revArray = reverseArray(0, size - 1, strArray, size);
        for (String s : revArray) {
            System.out.print(s + " ");
        }

    }
    public static String[] reverseArray(int firstIndex,int lastIndex,String[] arr,int size){
        if(firstIndex >= lastIndex){
            return arr;
        }
            String temp = arr[firstIndex];
            arr[firstIndex] = arr[lastIndex];
            arr[lastIndex] = temp;

          return reverseArray(firstIndex+1,lastIndex-1,arr,size);
    }
}