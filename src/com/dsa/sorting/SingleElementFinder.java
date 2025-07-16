package com.dsa.sorting;

/**
 * Author: Gaurav Sachdeva
 * Date: 16/07/25
 */
public class SingleElementFinder {
    public static int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 2;

        while (low <= high) {
            int mid = (low + high) / 2;
            // Check if the pair is starting correctly
            if (nums[mid] == nums[mid ^ 1]) {
                // Move right
                low = mid + 1;
            } else {
                // Move left
                high = mid - 1;
            }
        }

        return nums[low]; // Low will point to the single element
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println("Single non-duplicate element: " + singleNonDuplicate(nums));
    }
}
