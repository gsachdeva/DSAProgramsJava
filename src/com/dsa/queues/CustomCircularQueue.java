package com.dsa.queues;

/**
 * Author: Gaurav Sachdeva
 * Date: 30/08/25
 */
public class CustomCircularQueue {

    public int[] arr;
    public int front;
    public int rear;
    public int size;

    CustomCircularQueue(int capacity){
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = capacity;
    }

    public void push(int value){
    // 4 case
    // overflow, q empty, circular,normal case
        if((front ==0 && rear == size -1) || (rear == front - 1))
        {
            System.out.print("Overflow");
        }
        else if(front == -1 && rear == -1){
            front ++;
            rear ++;
            arr[rear]= value;
        }
        else if(rear == size-1 && front !=0){
            rear =0;
            arr[rear]=value;
        }else{
            rear++;
            arr[rear]=value;
        }
    }
    public void pop(){
        // 4 case
        // underflow , q empty, circular,normal case

        if(front == -1 && rear == -1){
            System.out.print("Underflow");
        }else if(front == rear){
            front = -1;
            rear = -1;
            arr[front]= -1;
        }else if(front == size - 1){
            front = 0;
        }else{
            front++;
            arr[front] = -1;
        }
    }
    public int getFront(){
        if(front == -1){
            System.out.print("No Element");
            return -1;
        }else{
            return arr[front];
        }
    }

    public int getSize(){
        //empty case
        // rear >=front
        // rear < front
        if(front == 1 && rear == -1){
            return 0;
        }
        else if(rear >=front){
            return rear - front +1;
        }else{
            return size - rear + front +1;
        }
    }
    public boolean checkEmpty(){
        if(front == 1 && rear == -1){
           return true;
        }else{
            return false;
        }
    }
    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CustomCircularQueue cq = new CustomCircularQueue(7);
        cq.push(1);
        cq.push(2);
        cq.push(3);
        cq.push(4);
        cq.push(5);
        cq.push(6);
        cq.push(7);
        cq.print();

        cq.pop();
        cq.pop();

        cq.print();
    }
}