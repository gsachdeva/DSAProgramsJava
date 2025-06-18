package com.dsa.practicabilities;
/*
You are tasked with creating a simple
function that will help in generating a
list of numbers starting from 1 up to a
given integer n. The result should be printed in a single line with each number separated by a space.
*/
public class PrintCountingUptoN {
    public static void main(String[] args){
        int number=5;
        printNumberSequence(number);
    }
    public static void printNumberSequence(int number){
        for(int i=1;i<=number;i++){
            System.out.print(i+" ");
        }
    }
}
