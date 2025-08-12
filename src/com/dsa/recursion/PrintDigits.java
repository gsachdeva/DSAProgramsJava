package com.dsa.recursion;

/**
 * Author: Gaurav Sachdeva
 * Date: 29/07/25
 */
public class PrintDigits {
    public static void main(String[] args) {
        int number= 423;
        printDigits(number);
    }
    public static void printDigits(int number){
        if(number == 0){
            return;
        }
        int digit = number % 10;
        number = number / 10;
        printDigits(number);
        System.out.print("Number "+digit);

    }
}