package com.dsa.arrayproblems;

public class SumOfNegativePositiveElementsInPair {
    public static void main(String[] args){
        int arr[]={1,2,-1,-4,5,-2,1};
        int sumPositive=0;
        int sumNegative=0;
        for (int j : arr) {
            if (j < 0) {
                sumNegative = sumNegative + j;
            } else {
                sumPositive = sumPositive + j;
            }
        }
        System.out.print("Sum is"+"("+sumPositive+","+sumNegative+")");

    }
}
