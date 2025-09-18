package com.dsa.mapandtries;

/**
 * Author: Gaurav Sachdeva
 * Date: 18/09/25
 */
import java.util.*;

class TrieNodeSuggestion {
    TrieNodeSuggestion[] children = new TrieNodeSuggestion[26];
    List<String> suggestions = new ArrayList<>();
}

class TrieSuggestion {
    private TrieNodeSuggestion root = new TrieNodeSuggestion();

    // Insert product into trie
    public void insert(String product) {
        TrieNodeSuggestion node = root;
        for (char c : product.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNodeSuggestion();
            }
            node = node.children[idx];

            // store suggestion (keep sorted and max 3)
            if (node.suggestions.size() < 3) {
                node.suggestions.add(product);
                Collections.sort(node.suggestions);
            } else {
                node.suggestions.add(product);
                Collections.sort(node.suggestions);
                node.suggestions.remove(node.suggestions.size() - 1); // keep top 3
            }
        }
    }

    // Get suggestions for a prefix
    public List<List<String>> getSuggestions(String searchWord) {
        List<List<String>> result = new ArrayList<>();
        TrieNodeSuggestion node = root;

        for (char c : searchWord.toCharArray()) {
            if (node != null) {
                node = node.children[c - 'a'];
            }
            if (node == null) {
                result.add(new ArrayList<>()); // no matches
            } else {
                result.add(new ArrayList<>(node.suggestions));
            }
        }
        return result;
    }
}

 class StoreSuggestionTrie {
    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products); // ensure lexicographic order
        TrieSuggestion trie = new TrieSuggestion();

        for (String product : products) {
            trie.insert(product);
        }
        return trie.getSuggestions(searchWord);
    }

    public static void main(String[] args) {
        String[] products = {"mobile","mouse","moneypot","monitor","mousepad"};
        String searchWord = "mouse";

        List<List<String>> result = suggestedProducts(products, searchWord);
        System.out.println(result);
    }
}
