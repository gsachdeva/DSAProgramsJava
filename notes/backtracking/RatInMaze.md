
# Rat in a Maze - Recursion & Backtracking (Approach + Dry Run)

## Problem Statement
You are given an `N x N` maze, where:
- `1` represents an open cell the rat can move to.
- `0` represents a blocked cell.
The rat starts at `(0,0)` and needs to reach `(N-1, N-1)`.

The rat can move **up, down, left, and right** (or sometimes only right and down depending on the problem variation).

The goal is to **print all possible paths** from the start to the destination.

---

## Approach

### 1. Recursion
Recursion is used to explore each possible path step-by-step.
- From the current cell, try all allowed directions (e.g., down, right, up, left).
- Move to the next cell only if:
  - It is inside the maze boundaries.
  - It is not blocked (`maze[x][y] == 1`).
  - It has not been visited in the current path.

### 2. Backtracking
Backtracking ensures that after exploring one path, we **undo the last move** to explore other possibilities.
- This is done by marking the current cell as **visited** when you enter it, and then marking it as **unvisited** before you return from that recursion call.

### 3. Steps
1. Start at `(0,0)`.
2. Mark the current cell as visited.
3. Recursively explore all valid moves (down, right, up, left).
4. If you reach `(N-1, N-1)`, record the current path.
5. Backtrack by marking the current cell as unvisited before returning.

---

## Dry Run Example

### Maze:
```
1 0 0 0
1 1 0 1
1 1 0 0
0 1 1 1
```

### Step-by-Step Execution
1. Start at `(0,0)` → mark visited.
2. Move **Down** to `(1,0)` → mark visited.
3. Move **Down** to `(2,0)` → mark visited.
4. Move **Right** to `(2,1)` → mark visited.
5. Move **Up** is blocked (visited or wall).
6. Move **Down** is blocked (wall).
7. Move **Right** is blocked (wall).
8. Backtrack from `(2,1)` to `(2,0)`.
9. Try **Right** from `(2,0)` again and so on...

---

## Key Notes
- Always check **bounds** to prevent invalid moves.
- Use a `visited[][]` matrix to avoid revisiting in the current path.
- Backtracking is essential for exploring multiple paths.

---

## Output (Paths Representation)
Paths can be represented as:
- Sequence of directions (e.g., `DDRDRR`).
- Sequence of coordinates visited.

---
