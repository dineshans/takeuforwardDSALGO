package com.app.dsalgo.linkedlist.singly.problems;

import com.app.dsalgo.linkedlist.singly.basicoperation.Node;

public class DetectLoop {

    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;

        boolean result = detectCycle(head);
        System.out.println("Loop detected : " + result);

    }

    public static boolean detectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = head.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
