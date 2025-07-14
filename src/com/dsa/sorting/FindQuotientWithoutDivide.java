package com.dsa.sorting;

/**
 * Author: Gaurav Sachdeva
 * Date: 09/07/25
 */
public class FindQuotientWithoutDivide {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;

        int result = divide(dividend, divisor);
        System.out.println("Quotient is " + result);
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) return Integer.MAX_VALUE;
        if (dividend == 0) return 0;

        // Handle signs
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long start = 0, end = a, result = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * b == a) {
                result = mid;
                break;
            } else if (mid * b < a) {
                result = mid;  // Store last valid mid
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        result = isNegative ? -result : result;

        // Handle overflow
        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int) result;
    }
}
