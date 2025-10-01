package com.dsa.DP.HouseRobber;

import java.util.Arrays;

/**
 * Author: Gaurav Sachdeva
 * Date: 19/09/25
 */
public class HouseRobberProblem {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        int n = nums.length;

        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        int maxLoot = solveUsingMem(nums, 0, dp);
        System.out.println("Maximum money the robber can loot: " + maxLoot);
    }

    public static int solveUsingMem(int[] nums,int index, int[] dp){
        //Base case
        if(index>=nums.length){
            return 0;
        }

        if(dp[index]!= -1){
            return dp[index];
        }
        int include = nums[index]+ solveUsingMem(nums, index+2,dp);
        int exclude = solveUsingMem(nums,index + 1,dp);

        dp[index] = Math.max(include,exclude);
        return dp[index];


    }
}