package com.dsa.practicabilities;
/*
You are tasked with writing a program that
calculates the average of three integers.
Given three integers a, b, and c, your program should compute their average with an integer division,
which means that the division should discard any decimal points.
*/
public class AverageThreeNumbers {
    public static void main(String[] args) throws java.lang.Exception
    {
        int a = 59;
        int b = 95;
        int c = 45;

        averageOfThreeIntegers(a, b, c);

    }
    public static void averageOfThreeIntegers(int a, int b, int c) {
        int sumOfValues = a + b + c;
        int divideValue = sumOfValues / 3;
        System.out.print(divideValue + "");
    }
}
