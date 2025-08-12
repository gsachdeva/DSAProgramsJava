package com.dsa.strings;

/**
 * Author: Gaurav Sachdeva
 * Date: 25/07/25
 */
public class SunOfStrings {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";

        String result = addStrings(num1,num2);
        System.out.print("Result "+result);
    }
    public static String addStrings(String num1, String num2){
        StringBuilder result = new StringBuilder();

        int i = num1.length()-1;
        int j = num2.length()-1;

        int carry =0;

        while(i>=0 || j>=0 ||carry!=0){
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;

            result.append(sum % 10);
            i--;
            j--;
        }
        return result.reverse().toString();
    }
}