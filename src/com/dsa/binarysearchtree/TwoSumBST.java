package com.dsa.binarysearchtree;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Gaurav Sachdeva
 * Date: 11/09/25
 */
public class TwoSumBST {

    public boolean findTarget(TreeNode root, int k) {
        List<Integer> nums = new ArrayList<>();
        inorder(root, nums);

        int left = 0, right = nums.size() - 1;
        while (left < right) {
            int sum = nums.get(left) + nums.get(right);
            if (sum == k) return true;
            if (sum < k) left++;
            else right--;
        }
        return false;
    }

    private void inorder(TreeNode node, List<Integer> nums) {
        if (node == null) return;
        inorder(node.left, nums);
        nums.add(node.val);
        inorder(node.right, nums);
    }


    public static void main(String[] args) {
        TwoSumBST obj = new TwoSumBST();

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        int k = 9;
        System.out.println(obj.findTarget(root, k)); // true (2 + 7)

        k = 28;
        System.out.println(obj.findTarget(root, k)); // false
    }
}