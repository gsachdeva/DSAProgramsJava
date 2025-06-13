package com.dsa.problematical;

public class ReverseNumber {
    public static void main(String[] args){
        int num=12345;
        reverseNumber(num);
       // reverseNumberByUsingStringBuild(num);
    }
    public static void reverseNumberByUsingStringBuild(int num){
        int temp;
        StringBuilder digit= new StringBuilder();
        while(num!=0){
            temp=num%10;
            digit.append(temp);
            num=num/10;

        }
        System.out.print(digit);
    }
    public static void reverseNumber(int num){
        int rev=0;
        int rem=0;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.print(rev);
    }
}
