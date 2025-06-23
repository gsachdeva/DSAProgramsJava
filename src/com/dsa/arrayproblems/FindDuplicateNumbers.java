package com.dsa.arrayproblems;

import java.util.Arrays;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 1};
        int duplicate = -1;

        Arrays.sort(nums); // Sort array first

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[j - 1]) {
                duplicate = nums[j];
                break;
            }
        }

        System.out.println("Duplicate number: " + duplicate);
    }
}
