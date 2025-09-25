package com.dsa.DP;

/**
 * Author: Gaurav Sachdeva
 * Date: 21/09/25
 */
import java.util.Arrays;

 class CoinChangeProblemDP {

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -2); // -2 means "not computed yet"
        return helper(coins, amount, dp);
    }

    private static int helper(int[] coins, int amount, int[] dp) {
        if (amount == 0) return 0;   // base case
        if (amount < 0) return -1;   // impossible

        if (dp[amount] != -2) return dp[amount]; // already computed

        int minCoins = Integer.MAX_VALUE;

        for (int coin : coins) {
            int res = helper(coins, amount - coin, dp); // solve subproblem
            if (res != -1) minCoins = Math.min(minCoins, 1 + res);
        }

        dp[amount] = (minCoins == Integer.MAX_VALUE) ? -1 : minCoins;
        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println("Minimum coins needed: " + coinChange(coins, amount));
    }
}
