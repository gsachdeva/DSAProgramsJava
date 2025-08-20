# Sorting a Singly Linked List — A Practical Guide

**Author:** Gaurav Sachdeva  
**Last Updated:** August 19, 2025

---

## 1) What You’re Solving

Given the head of a singly linked list, reorder the nodes so that their values are in non‑decreasing order. The output must be the same list nodes re-linked correctly (no new array required).

---

## 2) Why Arrays Tricks Don’t Fit

- Linked lists do **not** provide random access. Index-based algorithms (like quickselect, heapsort on arrays) don’t map well.  
- Rearranging nodes is cheaper than swapping values when the node payload is large or complex.  
- The best-fit algorithm for linked lists is **Merge Sort**, because it only needs sequential access and stable merging.

---

## 3) Approaches at a Glance

- **Naïve (Bubble/Insertion on list):** Simple but **O(n²)** time; fine for very small lists only.  
- **Convert to Array, Sort, Rebuild:** **O(n log n)** time but **O(n)** extra memory; also breaks node identity in some contexts.  
- **Merge Sort on Linked List (Recommended):** **O(n log n)** time, **O(1)** extra list storage (ignoring recursion stack), stable, and pointer-friendly.

> If you must keep node objects intact and minimize extra memory, use merge sort directly on the list.

---

## 4) High-Level Merge Sort Plan (No Code)

1. **Base Case:** If the list is empty or has one node, it’s already sorted; return it.  
2. **Find Middle:** Use two pointers (slow and fast). When fast reaches the end, slow is near the middle.  
3. **Split:** Cut the list into two halves at the middle.  
4. **Recurse:** Sort the left half; sort the right half.  
5. **Merge:** Merge the two sorted halves into one sorted list by repeatedly picking the smaller head.  
6. **Return:** The head of the merged list is your answer.

---

## 5) Choosing the “Middle” Carefully

On even-length lists, decide which middle to return:
- **Left middle** is common to avoid zero-length left halves.  
- After finding the middle, **disconnect** (`middle.next = null`) before recursing, otherwise you risk cycles or infinite recursion.

**Rule of thumb:** When `fast.next` or `fast.next.next` is null (depending on your variant), stop and use `slow` as the splitter.

---

## 6) Merge Step Intuition

- Keep a **dummy start node** conceptually (a placeholder head) to build the merged list easily.  
- Compare the current nodes of the two halves and append the smaller one; advance that pointer.  
- When one half is exhausted, append the remainder of the other half.

**Why it’s stable:** If values are equal, pick from the left half first. This keeps the original relative order of equal elements.

---

## 7) Complexity

- **Time:** `O(n log n)` due to the divide (log n levels) and linear merges.  
- **Extra Space:** `O(1)` auxiliary list storage; recursion adds `O(log n)` stack depth.  
- **Stability:** Yes, if ties prefer the left half during merge.

---

## 8) Common Pitfalls (and How to Avoid Them)

- **Bug:** Sorting the left half **starting at the middle** instead of the original head after splitting.  
  - **Fix:** Left recursion starts at the original head; right recursion starts at `middle.next` (after you disconnect).

- **Forgetting to cut the list** before recursion.  
  - **Fix:** Set `middle.next` to null so the halves are truly separate.

- **Fast/slow loop off-by-one** leading to wrong splits on even lengths.  
  - **Fix:** Test on lists with lengths 0, 1, 2, 3, 4, 5 and verify where the split lands.

- **Losing nodes during merge** when you don’t store the next pointer before relinking.  
  - **Fix:** Always advance pointers carefully and keep references until relinking is complete.

- **Memory leaks in manual memory environments:** Not unlinking or mishandling nodes can lose access.  
  - **Fix:** Maintain a clear relinking order and test thoroughly.

---

## 9) Testing Checklist

Use these scenarios to validate correctness and robustness:

- **Empty list** → returns empty.  
- **Single node** → unchanged.  
- **Two nodes (sorted and unsorted)** → both cases correct.  
- **All equal values** → order preserved (stability).  
- **Already sorted** → unchanged sequence.  
- **Reverse sorted** → fully sorted ascending.  
- **Mixed positives/negatives/zeros** → properly ordered.  
- **Duplicates scattered** → duplicates grouped, relative order of equals preserved.  
- **Large list** → performance remains `O(n log n)`; no timeouts.

---

## 10) Variations You Might Need

- **Descending order:** Invert the comparison during merge or reverse at the end.  
- **Custom key / comparator:** Compare by key (e.g., `age`, `timestamp`), not raw value.  
- **Doubly linked list:** Same idea; merging can be slightly more convenient due to back pointers.  
- **K sorted lists:** Repeated pairwise merges or a min-heap for `O(n log k)` merging.  
- **Partial sort / top‑k:** Use selection strategies on streams; full sort may be unnecessary.

---

## 11) Debugging Tips

- Print or log the list **before** and **after** each split and merge step.  
- Verify that **every node** appears exactly once in the final list.  
- Check for **cycles** (e.g., using Floyd’s cycle detection) if traversals never end.  
- Add assertions for list length conservation: total nodes before == after.

---

## 12) When to Prefer Array Conversion

Choose “list → array → sort → rebuild” when:  
- You need built-in optimized sort and don’t care about node identity.  
- Extra `O(n)` memory is acceptable and code simplicity is a priority.  
- You’re under heavy time pressure and the list is not massive.

---

## 13) Quick Recap

- Use **merge sort** for singly linked lists.  
- **Find middle, split, recurse, merge**, and be mindful of the split and tie-breaking.  
- Validate with a strong test suite to catch pointer mistakes early.

---

*This document intentionally contains no source code. It’s a conceptual and practical guide to help you implement and review a robust linked-list sort in your language of choice.*
