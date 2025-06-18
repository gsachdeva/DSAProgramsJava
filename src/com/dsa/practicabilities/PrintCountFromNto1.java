package com.dsa.practicabilities;
/*
Given an integer n, write a program to print all numbers from n down to 1 in
descending order. Each number should be separated by a space, and all the numbers
should be printed on a single line.
*/
public class PrintCountFromNto1 {
        public static void main(String[] args){
            int number=5;
            printNumberSequence(number);
        }
        public static void printNumberSequence(int number){
            for(int i=number;i>0;i--){
                System.out.print(i+" ");
            }
        }
}
