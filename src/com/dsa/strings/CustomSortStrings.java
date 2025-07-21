package com.dsa.strings;

import java.util.*;

/**
 * Author: Gaurav Sachdeva
 * Date: 21/07/25
 */
public class CustomSortStrings {
    public static void main(String[] args) {
        String order = "cba";
        String s = "abcd";
        String str= customSortString(order,s);
        System.out.print("String "+str);
    }
    public static String customSortString(String order, String s) {

                Map<Character,Integer> map = new HashMap<>();
                for(int i=0;i<order.length();i++){
                    map.put(order.charAt(i),i);
                }
                Character[] chars = new Character[s.length()];
                for(int i=0;i<s.length();i++){
                    chars[i]=s.charAt(i);
                }
                Arrays.sort(chars, (a, b) -> {
                    int indexA = map.getOrDefault(a, Integer.MAX_VALUE);
                    int indexB = map.getOrDefault(b, Integer.MAX_VALUE);
                    return Integer.compare(indexA, indexB);
                });

                StringBuilder strBuilder = new StringBuilder();
                for(char ch: chars){
                    strBuilder.append(ch);

                }
                return strBuilder.toString();
    }
}