package com.dsa.arrayproblems;

public class AddNumbersByArrays {
    public static void main(String[] args) {
       int[] nums1={2,4,3};
       int[] nums2={5,6,4};
        int firstNumber=0;
        int secondNumber=0;
        int numSize=nums1.length-1;
        int numSize2=nums2.length-1;
       for(int i=numSize;i>=0;i--){
           if(i==numSize){
               firstNumber=nums1[i];
           }
           else{
               firstNumber=firstNumber*10+nums1[i];
           }
       }
        for(int i=numSize2;i>=0;i--){
            if(i==numSize2){
                secondNumber=nums2[i];
            }
            else{
                secondNumber=secondNumber*10+nums2[i];
            }
        }
        System.out.println("Number is "+ secondNumber);

        int sum=firstNumber+secondNumber;
        System.out.println("Sum is "+ sum);
        int[] arr=new int[3];
        int arrCount=0;
        while(sum!=0){
            int number=sum%10;
            arr[arrCount]=number;
            sum=sum/10;
            System.out.println("Array is "+ number);
        }
    }
}