package com.app.dsalgo.stack.queue.impl.array.stack;

public class StackImpl {

    int top = -1;
    int arr[] = new int[10];

    public void push(int element) {
        if(arr.length > 10) {
            System.out.println("Stack size is full");
        } else {
            top = top+1;
            arr[top] = element;
        }
    }

    public int top() {

        if(top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public int pop() {
        int ele = -1;
        if (top == -1) {
            System.out.print("Stack is empty ");
            return ele;
        } else {
            ele = arr[top];
            top = top-1;
        }
        return ele;
    }
}
