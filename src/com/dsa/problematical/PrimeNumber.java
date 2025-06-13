package com.dsa.problematical;

public class PrimeNumber {
    public static void main(String[] args){
        int num=29;
        boolean isPrime=checkNumberIsPrimeNumberOrNot(num);
        System.out.print(isPrime);
    }
    public static boolean checkNumberIsPrimeNumberOrNot(int num) {
        int end = num - 1;
        if (num == 1) {
            System.out.print("Not a prime number");
        }
        if (num == 2) {
            System.out.print("prime number");
        }
        boolean isPrime = true;
        for (int i = 2; i < end; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
