package com.dsa.strings;

/**
 * Author: Gaurav Sachdeva
 * Date: 16/07/25
 */
public class ReverseCharArray {
    public static void main(String[] args) {
        char[] arr = {'G','a','u','r','a','v',' ','S','a','c','h','d','e','v','a'};
        int start= 0;
        int end = arr.length-1;

        while(start<end){
            char temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;

            start++;
            end--;
        }
        System.out.print("Reversed array: ");
        for (char c : arr) {
            System.out.print(c);
        }
    }
}