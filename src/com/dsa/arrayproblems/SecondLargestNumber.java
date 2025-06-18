package com.dsa.arrayproblems;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 38, 1 };
        int size=arr.length;
        System.out.println(getSecondLargest(arr,size));
    }
    public static String getSecondLargest(int[] arr,int size){
            int maxValue=Integer.MIN_VALUE;
            int secondLargest=Integer.MIN_VALUE;
            for(int i=0;i<=size-1;i++){
                if(arr[i]>maxValue){
                    maxValue=arr[i];
                }
             }

            for(int i=0;i<size-1;i++){
                if(maxValue==arr[i]){
                    continue;
                }else{
                    if(secondLargest<arr[i]){
                        secondLargest=arr[i];
                    }
                }
            }
            return secondLargest+"";
    }
}
