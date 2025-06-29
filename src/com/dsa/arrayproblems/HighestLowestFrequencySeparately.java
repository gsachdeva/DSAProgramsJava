package com.dsa.arrayproblems;

import java.util.Arrays;

public class HighestLowestFrequencySeparately {
    public static void main(String[] args){
        int[] arr = {4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3};
        int maxFrequency = 1;
        int minFrequency = Integer.MAX_VALUE; // safest upper bound
        int count = 1;

        //Array is {1,1,2,2,2,3,3,3,3,4,4}
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]) {
                count++;
            }else{
                if (count > maxFrequency) {
                    maxFrequency = count;
                }
                if (count < minFrequency) {
                    minFrequency = count;
                }
                count=1;

            }
            if(count>maxFrequency){
                maxFrequency=count;
            }
            if (count < minFrequency) {
                minFrequency = count;
            }

        }
        System.out.println("Max Frequency "+maxFrequency);
        System.out.print("Min Frequency "+minFrequency);

    }
}
