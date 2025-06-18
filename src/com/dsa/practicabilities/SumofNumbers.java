package com.dsa.practicabilities;
/*
In this problem, you are required to compute the sum of a specified number of integer inputs.
First, you will provide an integer n, which will determine the number of subsequent integer inputs.
Following that, you will enter n integers. Your task is to calculate the total sum of these n integers and return it.
This is a basic problem typically used to get comfortable with handling inputs and simple iteration.
*/
public class SumofNumbers {
    public static void main(String[] args){
        int n=4;
        printSumOfNumbers(n);
    }
    public static void printSumOfNumbers(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.print("Sum of number upto "+n+" are: "+sum);
    }
}
