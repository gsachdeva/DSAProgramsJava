# 🔄 Problem: Transpose of a Matrix

🗓️ Date: 22 June 2025  
📁 Topic: 2D Arrays  
💡 Confidence: 5/5  
📌 Difficulty: Easy  
🗂️ File: `src/matrix/TransposeMatrix.java`
⏱️ Time Taken: 20 mins


---

## 🧠 Problem Statement:

Given an `n x m` 2D matrix, return its transpose.

> The transpose flips the matrix over its diagonal, turning rows into columns and columns into rows.

---

## ✅ Approach:

- Get the number of rows and columns: `rowSize = matrix.length`, `colSize = matrix[0].length`
- Create a new matrix of size `[colSize][rowSize]`
- Traverse the original matrix:
    - For each element at `(row, col)`, assign it to `(col, row)` in the new matrix
- Return the transposed matrix

---

## 🧠 Learnings:

- Transpose works for both square and non-square matrices
- Good foundation for rotation and diagonal matrix problems
- Avoids extra space when flipping over diagonals

---

## 🔗 Related Concepts:

- Matrix rotation
- Spiral traversal
- Diagonal difference
