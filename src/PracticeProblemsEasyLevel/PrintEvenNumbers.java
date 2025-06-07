package PracticeProblemsEasyLevel;
/*

In this problem, you need to write a program that outputs all even numbers from 1 to a given integer ( n ).
The input will be a single integer ( n ), and the output should be a single line of even numbers,
each separated by a space. Even numbers are numbers that are divisible by 2 without any remainder.
Your task is to iterate through all numbers from 1 to ( n ) and print those that are even.
*/
public class PrintEvenNumbers {
    public static void main(String[] args){
        int maxNumber=10;
        printEvenNumbers(maxNumber);
    }
    public static void printEvenNumbers(int maxNumber){
        for(int i=1;i<=maxNumber;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}

