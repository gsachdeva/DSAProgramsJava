package com.dsa.arrays.PracticeProblemsEasyLevel;
/*
In this problem, you are required to implement a function that converts a given integer representing a month into its
corresponding month name. You will achieve this using a switch-case statement. Your function should accept integers
ranging from 1 to 12, where each integer corresponds to a calendar month. Below is the mapping for your reference:

1 should return "January"
2 should return "February"
3 should return "March"
4 should return "April"
5 should return "May"
6 should return "June"
7 should return "July"
8 should return "August"
9 should return "September"
10 should return "October"
11 should return "November"
12 should return "December"
*/
public class DetermineMonthNameSwitchCase {
    public static void main(String[] args){
        int month=7;
        String monthPrintName=determineMonth(month);
        System.out.print(monthPrintName);
    }
    public static String determineMonth(int month){
        String monthName="";
        switch (month){
            case 1:
                monthName="January";
                break;
            case 2:
                monthName="February";
                break;
            case 3:
                monthName="March";
                break;
            case 4:
                monthName="April";
                break;
            case 5:
                monthName="May";
                break;
            case 6:
                monthName="June";
            case 7:
                monthName="July";
                break;
            case 8:
                monthName="August";
                break;
            case 9:
                monthName="September";
            case 10:
                monthName="October";
                break;
            case 11:
                monthName="November";
                break;
            case 12:
                monthName="December";
                break;
            default:
                monthName="January";


        }

        return monthName;
    }
}
