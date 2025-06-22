package com.dsa.arrayproblems;

public class FindMissingNumber {
        public static void main(String[] args) {
            int[] arr = {1,2,3,4};
            int n = arr.length;

            int expectedSum = (n * (n + 1)) / 2;
            int actualSum = 0;

            for (int num : arr) {
                actualSum += num;
            }
            if(expectedSum==actualSum){
                System.out.println("Missing Number: " + 0); //Output:0
            }else{
                int missing = expectedSum - actualSum;
                System.out.println("Missing Number: " + missing);  // Output: 3
            }
        }
}