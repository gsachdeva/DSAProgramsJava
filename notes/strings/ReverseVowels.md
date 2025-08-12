# Reverse Vowels in a String (C++)

## Problem Statement

Given a string, reverse only the vowels in the string and return the resulting string.

## Example

**Input:** "hello world"
**Output:** "holle werld"

## Approach

1. Use a two-pointer technique (`i` from the start, `j` from the end).
2. Move `i` forward until it points to a vowel.
3. Move `j` backward until it points to a vowel.
4. Swap the characters at `i` and `j`.
5. Repeat steps 2–4 until `i >= j`.

## Helper Function

Create a function `isVowel(char c)` that checks if a character is a vowel (either uppercase or lowercase).

## Time and Space Complexity

* **Time Complexity:** O(n), where n is the length of the string.
* **Space Complexity:** O(1) (in-place modification using char array).

## Notes

* This approach maintains the order of non-vowel characters.
* Works efficiently for long strings and is case-insensitive for vowels.
