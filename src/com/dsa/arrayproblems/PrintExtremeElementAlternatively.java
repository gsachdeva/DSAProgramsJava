package com.dsa.arrayproblems;

public class PrintExtremeElementAlternatively {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int[] result = getExtremeElementsArray(arr);

        // Print result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] getExtremeElementsArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        int i = 0, j = n - 1;
        int index = 0;

        while (i <= j) {
            if (i == j) {
                result[index++] = arr[i];
            } else {
                result[index++] = arr[i];
                result[index++] = arr[j];
            }
            i++;
            j--;
        }
        return result;
    }
}
