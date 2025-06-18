package com.dsa.practicabilities;

/*

In this problem, you need to write a program that determines whether a given integer day, ranging from 1 to 7,
represents a weekday or a weekend. Each integer corresponds to a specific day of the week as follows:

Monday
Tuesday
Wednesday
Thursday
Friday
Saturday
Sunday
Your task is to classify the input day into "Weekday" or "Weekend" using an if-else-if ladder.
If the integer represents any of the days from Monday to Friday, the program should output "Weekday".
If it corresponds to Saturday or Sunday, the output should be "Weekend".
*/

import java.util.Scanner;

public class DetermineDayType {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter your day number");
        int value=in.nextInt();
        if(value == 1){
            System.out.print("Its the weekday");
        }
        else if(value == 2){
            System.out.print("Its the weekday");
        }
        else if(value == 3){
            System.out.print("Its the weekday");
        }
        else if(value == 4){
            System.out.print("Its the weekday");
        }
        else if(value == 5){
            System.out.print("Its the weekday");
        }
        else if(value == 6){
            System.out.print("Its the weekend");
        }
        else if(value == 7){
            System.out.print("Its the weekend");
        }
        else {
            System.out.print("Day not found1");
        }

    }
}
