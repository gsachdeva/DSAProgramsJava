package com.dsa.strings;

/**
 * Author: Gaurav Sachdeva
 * Date: 20/07/25
 */
public class PalindromeSubstring {
    public static void main(String[] args) {
        String input = "madamracecar";
        findPalindromicSubstrings(input);
    }
    public static void findPalindromicSubstrings(String input){
        int n= input.length();
        int count = 0;

        for(int i = 0;i<n;i++){
            expandFromCenter(input,i,i);
            expandFromCenter(input,i,i+1);
        }
    }
    public static void expandFromCenter(String s,int left,int right){
        while(left >=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            System.out.println(s.substring(left, right + 1));
            left --;
            right++;
        }

    }
}