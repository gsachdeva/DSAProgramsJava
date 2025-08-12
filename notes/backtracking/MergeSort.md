# Merge Sort -- Approach and Dry Run

## Approach

Merge Sort is a **Divide and Conquer** algorithm. It works by repeatedly
dividing the array into two halves until each subarray contains a single
element, then merges the subarrays back together in sorted order.

### Steps:

1.  **Divide**: Split the array into two halves.
2.  **Conquer**: Recursively sort both halves.
3.  **Combine**: Merge the sorted halves into a single sorted array.

------------------------------------------------------------------------

## Example Dry Run

### Input:

`[38, 27, 43, 3, 9, 82, 10]`

### Step 1: Divide

-   Split into: `[38, 27, 43]` and `[3, 9, 82, 10]`

### Step 2: Further Divide

-   `[38, 27, 43]` → `[38]` and `[27, 43]`
-   `[3, 9, 82, 10]` → `[3, 9]` and `[82, 10]`

### Step 3: Sort smaller arrays

-   `[27, 43]` → merge → `[27, 43]`
-   `[3, 9]` → merge → `[3, 9]`
-   `[82, 10]` → merge → `[10, 82]`

### Step 4: Merge step-by-step

1.  Merge `[38]` and `[27, 43]` → `[27, 38, 43]`
2.  Merge `[3, 9]` and `[10, 82]` → `[3, 9, 10, 82]`
3.  Merge `[27, 38, 43]` and `[3, 9, 10, 82]` → **Final Sorted Array**:
    `[3, 9, 10, 27, 38, 43, 82]`

------------------------------------------------------------------------

## Time Complexity

-   **Best Case**: O(n log n)
-   **Average Case**: O(n log n)
-   **Worst Case**: O(n log n)

## Space Complexity

-   O(n) (requires additional temporary arrays during merge)
