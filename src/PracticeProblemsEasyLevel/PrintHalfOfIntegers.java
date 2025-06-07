package PracticeProblemsEasyLevel;

import java.util.Scanner;
/*
Write a function to compute and print half of a given integer. The task is to read an input integer,
whether positive or negative, and print the resulting half. For even integers,
the output should be an exact integer, while for odd integers, it should reflect a precise division.
This requires distinguishing between integer division for even numbers and potentially
returning a decimal value for odd ones.
*/
//Problem 196 - Codehelp

public class PrintHalfOfIntegers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number");
        int value=in.nextInt();
        halfOfIntegers(value);
    }
    public static void halfOfIntegers(int number){
        int value=number%2;
        //  System.out.print("value is "+value+"");
        if(value==0)
        {
            value=number/2;
            System.out.print("Number is "+value+"");
        }
        else
        {
            float newvalue=(float)number/2;
            System.out.print("Number is "+newvalue+"");
        }
    }
}
