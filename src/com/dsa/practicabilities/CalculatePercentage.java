package com.dsa.arrays.PracticeProblemsEasyLevel;
// Problem 201 - Codehelp

/*
Your task is to write a program that calculates the percentage of marks obtained by a student.
You will be provided with two integers: totalMarks, denoting the maximum possible marks that can be scored,
and obtainedMarks, representing the marks the student achieved. The program must compute the percentage of obtainedMarks
out of totalMarks and the result should be accurate to two decimal places.
Consider the following scenario:

Input:

totalMarks = 500
obtainedMarks = 400
Calculation:

(400)*100/500=80%
Output:

80.00
The program accurately calculates the percentage of marks obtained as 80.00% when the student scores 400 out of a
total of 500 marks.
*/
public class CalculatePercentage {
    public static void main(String[] args) throws java.lang.Exception
    {
        int a = 400;
        int b = 500;


        double percentage = calculatePercentage(b,a);
        System.out.print(percentage+"");

    }
    public static double calculatePercentage(int totalMarks, int obtainedMarks) {
        // Implement the logic to calculate the percentage
        int percentage= obtainedMarks*100/totalMarks;
        double finalPercentage=(double)percentage;
        return finalPercentage;
    }
}
