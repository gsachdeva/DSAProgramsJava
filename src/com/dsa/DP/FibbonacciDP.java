package com.dsa.DP;

import java.util.Arrays;

/**
 * Author: Gaurav Sachdeva
 * Date: 18/09/25
 */
public class FibbonacciDP {
    static int[] dp;
    public static void main(String[] args) {
        int n = 10;
        dp = new int[n+1];
        Arrays.fill(dp, -1);

        System.out.println("Fib(" + n + ") = " + fib(n));

    }

    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=fib(n-1) + fib(n-2);
        return dp[n];
    }
}