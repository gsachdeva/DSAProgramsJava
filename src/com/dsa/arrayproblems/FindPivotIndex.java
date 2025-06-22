package com.dsa.arrayproblems;


/*   The pivot index is defined as the index where the sum of all the numbers strictly
to the left of the index is equal to the sum of all the numbers strictly to the right of the index.
If no such index exists, return -1. If there are multiple pivot indices, you should return the left-most pivot index.*/
public class FindPivotIndex {
    public static void main(String[] args) {

                int[] nums = {1,-1,0};

                int totalSum = 0;
                for (int num : nums)
                    totalSum += num;

                int leftSum = 0;

                for (int i = 0; i < nums.length; i++) {
                    int rightSum = totalSum - leftSum - nums[i];
                    if (leftSum == rightSum) {
                        System.out.println("Pivot Index is " + i);
                        return;
                    }
                    leftSum += nums[i];
                }

                System.out.println("Pivot Index is -1");
            }
        }
