package com.dsa.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        int[] arr ={16,90,340,70,60,50,80,90};
        int size=arr.length;
     //   printReverseOfArray(arr,size);
        printReverseOfArrayUsingSameArray(arr,size);
    }
    public static void printReverseOfArray(int[] arr,int size){
        //First iterate through the array
        int j=size-1;
        int[] temp=new int[size];
        for(int i=0;i<=size-1;i++){
            temp[j]=arr[i];
            j--;
        }
        System.out.print("Array After Reversing is "+ Arrays.toString(temp));
    }
    public static void printReverseOfArrayUsingSameArray(int[] arr,int size){
        int j=size-1;
        int i=0;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.print("Array After Reversing is "+ Arrays.toString(arr));

    }
}