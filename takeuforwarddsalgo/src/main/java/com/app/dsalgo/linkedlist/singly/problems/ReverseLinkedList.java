package com.app.dsalgo.linkedlist.singly.problems;

import com.app.dsalgo.linkedlist.singly.basicoperation.LinkedList;
import com.app.dsalgo.linkedlist.singly.basicoperation.Node;

import java.util.Stack;

public class ReverseLinkedList {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = LinkedList.convertArrayToLinkList(arr);
        LinkedList.traverseLinkedList(head);

        /*Node reverseHead = reverseLinkedList(head);
        LinkedList.traverseLinkedList(reverseHead);*/

        Node reverseHead = reverseLinkedListUsingRecursion(head);
        LinkedList.traverseLinkedList(reverseHead);
    }

    // Bruteforce
    public static Node reverseLinkedList(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        while(temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            temp.data = stack.pop();
            temp = temp.next;
        }
        return head;
    }

    // using recursive approach
    public static Node reverseLinkedListUsingRecursion(Node head)
    {
        // using recursive approach
        if(head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseLinkedListUsingRecursion(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}
