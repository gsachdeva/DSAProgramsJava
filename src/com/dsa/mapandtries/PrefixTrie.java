package com.dsa.mapandtries;

/**
 * Author: Gaurav Sachdeva
 * Date: 17/09/25
 */
import java.util.HashMap;
import java.util.Map;

// Node class
class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isEndOfWord = false;
}

// Trie using recursion
public class PrefixTrie {
    private final TrieNode root;

    public PrefixTrie() {
        root = new TrieNode();
    }

    // Insert word recursively
    public void insert(String word) {
        insertRecursive(root, word, 0);
    }

    private void insertRecursive(TrieNode node, String word, int index) {
        if (index == word.length()) {
            node.isEndOfWord = true;
            return;
        }
        char c = word.charAt(index);
        node.children.putIfAbsent(c, new TrieNode());
        insertRecursive(node.children.get(c), word, index + 1);
    }

    // Search word recursively
    public boolean search(String word) {
        return searchRecursive(root, word, 0);
    }

    private boolean searchRecursive(TrieNode node, String word, int index) {
        if (node == null) return false;
        if (index == word.length()) return node.isEndOfWord;

        char c = word.charAt(index);
        return searchRecursive(node.children.get(c), word, index + 1);
    }

    // Check prefix recursively
    public boolean startsWith(String prefix) {
        return startsWithRecursive(root, prefix, 0);
    }

    private boolean startsWithRecursive(TrieNode node, String prefix, int index) {
        if (node == null) return false;
        if (index == prefix.length()) return true;

        char c = prefix.charAt(index);
        return startsWithRecursive(node.children.get(c), prefix, index + 1);
    }

    // Delete word recursively
    public void delete(String word) {
        deleteRecursive(root, word, 0);
    }

    private boolean deleteRecursive(TrieNode node, String word, int index) {
        if (node == null) return false;

        if (index == word.length()) {
            if (!node.isEndOfWord) return false;
            node.isEndOfWord = false;
            return node.children.isEmpty();
        }

        char c = word.charAt(index);
        TrieNode child = node.children.get(c);
        if (child == null) return false;

        boolean shouldDeleteChild = deleteRecursive(child, word, index + 1);

        if (shouldDeleteChild) {
            node.children.remove(c);
            return node.children.isEmpty() && !node.isEndOfWord;
        }
        return false;
    }

    // Testing recursive Trie
    public static void main(String[] args) {
        PrefixTrie trie = new PrefixTrie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("bat");

        System.out.println(trie.search("apple"));   // true
        System.out.println(trie.search("app"));     // true
        System.out.println(trie.startsWith("ap"));  // true
        System.out.println(trie.search("bat"));     // true
        System.out.println(trie.search("bad"));     // false

        trie.delete("apple");
        System.out.println(trie.search("apple"));   // false
        System.out.println(trie.search("app"));     // true
    }
}
