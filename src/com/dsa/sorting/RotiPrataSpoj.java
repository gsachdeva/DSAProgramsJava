package com.dsa.sorting;

/**
 * Author: Gaurav Sachdeva
 * Date: 14/07/25
 * V V V Important
 */
public class RotiPrataSpoj {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        int[] ranks = {1, 2, 3, 4};
        int pratas = 10;
        System.out.println("Minimum Time = " + minTime(ranks, pratas));
    }
    public static int minTime(int[] ranks,int pratas){
        int low = 0;
        int high = 10000000; //Safe upper limit
        int result=0;
        while(low<=high){
            int mid = low + (high-low)/2;
                if (isPossible(ranks, pratas, mid)) {
                    result = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

        }
        return result;
    }
    public static boolean isPossible(int[] ranks,int pratas,int mid){
        int totalPrataCooked = 0;
        for(int r : ranks){
            int timeSpent = 0;
            int prataNumber = 1;
            while(true){
                timeSpent += r * prataNumber;
                if(timeSpent>mid){
                    break;
                }
                totalPrataCooked++;
                prataNumber++;
                if(totalPrataCooked>=pratas){
                    return true;
                }
            }
        }
        return false;
    }
}