
package com.app.dsalgo.linkedlist.doubly;

public class DoublyLinkedList {

    public static Node convertArrToLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void traverseLinkedList(Node head) {
        System.out.println("linked list is : ");
        while (head != null) {
            System.out.print(" " + head.data);
            head = head.next;
        }
    }

    public static int lengthOf2DLL(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }

    public static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node newTail = tail.back;
        newTail.next = null;
        tail.back = null;
        return head;
    }
}

class Node {
    int data;
    Node next;
    Node back;

    public Node() {
        this.data = 0;
        this.next = null;
        this.back = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }

    public Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }
}
