# Reverse a Linked List in Java

Reversing a linked list is a very common interview question. It tests your understanding of pointers and recursion. There are two standard approaches:

---

## 1. Iterative Approach

- Use **three pointers**:
  - `prev` → keeps track of the previous node.  
  - `current` → keeps track of the current node.  
  - `next` → temporarily stores the next node.

- **Steps**:
  1. Start with `prev = null` and `current = head`.
  2. Store the next node in `next`.
  3. Reverse the current node’s pointer: `current.next = prev`.
  4. Move `prev` and `current` one step forward.
  5. Continue until `current` becomes `null`.
  6. Finally, `prev` will be the new head of the reversed list.

- **Time Complexity:** O(n)  
- **Space Complexity:** O(1)

---

## 2. Recursive Approach

- Use recursion to go till the end of the list, then **reverse the links while backtracking**.

- **Steps**:
  1. Base condition → if the list is empty or has one node, return it.
  2. Recursively reverse the rest of the list.
  3. Adjust the links:  
     - `node.next.next = node`  
     - `node.next = null`
  4. Return the new head from recursion.

- **Time Complexity:** O(n)  
- **Space Complexity:** O(n) (because of recursion mainStack)

---

## Comparison

| Approach   | Time Complexity | Space Complexity | Use Case |
|------------|----------------|------------------|----------|
| Iterative  | O(n)           | O(1)             | Preferred in practice |
| Recursive  | O(n)           | O(n)             | Asked in interviews to test recursion |
