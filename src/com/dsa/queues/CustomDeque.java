package com.dsa.queues;

/**
 * Author: Gaurav Sachdeva
 * Date: 30/08/25
 */
public class CustomDeque {
    public int[] arr;
    public int front;
    public int rear;
    public int size;

    CustomDeque(int capacity){
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = capacity;
    }

    public void pushFront(int value){
        //Overflow
        if(front == 0){
            System.out.print("Overflow");
        }else if(rear == -1 && front == -1){
            front++;
            rear ++;
            arr[rear]=value;
        }else{
            front--;
            arr[front] = value;
        }
    }

    public void pushBack(int value){
        //Overflow
        if(rear == size -1){
            System.out.print("Overflow");
        }
        //Insert in empty queue
        else if(rear == -1 && front == -1){
            front++;
            rear ++;
            arr[rear]=value;
        }
        //Normal insertion
        else{
            rear++;
            arr[rear]=value;
        }
    }

    public void popFront(){
        if(front == -1 && rear == -1){
            System.out.print("Underflow");
        }else if(front == rear){
            front =-1;
            rear = -1;
        }else{
            arr[front]= -1;
            front++;
        }
    }

    public void popBack(){
        if(front == -1 && rear == -1){
            System.out.print("Underflow");
        }
        else if(front == rear){
            front =-1;
            rear = -1;
        }
        else {
            arr[rear]=-1;
            rear--;
        }
    }
    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
       CustomDeque customDeque = new CustomDeque(7);

        customDeque.print();
        customDeque.pushFront(10);
        customDeque.pushBack(20);
        customDeque.pushBack(30);
        customDeque.pushBack(40);
        customDeque.print();

        customDeque.popFront();
        customDeque.print();

        customDeque.popBack();
        customDeque.print();
    }
}