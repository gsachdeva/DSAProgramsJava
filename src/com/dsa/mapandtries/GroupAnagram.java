package com.dsa.mapandtries;

/**
 * Author: Gaurav Sachdeva
 * Date: 16/09/25
 */
import java.util.*;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Sort the word -> use it as a key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // Put into map
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(words);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
