package com.dsa.arrays.PracticeProblemsEasyLevel;

import java.util.Scanner;

//Problem 202 - Codehelp
//Write a simple program to determine the sign of an integer input. The task is to check if a given integer num is
// positive, negative, or zero, and produce the appropriate string output accordingly.
public class CheckNumberSign {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number:");
        int value=in.nextInt();
        String printValue= checkNumberSign(value);
        System.out.print(printValue+"");

    }
    public static String checkNumberSign(int num){
        if(num>0){
            return "Number is positive";
        }else if(num<0){
            return "Number is negative";
        }else{
            return "Number is zero";
        }

    }


}
