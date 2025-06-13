package com.dsa.problematical;

public class SumofDigits {
    public static void main(String[] args){
        int number=938383834;
        sumOfDigits(number);
    }
    public static void sumOfDigits(int number){
        int sum= 0;
        int temp;
        while(number!=0){
                //will take modulus for number and get reminder
                 temp=number%10;
                 //temp reminder is 4 for above number and we will add in sum
                 sum=sum+temp;
                 //then we need to divide with 10 to check any number left for add or not
                 number=number/10;
        }
        System.out.print(sum);
    }
}
