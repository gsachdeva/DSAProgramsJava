# 🧮 Problem: Sum of Each Column in a 2D Matrix

🗓️ Date: 22 June 2025  
📁 Topic: 2D Arrays  
🗂️ File: `src/matrix/SumOfColumns.java`  
💡 Confidence: 5/5  
📌 Difficulty: Easy  
⏱️ Time Taken: 10 mins

---

## 🧠 Problem Statement:

Given a 2D matrix, calculate and return the **sum of each column** as an array.

---

## ✅ Approach:

- Determine number of columns using `matrix[0].length`
- Initialize a result array of size equal to number of columns
- Loop over each column:
    - For each column, initialize a sum variable
    - Loop through each row and add `matrix[row][col]` to the sum
    - Store the result in the column's index in result array

---

## 🧠 Learnings:

- Practiced column-wise traversal using nested loops
- Understood matrix access patterns: `matrix[row][col]`
- Reinforced basic iteration logic for column accumulation

---

## 🔗 Related Problems:

- Row Sum
- Matrix Transpose
- Diagonal Sum
- Spiral Matrix
