package com.dsa.problematical;

public class GCDOFNumbers {
    public static void main(String[] args) {
        int a=36;
        int b=108;
        printGCDOfNumbers(a,b);
    }
    public static void printGCDOfNumbers(int a,int b){
        int number=0;
        while(a!=b){
           if(b>a){
               b=b-a;
           }
           if(a>b){
               a=a-b;
           }
           if(a==b){
               number=a;
               break;
           }

        }
        System.out.print("GCD of Numbers "+number);
    }
}