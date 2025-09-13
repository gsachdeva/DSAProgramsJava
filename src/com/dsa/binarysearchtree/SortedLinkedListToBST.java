package com.dsa.binarysearchtree;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

public class SortedLinkedListToBST{

    private ListNode head; // global pointer

    // Main function
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        this.head = head;

        int size = getLength(head);
        return buildBST(0, size - 1);
    }

    // Recursively build BST
    private TreeNode buildBST(int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;

        // 1. Build left subtree
        TreeNode leftChild = buildBST(left, mid - 1);

        // 2. Root node from current head
        TreeNode root = new TreeNode(head.val);
        root.left = leftChild;

        // move head pointer
        head = head.next;

        // 3. Build right subtree
        root.right = buildBST(mid + 1, right);

        return root;
    }

    // Utility to get length of linked list
    private int getLength(ListNode node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    // Helper: Inorder Traversal
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // Create linked list from array
    private ListNode createLinkedList(int[] nums) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int num : nums) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Main testing
    public static void main(String[] args) {
        SortedLinkedListToBST solution = new SortedLinkedListToBST();

        int[] nums = {-10, -3, 0, 5, 9};
        ListNode head = solution.createLinkedList(nums);

        TreeNode root = solution.sortedListToBST(head);

        System.out.println("Inorder Traversal of BST:");
        solution.inorder(root);  // ✅ Output: -10 -3 0 5 9
    }
}
