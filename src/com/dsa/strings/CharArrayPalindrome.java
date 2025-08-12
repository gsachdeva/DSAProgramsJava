package com.dsa.strings;

/**
 * Author: Gaurav Sachdeva
 * Date: 16/07/25
 */
public class CharArrayPalindrome {
    public static void main(String[] args) {
        char[] arr = {'m','a','d','a','m'};
        boolean isPalindrome = true;

        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            if(arr[start] != arr[end]){
                isPalindrome=false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println("Palindrome ✅");
        } else {
            System.out.println("Not a palindrome ❌");
        }
    }
}