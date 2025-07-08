package com.dsa.sorting;

public class LastOccuranceBinarySearch {
    public static int lastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;        // Save potential answer
                left = mid + 1;     // Move left to find earlier occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 5, 6};
        int target = 4;
        int index = lastOccurrence(arr, target);

        if (index != -1)
            System.out.println("Last occurrence of " + target + " is at index " + index);
        else
            System.out.println("Element not found");
    }
}
