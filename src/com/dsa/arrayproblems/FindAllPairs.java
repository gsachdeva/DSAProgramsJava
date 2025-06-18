package com.dsa.arrayproblems;

public class FindAllPairs {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int size=arr.length;
        printAllPairs(arr,size);
    }
    public static void printAllPairs(int[] arr,int size){
        for(int i=0;i<=size-1;i++){
            for(int j=i+1;j<=size-1;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }

    }
}