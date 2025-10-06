package com.dsa.DP.Fibbonacci;

/**
 * Author: Gaurav Sachdeva
 * Date: 18/09/25
 */
public class FibbonacciDPTabulation {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fib(" + n + ") = " + fib(n));
    }
    static int fib(int n){
        if(n == 0 || n==1){
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}