package com.dsa.arrayproblems;

public class RotateArrayKSteps {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int size=arr.length;
        printNewArrayAfterShift(arr,size);
    }
    public static void printNewArrayAfterShift(int[] arr,int size)
    {
        int k=3;
        int lastVariable=arr[arr.length-1];
        for(int i=arr.length-1;i>=k;i--){
            arr[i]=arr[i-3];
        }
        int temp=0;
        while(k>=0){
            temp=lastVariable;
            arr[k -1]=temp;
            lastVariable=arr[arr.length-1];
            k--;
        }

    }
}