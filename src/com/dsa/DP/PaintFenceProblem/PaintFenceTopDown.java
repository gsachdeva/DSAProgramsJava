package com.dsa.DP.PaintFenceProblem;

/**
 * Author: Gaurav Sachdeva
 * Date: 27/09/25
 */
import java.util.*;

public class PaintFenceTopDown {

    // Memoization array
    private static long[] memo;

    // Top-down recursive function
    public static long countWaysTD(int n, int k) {
        memo = new long[n + 1];
        Arrays.fill(memo, -1); // initialize memo with -1
        return helper(n, k);
    }

    private static long helper(int n, int k) {
        // Base cases
        if (n == 1) return k;
        if (n == 2) return (long) k * k;

        // Check memo
        if (memo[n] != -1) return memo[n];

        // Recurrence
        memo[n] = (helper(n - 1, k) + helper(n - 2, k)) * (k - 1);
        return memo[n];
    }

    // Driver function
    public static void main(String[] args) {
        int n1 = 3, k1 = 2;
        System.out.println("Top-Down DP: Ways to paint " + n1 + " posts with " + k1 + " colors = " + countWaysTD(n1, k1)); // 6

        int n2 = 4, k2 = 3;
        System.out.println("Top-Down DP: Ways to paint " + n2 + " posts with " + k2 + " colors = " + countWaysTD(n2, k2)); // 66

        int n3 = 5, k3 = 2;
        System.out.println("Top-Down DP: Ways to paint " + n3 + " posts with " + k3 + " colors = " + countWaysTD(n3, k3)); // 16
    }
}
