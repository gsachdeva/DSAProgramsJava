package com.dsa.strings;

/**
 * Author: Gaurav Sachdeva
 * Date: 16/07/25
 */
public class ReplaceSpaceCharArray {
    public static void main(String[] args) {
        String str="My Name is Gaurav";
        char[] arr= str.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                arr[i]='X';
            }
        }
        System.out.print("Modified: ");
        for (char c : arr) {
            System.out.print(c);
        }
    }
}