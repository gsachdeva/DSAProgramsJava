package com.dsa.arrayproblems;

public class SearchAnElement {
    public static void main(String[] args) {
        int[] arr= {4, 2, 7, 1, 9, 3};
        int target=7;
        int index=printIndexOfTargetValue(arr,target);
        System.out.print("Index "+index);
    }
    public static int printIndexOfTargetValue(int[] arr,int target){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                index=i;
            }
        }
        return index;
    }
}