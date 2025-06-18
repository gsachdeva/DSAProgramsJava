package com.dsa.problematical;

public class CountDivisors {
    public static void main(String[] args) {
        int n=24;
        printDivisors(n);
    }
    public static void printDivisors(int n){
        int count=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.print("Count is "+count);
    }
}