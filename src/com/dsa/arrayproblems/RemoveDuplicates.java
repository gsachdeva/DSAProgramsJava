package com.dsa.arrayproblems;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,4,4,5};
        int duplicates=removeDuplicates(nums);
        System.out.println("Duplicates "+duplicates);
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];  // Copy unique element forward
            }
        }

        return i + 1; // New length
    }
}