package com.dsa.starpatterns;

public class FullPyramidPattern {
   public static void main(String[] args){
       fullPyramidPatternWay1(5);
   }
   public static void fullPyramidPatternWay1(int n){
       //Logic - Each row is composed of some spaces and stars
       //spaces -> (n-row)spaces
       //stars -> (2*row-1)stars
       //outer loop
       for(int row=1;row<=n;row++){
           //inner loop -> logic given below

           //spaces
           for(int col=1;col<=n-row;col++){
               System.out.print(" ");
           }
           for(int col=1;col<=2*row-1;col++){
               System.out.print("*");
           }
           System.out.println();

       }
   }
   public static void fullPyramidPatternWay2(int n){
       // For Full pyramid, we need to count rows first.The pattern which we are going to print have 5 rows
       // The outer loop will be started for the iteration of no. of rows in increasing order because top row have less stars
       // and bottom rows have more
       for(int i=1;i<=n;i++){
           // The inner loop first implement the spaces in the pattern.Firstly, it will check in first row where n=1 and first iteration
           // i=1 then n-i = 5. So, there will not be space printed.
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           // The 2nd inner loop will print stars. In first row, suppose i=1 then 2*i-1 = 1. Then,1 starts will be printed on top.
           //In next line, i=2,then 3 starts will be printed
           for(int k=1;k<=2*i-1;k++){
               System.out.print("*");
           }
           //Pattern will print to next line
           System.out.println();
       }
   }
}
/* Output will be:-

       *
      ***
     *****
    *******
   *********

*/