package com.dsa.arrayproblems;

public class RotateMatrixLeetCode48 {
        public static void main(String[] args) {
            int[][] arr = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            arr=printRotatedArray(arr);
            for (int[] row : arr) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }

        public static int[][] printRotatedArray(int[][] arr) {
            //First step we need to transpose the elements that means we can
            //convert column to row and row to column
            for(int i=0;i< arr.length;i++){
                for(int j=i;j<arr.length;j++){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
            //Reverse the element
            for(int i=0;i<arr.length;i++){
                int left=0,right=arr.length-1;
                while(left<right){
                    int temp=arr[i][left];
                    arr[i][left]=arr[i][right];
                    arr[i][right]=temp;
                    left++;
                    right--;
                }
            }
            return arr;
        }
    }
