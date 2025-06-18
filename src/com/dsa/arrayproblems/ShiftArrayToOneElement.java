package com.dsa.arrayproblems;

public class ShiftArrayToOneElement {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int size=arr.length;
        printNewArrayAfterShift(arr,size);
        }
        public static void printNewArrayAfterShift(int[] arr,int size)
        {
            int lastElement=arr[size-1];
            int secondLastElement=arr[size-2];
            int thirdLastElement=arr[size-3];
            for(int i=size-1;i>=0;i--){
                if(i>3){
                    arr[i]=arr[i-3];
                }else{
                    arr[i-2]=secondLastElement;
                    arr[i-3]=thirdLastElement;
                    arr[i]=lastElement;
                }
            }
        }
}