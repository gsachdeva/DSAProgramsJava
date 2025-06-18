package com.dsa.problematical;

public class ArmstrongOrNarcissisticNumber {
    public static void main(String[] args) {
        int number =9464;
        boolean result= isNarcissistic(number);
        System.out.print(result);
    }
    public static boolean isNarcissistic(int number) {
        int original = number;
        int digits = countDigits(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            int powered = 1;

            // Manual exponentiation
            for (int i = 0; i < digits; i++) {
                powered *= digit;
            }

            sum += powered;
            number /= 10;
        }

        return sum == original;

    }
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}