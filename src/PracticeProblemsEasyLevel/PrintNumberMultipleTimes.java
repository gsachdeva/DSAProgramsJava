package PracticeProblemsEasyLevel;
/*
You are tasked with writing a simple program that prints a given number multiple times on a single line, with each
occurrence separated by a space. The program will receive two integers as input:

num: The number to be printed.
n: The number of times num should appear.
Your task is to print num, exactly n times, in a single line separated by spaces.

Example 1:

Input:

Input: num = 5, n = 3
Output:

5 5 5
Explanation:The number 5 is printed 3 times.
*/

import java.util.Scanner;

public class PrintNumberMultipleTimes {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number: ");
        int number=in.nextInt();
        System.out.print("Enter number of occurances: ");
        int occurrences=in.nextInt();

        for(int i=0;i<occurrences;i++){
            System.out.print(number+" ");
        }
    }
}
