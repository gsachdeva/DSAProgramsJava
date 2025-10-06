package com.dsa.DP.PaintFenceProblem;

/**
 * Author: Gaurav Sachdeva
 * Date: 27/09/25
 */
public class PaintFenceCount {

    // Recursive function to count ways to paint the fence
    public static long countWays(int n, int k) {
        // Base cases
        if (n == 1) return k;           // Only one post → k ways
        if (n == 2) return (long) k * k; // Two posts → k*k ways

        // Recursive relation:
        // Ways to paint nth post = (ways for n-1 posts + ways for n-2 posts) * (k-1)
        return (countWays(n - 1, k) + countWays(n - 2, k)) * (k - 1);
    }

    // Driver function
    public static void main(String[] args) {
        int n1 = 3, k1 = 2;
        System.out.println("Number of ways to paint " + n1 + " posts with " + k1 + " colors: " + countWays(n1, k1)); // 6

        int n2 = 4, k2 = 3;
        System.out.println("Number of ways to paint " + n2 + " posts with " + k2 + " colors: " + countWays(n2, k2)); // 66

        int n3 = 5, k3 = 2;
        System.out.println("Number of ways to paint " + n3 + " posts with " + k3 + " colors: " + countWays(n3, k3)); // 16
    }
}

