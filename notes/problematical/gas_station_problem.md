# Gas Station Problem (LeetCode / Interview Version)

## Problem Statement

You are given: - `gas[i]`: gas available at station `i`. - `cost[i]`:
gas required to travel from station `i` to `i+1`.

Find the starting station index from which you can travel around all
stations circularly.\
If impossible, return `-1`.

------------------------------------------------------------------------

## Key Observations

1.  If total gas \< total cost → Impossible.

        if sum(gas) < sum(cost): return -1

2.  If total gas ≥ total cost → Always exactly **one solution**.

3.  Approach:

    -   Track `tank` (current gas in journey).
    -   Track `start` (candidate starting index).
    -   If `tank` becomes negative at index `i`, set `start = i + 1`,
        reset `tank = 0`.

------------------------------------------------------------------------

## Algorithm (O(n))

``` java
public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, tank = 0, start = 0;
        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            tank += diff;
            if (tank < 0) { // fail up to i
                start = i + 1;
                tank = 0;
            }
        }
        return total >= 0 ? start : -1;
    }
}
```

------------------------------------------------------------------------

## Step-by-Step Example

**Input**

    gas  = [1, 2, 3, 4, 5]
    cost = [3, 4, 5, 1, 2]

### Step 1 --- Total Check

-   Sum(gas) = 15, Sum(cost) = 15 → Possible.

### Step 2 --- One Pass

  i   gas\[i\]-cost\[i\]   tank   start   Action
  --- -------------------- ------ ------- --------
  0   -2                   -2     1       reset
  1   -2                   -2     2       reset
  2   -2                   -2     3       reset
  3   +3                   3      3       keep
  4   +3                   6      3       keep

Answer = **3**.

### Step 3 --- Verification Run

Start at station 3 with tank=0:

1.  Station 3: +4 → 4, drive cost 1 → 3\
2.  Station 4: +5 → 8, drive cost 2 → 6\
3.  Station 0: +1 → 7, drive cost 3 → 4\
4.  Station 1: +2 → 6, drive cost 4 → 2\
5.  Station 2: +3 → 5, drive cost 5 → 0

Back at station 3 with tank=0 → Success.

------------------------------------------------------------------------

## Final Answer

-   Start Index = **3**
-   Time: O(n), Space: O(1)

------------------------------------------------------------------------

## Edge Cases

-   gas = \[2,3,4\], cost = \[3,4,5\] → -1\
-   gas = \[5\], cost = \[4\] → 0
