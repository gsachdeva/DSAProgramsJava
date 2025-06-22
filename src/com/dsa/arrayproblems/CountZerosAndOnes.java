package com.dsa.arrayproblems;

import java.util.Arrays;

public class CountZerosAndOnes {
    public static void main(String[] args) {
        int[] arr={0, 1, 0, 1, 1, 0, 1, 0};
        Arrays.sort(arr);
        int zeroCount=0;
        int oneCount=0;
        for (int j : arr) {
            if (j == 0) {
                zeroCount++;
            } else if (j == 1) {
                oneCount++;
            }
        }
        System.out.println("Zero Count "+zeroCount);
        System.out.print("One Count "+oneCount);

    }
}