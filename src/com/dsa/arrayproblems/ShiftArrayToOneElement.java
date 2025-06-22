package com.dsa.arrayproblems;

public class ShiftArrayToOneElement {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int size=arr.length;
        printNewArrayAfterShift(arr,size);
        }
        public static void printNewArrayAfterShift(int[] arr,int size)
        {
            int k = 3;

            int n = arr.length;
            k = k % n;

            // Temporary array to hold last k elements
            int[] temp = new int[k];
            for (int i = 0; i < k; i++) {
                temp[i] = arr[n - k + i];
            }

            // Shift elements to the right
            for (int i = n - 1; i >= k; i--) {
                arr[i] = arr[i - k];
            }

            // Put temp elements in the beginning
            for (int i = 0; i < k; i++) {
                arr[i] = temp[i];
            }

            // Print rotated array
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
}