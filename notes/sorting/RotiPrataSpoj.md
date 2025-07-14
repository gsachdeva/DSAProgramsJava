# 🍞 Roti Prata Problem – Binary Search on Answer (Java + Dry Run + Explanation)

## ✅ Problem Statement

You are given:

* `P` pratas to be cooked
* `C` cooks, each with a cooking rank `R`

A cook with rank `r` takes:

* `r` minutes for the 1st prata,
* `2r` for the 2nd,
* `3r` for the 3rd, and so on.

Time to cook `k` pratas by one cook of rank `r`:

```
T = r * (1 + 2 + 3 + ... + k) = r * (k * (k + 1)) / 2
```

## 🎯 Objective

Find the **minimum time** to cook all `P` pratas using the given cooks.

---

```java

```

---

## 📊 Dry Run for `midTime = 12`

Ranks: `{1, 2, 3, 4}` | Pratas needed = 10

| Cook | Rank | Prata# | Time for Prata | Cumulative Time | Pratas Made |
| ---- | ---- | ------ | -------------- | --------------- | ----------- |
| 1    | 1    | 1      | 1              | 1               | 1           |
|      |      | 2      | 2              | 3               | 2           |
|      |      | 3      | 3              | 6               | 3           |
|      |      | 4      | 4              | 10              | 4           |
| 2    | 2    | 1      | 2              | 2               | 5           |
|      |      | 2      | 4              | 6               | 6           |
|      |      | 3      | 6              | 12              | 7           |
| 3    | 3    | 1      | 3              | 3               | 8           |
|      |      | 2      | 6              | 9               | 9           |
| 4    | 4    | 1      | 4              | 4               | 10 ✅        |

**Total pratas made = 10 → Possible in 12 mins ✅**

---

## ✅ Logic Behind `isPossible()`

1. For each cook:

    * Try cooking 1st prata, 2nd, ..., until time runs out
    * For each prata `k`, time taken = `r * k`
    * Keep a running total of time used
2. Stop if total time > `midTime`
3. If total pratas made across all cooks ≥ `P`, return `true`

---

## 🧠 Binary Search on Answer

* **Search Space**: From 0 to max time (e.g. 10^7)
* If it’s **possible** to cook in `mid` time → try smaller (`high = mid - 1`)
* Else → try larger (`low = mid + 1`)
* Return minimum time found

---

## 🔥 Practice Next

* ✅ Aggressive Cows
* ✅ Book Allocation
* ✅ Painter Partition Problem
* ✅ Allocate Minimum Number of Pages

---

You're now ready to crack **Binary Search on Answer** problems like a pro 💪
