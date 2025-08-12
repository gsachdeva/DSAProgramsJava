package com.dsa.strings;

import java.util.Scanner;

/**
 * Author: Gaurav Sachdeva
 * Date: 16/07/25
 */
public class CreatePrintCharArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = in.nextInt();

        char[] charArray=new char[size];

        System.out.println("Enter the "+size+" Characters:");
        for(int i =0;i<size;i++){
            System.out.print("Characters:"+ (i+1));
            charArray[i] = in.next().charAt(0);
        }
        System.out.print("You entered: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }

        in.close();
    }
}