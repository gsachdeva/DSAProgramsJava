package com.dsa.problematical;

public class LCMOfNumbers {
    public static void main(String[] args) {
        int a=24;
        int b=32;
        printLCMOfTwoNumber(a,b);
    }
    public static void printLCMOfTwoNumber(int a,int b){
        int GCD= GCDOfNumbers(a,b);
        int LCM= (a*b)/GCD;
        System.out.print("LCM is "+LCM);
    }
    public static int GCDOfNumbers(int a,int b){
        int number=0;
        while(a!=b){
            if(a>b){
                a=a-b;
            }else
            {
              b=b-a;
            }

            if(a==b){
                number=a;
                break;
            }

        }
        return number;
    }
}