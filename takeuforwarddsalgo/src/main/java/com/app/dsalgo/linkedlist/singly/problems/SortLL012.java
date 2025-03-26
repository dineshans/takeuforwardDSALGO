package com.app.dsalgo.linkedlist.singly.problems;

import com.app.dsalgo.linkedlist.singly.basicoperation.LinkedList;
import com.app.dsalgo.linkedlist.singly.basicoperation.Node;

public class SortLL012 {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(0);
        head.next.next.next.next.next = new Node(2);
        Node resultNode = sortList(head);
        LinkedList.traverseLinkedList(resultNode);

    }

    public static Node sortList(Node head) {

        Node zeroDummyNode = new Node(-1);
        Node oneDummyNode = new Node(-1);
        Node twoDummyNode = new Node(-1);
        Node zeroTemp = zeroDummyNode;
        Node oneTemp = oneDummyNode;
        Node twoTemp = twoDummyNode;
        Node temp = head;

        while(temp != null) {
            if(temp.data == 0) {
                zeroTemp.next = temp;
                zeroTemp = temp;
            } else if(temp.data == 1) {
                oneTemp.next = temp;
                oneTemp = temp;
            } else {
                twoTemp.next = temp;
                twoTemp = temp;
            }
            temp = temp.next;
        }
        zeroTemp.next = oneTemp;
        oneTemp.next = twoTemp;
        return zeroDummyNode.next;
    }
}
