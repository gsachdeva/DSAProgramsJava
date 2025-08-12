package com.dsa.recursion;

/**
 * Author: Gaurav Sachdeva
 * Date: 29/07/25
 */
public class LastIndexOfString {

    public static int lastIndex(String str, char x) {
        return findLastIndex(str, x, str.length() - 1);
    }

    private static int findLastIndex(String str, char x, int index) {
        if (index < 0) {
            return -1; // Character not found
        }
        if (str.charAt(index) == x) {
            return index;
        }
        return findLastIndex(str, x, index - 1);
    }

    public static void main(String[] args) {
        String str = "abcdeabc";
        char target = 'b';
        int result = lastIndex(str, target);

        System.out.println("Last index of '" + target + "' is: " + result);
    }
}
