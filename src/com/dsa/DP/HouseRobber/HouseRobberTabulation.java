package com.dsa.DP.HouseRobber;

import java.util.Arrays;

/**
 * Author: Gaurav Sachdeva
 * Date: 19/09/25
 */
public class HouseRobberTabulation {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1}; // Example input
        int maxLoot = rob(nums);
        System.out.println("Maximum money the robber can loot: " + maxLoot);
    }

    public static int rob(int[] nums){
        int n = nums.length;
        int[] dp = new int[n + 1]; // default initialized with 0
        Arrays.fill(dp, -1);

        dp[n] = 0; // Base case: no houses left to rob
        for (int i = n - 1; i >= 0; i--){
            int include = nums[i] + ((i + 2 <= n) ? dp[i + 2] : 0);
            int exclude = dp[i+1];
            dp[i] = Math.max(include,exclude);
        }
        return dp[0];
    }
}