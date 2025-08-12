package com.dsa.strings;

/**
 * Author: Gaurav Sachdeva
 * Date: 25/07/25
 */
public class ReverseVowels {
    public static void main(String[] args) {
        String str="hello";
        String reverse= reverseVowels(str);
        System.out.print("String is "+reverse);

    }
    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while (i < j) {
            while (i < j && !isVowel(chars[i])) i++;
            while (i < j && !isVowel(chars[j])) j--;

            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            i++;
            j--;
        }

        return new String(chars);
    }
}