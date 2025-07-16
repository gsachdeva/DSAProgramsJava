package com.dsa.sorting;

public class FirstOccuranceBinarySearch {
    public static int firstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;        // Save potential answer
                right = mid - 1;     // Move left to find earlier occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        int target = 1;
        int index = firstOccurrence(arr, target);

        if (index != -1)
            System.out.println("First occurrence of " + target + " is at index " + index);
        else
            System.out.println("Element not found");
    }
}
