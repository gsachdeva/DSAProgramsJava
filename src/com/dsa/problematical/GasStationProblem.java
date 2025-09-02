package com.dsa.problematical;

/**
 * Author: Gaurav Sachdeva
 * Date: 02/09/25
 */
public class GasStationProblem {
    public static void main(String[] args) {
        int[] gas = { 1, 2, 3, 4, 5 };
        int[] cost = { 3, 4, 5, 1, 2 };
        System.out.println(startStation(gas, cost));
    }
    static int startStation(int[] gas, int[] cost){
        // Variables to track total and current remaining gas
        int n = gas.length;
        int totalGas = 0;
        int currentGas=0;
        int startIndex = 0;

        // Traverse through each station to calculate remaining
        // gas in the tank, and total gas
        for(int i=0;i<n;i++){
            currentGas += gas[i]-cost[i];
            totalGas += gas[i]-cost[i];

            // If currGas is negative, circular tour can't
            // start with this index, so update it to next one
            if(currentGas<1){
                currentGas =0;
                startIndex = i+1;
            }

        }
        // No solution exists
        if (totalGas < 0)
            return -1;
        return startIndex;
    }
}