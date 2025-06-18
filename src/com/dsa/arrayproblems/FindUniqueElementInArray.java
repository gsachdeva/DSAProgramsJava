package com.dsa.arrayproblems;

import java.util.Arrays;

public class FindUniqueElementInArray {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        int[] arr={2,3,5,4,5,3,4};
      //  printUniqueElements(arr,arr.length);
        printUniqueElementEfficient(arr,arr.length);
    }
    //Time complexity of this function is O(n)2..we will find any other solution
    public static void printUniqueElements(int[] arr,int size){
        int temp=0;
        for(int i=0;i<size-1;i++){
            int count=0;
            for(int j=size-1;j>=i;j--){
                    if(i!=j){
                        if(arr[i]==arr[j]) {
                            count++;
                        }
                    }
                }
            if(count==0){
                temp=arr[i];
                System.out.println("Unique Number is "+temp);
            }
            }
        }
        public static int printUniqueElementEfficient(int[] arr,int size){
            int num=size-1;
            int ans=0;
            for(int i=0;i<=num;i++){
                ans=ans^arr[i];
            }
            System.out.print("Unique Number "+ans);
            return ans;
        }
}