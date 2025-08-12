package com.dsa.sorting;

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 3, 1};
        int peakIndex = peakIndexInMountainArray(arr);
        System.out.println("Peak index: " + peakIndex);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
