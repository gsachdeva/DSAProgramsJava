# Isomorphic Strings

## Problem Statement

Given two strings `s` and `t`, determine if they are isomorphic. Two strings are isomorphic if characters in `s` can be 
replaced to get `t`, with the following conditions:

* Each character in `s` must map to exactly one character in `t`.
* Each character in `t` must map to exactly one character in `s`.
* The order of characters must be preserved.

## Examples

* **Input:** `s = "egg"`, `t = "add"`
  **Output:** `true`

* **Input:** `s = "foo"`, `t = "bar"`
  **Output:** `false`

* **Input:** `s = "paper"`, `t = "title"`
  **Output:** `true`

## Approach

1. Check if the lengths of both strings are equal.
2. Use two hash maps (or dictionaries):

    * One for mapping characters from `s` to `t`.
    * One for mapping characters from `t` to `s`.
3. Iterate over the characters of both strings simultaneously:

    * If a character is already mapped, verify that the mapping is consistent.
    * If not mapped, add the new mapping.
4. If any inconsistency is found, return false.
5. If all characters map correctly, return true.

## Time and Space Complexity

* **Time Complexity:** O(n), where n is the length of the strings.
* **Space Complexity:** O(n), for storing mappings in hash maps.

## Notes

* Case-sensitive comparisons are assumed unless stated otherwise.
* Useful in problems involving pattern matching and string transformations.
