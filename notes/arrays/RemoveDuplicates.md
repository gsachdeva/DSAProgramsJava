# 🔹 Problem: Remove Duplicates from Sorted Array

🗓️ Date: 22 June 2025  
📁 Topic: Arrays  
💻 File: `src/arrays/RemoveDuplicates.java`  
⏱️ Time Taken: 20 mins  
💡 Confidence: 4/5  
📌 Difficulty: Easy

---

## 🧠 Problem Statement:
Given an integer array `nums` sorted in non-decreasing order, remove the duplicates **in-place** such that each unique element appears only once. The relative order of the elements should be kept the same.

Return the number of unique elements. The first `k` elements of `nums` should hold the result.

---

## 🧩 Approach:
- Use **two-pointer** technique.
- Pointer `i` tracks the last unique index.
- Pointer `j` traverses from start to end.
- When `nums[j] != nums[i]`, we increment `i` and update `nums[i] = nums[j]`.

---

## ✅ Java Code:
```java
public int removeDuplicates(int[] nums) {
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
}
