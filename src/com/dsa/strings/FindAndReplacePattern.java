package com.dsa.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Gaurav Sachdeva
 * Date: 22/07/25
 */
public class FindAndReplacePattern {
    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";

        List<String> sol=findAndReplacePattern(words,pattern);
        System.out.print("Final Array "+sol);
    }
    public static List<String> findAndReplacePattern(String[] words,String pattern){
        String patternCode=normalize(pattern);

        List<String> listFinalArray=new ArrayList<>();

        for(String str:words){
            if(patternCode.equals(normalize(str))){
                listFinalArray.add(str);
            }
        }
        return listFinalArray;
    }
    public static String normalize(String word){
        Map<Character,Integer> map=new HashMap<>();
        int id=0;

        StringBuilder code=new StringBuilder();
        for(char c:word.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,id++);
            }
            code.append(map.get(c)).append(",");
        }
        return code.toString();
    }
}