package com.dsa.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Gaurav Sachdeva
 * Date: 20/07/25
 */
public class CustomSortString {
    public static void main(String[] args) {
        String order = "bcafg";
        String s = "abcd";
        System.out.println(decodeMessage(order, s));
    }
    public static String decodeMessage(String order,String string){

        Map<Character,Character> map = new HashMap<>();
        char[] charArray = order.toCharArray();
        char[] charString = string.toCharArray();
        int length=0;

        if(charString.length<charArray.length){
            length=charString.length;
        }

        for(char i=0;i<length; i++){
            map.put(charArray[i],charString[i]);
        }
        System.out.print("Map"+map.toString());
        StringBuilder customString=new StringBuilder();
        for(char ch:string.toCharArray()){
           customString.append(map.get(ch));
        }
        return customString.toString();
    }
}