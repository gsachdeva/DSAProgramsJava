# First Non-Repeating Character in a Stream

## Problem Statement
Given a stream of characters, find the first non-repeating character at each point in the stream.  
If there is no non-repeating character, return `#`.

### Example
**Input:** `aabc`  
**Output:** `a#bb`  

Explanation:
- Stream: `"a"` → first non-repeating is `a`  
- Stream: `"aa"` → no non-repeating → `#`  
- Stream: `"aab"` → first non-repeating is `b`  
- Stream: `"aabc"` → first non-repeating is `b` (since `c` also appears but `b` appeared earlier and is still unique).  

---

## Approach (Using Queue + Map)
1. Use a **Queue** to store characters in the order they appear.  
2. Use a **HashMap** (frequency map) to count occurrences of each character.  
3. For each new character in the stream:
   - Increment its frequency in the map.
   - Add it to the queue.
   - While the front of the queue has frequency > 1, remove it (because it’s repeating).
   - The front of the queue is the first non-repeating character.
   - If queue is empty, return `#`.

---

## Dry Run Example

**Input:** `aabacdc`

Steps:
- `a` → queue: [a], map: {a:1} → first non-repeating = `a`
- `a` → queue: [a,a], map: {a:2} → front removed → no non-repeating → `#`
- `b` → queue: [b], map: {a:2, b:1} → first non-repeating = `b`
- `a` → queue: [b,a], map: {a:3, b:1} → first non-repeating = `b`
- `c` → queue: [b,a,c], map: {a:3, b:1, c:1} → first non-repeating = `b`
- `d` → queue: [b,a,c,d], map: {a:3, b:1, c:1, d:1} → first non-repeating = `b`
- `c` → queue: [b,a,c,d,c], map: {a:3, b:1, c:2, d:1} → `c` removed, still `b` in front → first non-repeating = `b`

**Output:** `a#bbb b b` → final result = **`a#bbb`**

---

## Pseudocode

```pseudo
function FirstNonRepeating(stream):
    queue = new Queue()
    freq = new Map()
    result = ""

    for ch in stream:
        freq[ch] = freq.get(ch, 0) + 1
        queue.enqueue(ch)

        while not queue.isEmpty() and freq[queue.front()] > 1:
            queue.dequeue()

        if queue.isEmpty():
            result += "#"
        else:
            result += queue.front()

    return result
```

---

## Time & Space Complexity
- **Time Complexity:** O(N) (each character is enqueued and dequeued at most once).  
- **Space Complexity:** O(1) (since alphabet size is fixed, e.g., 26 for lowercase letters).  

---

## Practice Scenarios
1. Input: `aabc` → Output: `a#bb`
2. Input: `zzxy` → Output: `z#xx`
3. Input: `aabacdc` → Output: `a#bbb`
4. Input: `abcabc` → Output: `aaabc#`
