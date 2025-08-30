package com.dsa.stacks;

/**
 * Author: Gaurav Sachdeva
 * Date: 21/08/25
 */
public class TwoStacks
{
    private int capacity;
    private int top1;
    private int top2;
    private int arr[];

    TwoStacks(int size) {
        capacity = size;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    public void push1(int val){
        if(top2 - top1 == 1){
            System.out.println("Stack overflow");
        }else{
            arr[++top1]= val;
        }
    }
    public void push2(int val){
        if(top2 - top1 == 1){
            System.out.println("Stack overflow");
        }else{
            arr[--top2]= val;
        }
    }

    public int pop1() {
        if (top1 >= 0) {
            int val = arr[top1];
            arr[top1--] = 0; // clear popped slot
            return val;
        }
        System.out.println("Stack Underflow in Stack1");
        return -1;
    }
    public int pop2() {
        if (top2 < capacity) {
            int val = arr[top2];
            arr[top2++] = 0; // clear popped slot
            return val;
        }
        System.out.println("Stack Underflow in Stack2");
        return -1;
    }
    public void printArray() {
        System.out.print("Array: ");
        for (int i = 0; i < capacity; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        TwoStacks stack = new TwoStacks(10);
        stack.push1(10);
        stack.push1(20);
        stack.push1(30);
        stack.push1(40);
        stack.push1(50);

        stack.push2(100);
        stack.push2(90);
        stack.push2(80);
        stack.push2(70);
        stack.push2(60);

        stack.pop1();
        stack.pop2();

        stack.printArray();
    }
}