package com.dsa.starpatterns;

public class RightHalfDiamondStarPattern {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

/* Output :- if(i=4)
 *
 **
 ***
 ****
 ***
 **
 *
*/
