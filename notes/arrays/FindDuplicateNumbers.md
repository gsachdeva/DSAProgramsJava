# 🧮 Problem: Find the duplicate numbers in an array

🗓️ Date: 22 June 2025  
📁 Topic:  Arrays  
🗂️ File: `src/matrix/FindDuplicateNumbers.java`  
💡 Confidence: 4/5  
📌 Difficulty: Medium  
⏱️ Time Taken: 25 mins

## 🧠 Problem Statement:
Find the Duplicate Number
You are given an array nums of n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number, return this duplicate number.

The duplicate can appear more than once.



## ✅ Approach: Sorting + Linear Scan

Step 1: Sort the array using Arrays.sort()

Step 2: Loop through from index 1 to n

Step 3: If nums[i] == nums[i - 1], you've found the duplicate

Step 4: Return the value and break the loop

