package com.dsa.arrayproblems;

import java.util.Arrays;

public class ModeOfTheArray {
    public static void main(String[] args){
        int[] arr={-1,-1,-2,-2,3};

        Arrays.sort(arr);
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        int maxFreq=1;
        int cf=1;
        int mode=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                cf++;
            }else{
                cf=1;
            }
            if(cf>maxFreq){
                maxFreq=cf;
                mode=arr[i];
            }
        }
        System.out.print("Mode is "+mode);
    }
}
