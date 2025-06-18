package com.dsa.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumWithTarget {

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, -1, 1, 4, 7, 2};
        int target = 22;

        // Get result of triplets that sum to target
        ArrayList<ArrayList<Integer>> result = sumOfThreeNumber(arr, target, arr.length);

        // Print the triplets
        System.out.println("Triplets that sum to " + target + ":");
        for (ArrayList<Integer> triplet : result) {
            System.out.println("[" + triplet.get(0) + ", " + triplet.get(1) + ", " + triplet.get(2) + "]");
        }
    }

    public static ArrayList<ArrayList<Integer>> sumOfThreeNumber(int arr[], int target, int size) {

        // Step 1: Sort the array to handle duplicates easily
        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        // Step 2: Loop through the array using 3 nested loops
        for (int i = 0; i < size - 2; i++) {

            // Skip duplicate elements for the first number
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            for (int j = i + 1; j < size - 1; j++) {

                // Skip duplicate elements for the second number
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                for (int k = j + 1; k < size; k++) {

                    // Skip duplicate elements for the third number
                    if (k > j + 1 && arr[k] == arr[k - 1]) continue;

                    // Calculate the sum of the triplet
                    int sum = arr[i] + arr[j] + arr[k];

                    // If the sum matches the target, add it to the result
                    if (sum == target) {
                        ArrayList<Integer> triplet = new ArrayList<>();
                        triplet.add(arr[i]);
                        triplet.add(arr[j]);
                        triplet.add(arr[k]);
                        result.add(triplet);
                    }
                }
            }
        }

        // Return the list of unique triplets that sum to the target
        return result;
    }
}
