package com.dsa.strings;

/**
 * Author: Gaurav Sachdeva
 * Date: 24/07/25
 */
public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "triangle";
        String s2 = "integral";
        boolean isAnagram= isAnagram(s1,s2);
        System.out.print("Is Anagram "+isAnagram);
    }
    public static boolean isAnagram(String s, String t){

        if(s.length()!=t.length()){
            return false;
        }
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int c:count){
            if(c!=0){
                return false;
            }
        }
    return true;
    }
}