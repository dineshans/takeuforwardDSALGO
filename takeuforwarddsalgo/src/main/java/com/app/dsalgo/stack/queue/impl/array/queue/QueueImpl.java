package com.app.dsalgo.stack.queue.impl.array.queue;

public class QueueImpl {

    int maxSize;
    int currentSize;
    int queue[];
    int start;
    int end;

    public QueueImpl() {
        currentSize = 0;
        maxSize = 10;
        start = -1;
        end = -1;
        queue = new int[maxSize];
    }

    public void push(int x) {
        if(currentSize == maxSize) {
            System.out.println("Queue is full");
            System.exit(1);
        }
        if (end == -1) {
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % maxSize;
        }
            queue[end] = x;
            currentSize += 1;
    }

    public int pop() {
        if (start == -1) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        int popped = queue[start];
        if (currentSize == 1) {
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % maxSize;
        }
        currentSize--;
        return popped;
        }

        public int top() {
            if (start == -1) {
                System.out.println("Queue is Empty");
                System.exit(1);
            }
            return queue[start];
        }

        public int size() {
            return currentSize;
        }
}
