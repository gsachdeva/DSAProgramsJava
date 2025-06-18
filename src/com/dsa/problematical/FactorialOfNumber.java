package com.dsa.problematical;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int n=6;
        printFactorialOfNumber(n);
    }
    public static void printFactorialOfNumber(int n){
        if(n<0){
            return;
        }
        int factorialVal=1;
        for(int i=1;i<=n;i++){
            factorialVal=factorialVal*i;
        }
        System.out.print("Factorial of number "+ n + " is "+ factorialVal);
    }
}