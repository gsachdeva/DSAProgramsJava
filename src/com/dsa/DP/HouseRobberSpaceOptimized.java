package com.dsa.DP;

/**
 * Author: Gaurav Sachdeva
 * Date: 19/09/25
 */
public class HouseRobberSpaceOptimized {

    public static int rob(int[] nums){
        int n = nums.length;

        int next1 = 0; // dp[i+1]
        int next2 = 0; // dp[i+2]

        for (int i = n - 1; i >= 0; i--) {
            int include = nums[i] + next2;
            int exclude = next1;
            int curr = Math.max(include, exclude);

            // shift window
            next2 = next1;
            next1 = curr;
        }
        return next1; // dp[0]
        }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println("Maximum money the robber can loot: " + rob(nums));
    }
}