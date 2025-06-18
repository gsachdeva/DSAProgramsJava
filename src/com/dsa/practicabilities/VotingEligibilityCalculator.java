package com.dsa.practicabilities;

import java.util.Scanner;

/*
In this problem, your task is to write a program that checks if a person is eligible to vote based on their age.
A person qualifies to vote if they are at least 18 years old. The program should accept an integer input which will
represent the age of an individual and output a message stating their voting eligibility. Specifically, the program
should output "Eligible to vote" if the individual is 18 years old or older. Otherwise, it should output "Not eligible
to vote" for those younger than 18.
*/
//PRogram 201 - Codehelp
public class VotingEligibilityCalculator {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the age:");
        int value=in.nextInt();
        String printValue= votingEligiblity(value);
        System.out.print(printValue+"");

    }
    public static String votingEligiblity(int num){
        if(num>18){
            return "User is eligible for voting";
        }else {
            return "User is not eligible for voting";
        }
    }
}
