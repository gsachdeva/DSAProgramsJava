package com.dsa.stacks;

/**
 * Author: Gaurav Sachdeva
 * Date: 20/08/25
 */
public class MainStack {
    private int arr[];
    private int top;
    private int capacity;

    MainStack(int size){
        arr= new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int val){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = val;
    }
    public int getTopElement(){
        if(top == -1){
            System.out.print("Empty Stack");
        }else{
            return arr[top];
        }
        return -1;
    }
    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }
    // Peek
    public int peek() {
        if (!isEmpty())
            return arr[top];
        return -1;
    }

    public boolean isEmpty(){
       return top == -1;
    }
    public boolean isFull(){
        return top == capacity -1;
    }
    public int getSize(){
        return top + 1;
    }
    public static void main(String[] args){
        MainStack mainStack = new MainStack(100);
        mainStack.push(10);
        mainStack.push(20);
        mainStack.push(30);
        mainStack.push(40);

        mainStack.pop();
        System.out.println("Size of Stack "+ mainStack.getSize());
        System.out.println("Top Element on Stack "+ mainStack.getTopElement());

        mainStack.pop();
        System.out.println("Size of Stack "+ mainStack.getSize());
        System.out.println("Top Element on Stack "+ mainStack.getTopElement());

        mainStack.pop();
        System.out.println("Size of Stack "+ mainStack.getSize());
        System.out.println("Top Element on Stack "+ mainStack.getTopElement());

        mainStack.pop();
        System.out.println("Size of Stack "+ mainStack.getSize());
        System.out.println("Top Element on Stack "+ mainStack.getTopElement());
    }
}