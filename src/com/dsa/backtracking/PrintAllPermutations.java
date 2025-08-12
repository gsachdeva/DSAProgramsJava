package com.dsa.backtracking;

/**
 * Author: Gaurav Sachdeva
 * Date: 06/08/25
 */
public class PrintAllPermutations {
    public static void main(String[] args) {
       String str = "abc";
       int i =0;
       printAllPermutations(str.toCharArray(),i);
    }
    public static void printAllPermutations(char[] s, int i){
            if(i>=s.length){
                System.out.println(s);
                return;
            }
            for(int j=i;j<s.length;j++){
                swap(s,i,j);
                printAllPermutations(s, i + 1);
                swap(s, i, j);
            }
    }
    private static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}