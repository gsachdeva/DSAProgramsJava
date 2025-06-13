package com.dsa.arrays.starpatterns;

public class HollowRightAngleTrianglePattern {
    public static void main(String[] args){
        int n=5;
        printHollowTriangle(n);
    }
    public static void printHollowTriangle(int n){
        for(int i=1;i<=n;i++){
            if(i==1 || i==2 || i==n){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j=1;j<=i-2;j++){
                    System.out.print(" ");
                }
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
/*
Output:-
 *
 **
 *  *
 *   *
 *****
*/