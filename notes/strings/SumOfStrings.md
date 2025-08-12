
# Explanation: Java Code for Adding String Digits Using Ternary Operator

## Code Snippet

```java
int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
```

## What It Means

This code uses Java's ternary operator to extract digits safely from the ends of two strings during addition.

### Detailed Explanation

#### 1. `num1.charAt(i) - '0'`
- Converts a character like `'7'` to its integer form `7`.
- `'7'` in ASCII is 55, `'0'` is 48 → `55 - 48 = 7`.

#### 2. Ternary Operator `(condition) ? value_if_true : value_if_false`
- If `i >= 0`, extract the digit from `num1` and convert it.
- If `i < 0` (i.e., index is out of bounds), return 0.

### Example

```java
num1 = "456";
i = 2 → num1.charAt(2) = '6' → digit1 = 6
i = -1 → digit1 = 0 (as index is out of bounds)
```

This helps perform addition on string-represented numbers from right to left, like manual addition.

## Summary

| Condition  | Result                    |
|------------|---------------------------|
| `i >= 0`   | Convert char to digit     |
| `i < 0`    | Use 0 for further addition|
