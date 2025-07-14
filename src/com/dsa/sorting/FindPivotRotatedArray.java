package com.dsa.sorting;

/**
 * Author: Gaurav Sachdeva
 * Date: 09/07/25
 */
public class FindPivotRotatedArray {
    public static int findPivotIndex(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;  // pivot index
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Pivot index: " + findPivotIndex(arr)); // Output: 4
    }
}