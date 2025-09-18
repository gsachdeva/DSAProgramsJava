package com.dsa.mapandtries;

/**
 * Author: Gaurav Sachdeva
 * Date: 18/09/25
 */
class TrieNodePrefix {
    TrieNodePrefix[] children = new TrieNodePrefix[26];
    boolean isEndOfWord = false;
    int childCount = 0;
}

class Trie {
    TrieNodePrefix root;

    public Trie() {
        root = new TrieNodePrefix();
    }

    // Insert word into Trie
    public void insert(String word) {
        TrieNodePrefix node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNodePrefix();
                node.childCount++;
            }
            node = node.children[idx];
        }
        node.isEndOfWord = true;
    }

    // Recursive LCP finder
    private String dfs(TrieNodePrefix node, String prefix) {
        // base condition: stop if node is null, word ends, or multiple children
        if (node == null || node.isEndOfWord || node.childCount != 1) {
            return prefix;
        }

        // continue to the only child
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                char nextChar = (char) ('a' + i);
                return dfs(node.children[i], prefix + nextChar);
            }
        }
        return prefix; // fallback
    }

    public String longestCommonPrefix() {
        return dfs(root, "");
    }
}

 class LongestCommonPrefixTrie {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        Trie trie = new Trie();
        for (String word : strs) {
            trie.insert(word);
        }
        return trie.longestCommonPrefix();
    }

    public static void main(String[] args) {
        String[] words1 = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(words1)); // fl

        String[] words2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(words2)); // ""
    }
}
