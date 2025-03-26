package com.app.dsalgo.linkedlist.singly.problems;

import com.app.dsalgo.linkedlist.singly.basicoperation.*;

public class FindMiddleOfLinkedList {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = LinkedList.convertArrayToLinkList(arr);
        LinkedList.traverseLinkedList(head);
        /*Node middleNode = findMiddle(head);
        System.out.println("Middle node is : " + middleNode.data);*/

        Node middleNode = findMiddleNodeOptimal(head);
        System.out.println("Middle node is : " + middleNode.data);
    }

    // 2-pass solution
    public static Node findMiddle(Node head)
    {
        if(head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        int length = findLengthOfLinkedList(temp);
        int findNum = (length/2)+1;
        temp = head;
        int counter = 0;
        while(temp != null) {
            counter++;
            if(counter == findNum) {
                return temp;
            }
            temp = temp.next;
        }
        return head;
    }

    public static int findLengthOfLinkedList(Node temp) {
        int counter = 0;
        while(temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    // using tortoise Hare algorithm
    public static Node findMiddleNodeOptimal(Node head) {
        Node slow = head;
        Node fast = head;
        // condition for even and odd length both
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
