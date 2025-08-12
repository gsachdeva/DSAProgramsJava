package com.dsa.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Gaurav Sachdeva
 * Date: 20/07/25
 */
public class DecodeMessage {
    public static void main(String[] args) {

            String key = "the quick brown fox jumps over the lazy dog";
            String message = "vkbs bs t suepuv";
            System.out.println(decodeMessage(key, message));  // Output: this is a secret

    }
    public static String decodeMessage(String key,String message){
        Map<Character, Character> map = new HashMap<>();
        char currentChar = 'a';

        for(char ch: key.toCharArray()){
            if (ch != ' ' && !map.containsKey(ch)) {
                map.put(ch, currentChar);
                currentChar++;
            }
        }
        StringBuilder stringBuilder= new StringBuilder();
        for(char ch:message.toCharArray()){
            if(ch == ' '){
                stringBuilder.append(' ');
            }else{
                stringBuilder.append(map.get(ch));
            }
        }
        return stringBuilder.toString();

    }
}