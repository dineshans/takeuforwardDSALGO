package com.app.dsalgo.stack.queue.impl.array.stack;

public class StackImplMain {

    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        System.out.println("top element is:  " + stack.top());
        System.out.println("pop element:  " + stack.pop());
        stack.push(3);
        stack.push(5);
        stack.push(8);
        stack.push(10);
        stack.push(12);
        System.out.println("top element is:  " + stack.top());
        System.out.println("pop element:  " + stack.pop());
        System.out.println("top element is:  " + stack.top());
    }
}
