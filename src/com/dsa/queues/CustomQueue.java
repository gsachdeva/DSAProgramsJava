package com.dsa.queues;

/**
 * Author: Gaurav Sachdeva
 * Date: 30/08/25
 */
public class CustomQueue {
    public int[] arr;
    public int front;
    public int rear;
    public int size;

    CustomQueue(int capacity){
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = capacity;
    }

    void push(int value){
        //Overflow
        if(rear == size -1){
            System.out.print("Overflow");
            return;
        }
        //Insert at first element
        if(front == -1 && rear == -1){
            front++;
            rear++;
            arr[rear] = value;
        }
        //Normal Insertion
        else{
            rear ++;
            arr[rear] = value;
        }
    }
    void pop(){
        //Overflow
        if(front == -1 && rear == -1){
            System.out.print("Underflow");
            return;
        }
        //Insert at first element
        if(front == rear){
            front=-1;
            rear=-1;
            arr[front] = -1;
        }
        //Normal Insertion
        else{
           arr[front]= -1;
           front ++;
        }
    }
    int getSize(){
        if(front == -1 && rear == -1){
            return 0;
        }else{
            return rear - front + 1;
        }
    }

    boolean checkEmpty(){
        if(front == -1 && rear == -1){
            return true;
        }else{
            return false;
        }
    }
    int getFrontElement(){
        if(front == -1){
            System.out.println("There is not element");
            return -1;
        }else{
            int value = arr[front];
            return value;
        }
    }
    int getRearElement(){
        if(rear == -1){
            System.out.println("There is not element");
            return -1;
        }else{
            int value = arr[rear];
            return value;
        }
    }

    public static void main(String[] args) {
        CustomQueue q = new CustomQueue(5);
        q.push(5);
        q.push(15);
        q.push(25);
        q.getSize();
        System.out.println("Size of Queue "+q.getSize());
        System.out.println("Front Element "+q.getFrontElement());
        System.out.println("Rear Element "+q.getRearElement());


        System.out.print("Check empty "+q.checkEmpty());

    }
}