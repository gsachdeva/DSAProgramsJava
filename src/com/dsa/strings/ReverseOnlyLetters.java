package com.dsa.strings;

/**
 * Author: Gaurav Sachdeva
 * Date: 24/07/25
 */
public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "ab-cd";
        String result = new String(reverseString(s));
        System.out.print("result "+result);
    }
    public static char[] reverseString(String str){
        int i = 0;
        int j= str.length()-1;
        char[] ch=str.toCharArray();
        while(i<j){
            if(!isLetter(ch[i])){
                i++;
                continue;
            }
            if(!isLetter(ch[j])){
                j--;
                continue;
            }
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }
        return ch;
    }
    public static boolean isLetter(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
}