package com.dsa.arrayproblems;

public class UnsortedElement {
    public static void main(String[] args) {

        Solution sol = new Solution();
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(sol.findFirstUnsortedIndex(arr1)); // -1

        int[] arr2 = {5, 4, 3, 2, 1};
        System.out.println(sol.findFirstUnsortedIndex(arr2)); // 0

        int[] arr3 = {1, 3, 2, 4, 5};
        System.out.println(sol.findFirstUnsortedIndex(arr3)); // 1
      //  printUnsortedElement(arr);
    }
    public static void printUnsortedElement(int[] arr){
        int difference=0;
        int cf=0;
        difference=arr[1]-arr[0];
        for(int i=1;i<arr.length-1;i++){
            cf=arr[i]-arr[i-1];
            if(cf!=difference)
            {
                System.out.print("Unsorted Element "+arr[i]);
                break;
            }
            else{
                System.out.print("Array is already sorted");
            }
        }
    }
    public static class Solution {
        public int findFirstUnsortedIndex(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    return i;
                }
            }
            return -1; // Already sorted
        }
    }

}