package com.dsa.backtracking;

/**
 * Author: Gaurav Sachdeva
 * Date: 04/08/25
 */
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7};
        int[] arr2 = {2, 3, 6, 9};

        int[] merged = mergeSorted(arr1, arr2);

        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
    public static int[] mergeSorted(int[] arr1,int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                result[k++] = arr1[i++];
            }else{
                result[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        return result;
    }

}