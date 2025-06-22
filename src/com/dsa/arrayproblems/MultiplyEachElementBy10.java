package com.dsa.arrayproblems;

public class MultiplyEachElementBy10 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*10;
        }
        for(int i:arr){
            System.out.println("Array elements are "+i);
        }
    }
}