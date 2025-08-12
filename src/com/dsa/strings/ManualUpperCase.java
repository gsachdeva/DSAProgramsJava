package com.dsa.strings;

/**
 * Author: Gaurav Sachdeva
 * Date: 16/07/25
 */
public class ManualUpperCase {
    public static void main(String[] args) {
        String str="my name is gaurav";
        char[] arr= str.toCharArray();

        for(int i=0;i<arr.length;i++){
            arr[i]= (char)(arr[i] - 'a' + 'A');
        }
        System.out.println("Uppercase: " + new String(arr));

    }

}