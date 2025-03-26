package com.app.dsalgo.linkedlist.singly.basicoperation;

public class ConvertArrayToLinkedList {

    public static void main(String[] args) {
        int[] arr = {12,5,8,7};
        Node head = LinkedList.convertArrayToLinkList(arr);
        //System.out.println("Original Head is : " + head.data);

        //print linkedList
        /*System.out.println("Original Linked List is :  ");
        LinkedList.traverseLinkedList(head);*/
        // length of linked list
        //System.out.println("Length of linked list is : " + LinkedList.lengthOfLinkedList(head));
        // Search an element from linked list
        //System.out.println("Search Element in linked List : " + LinkedList.searchInLinkedList(head, 5));
        // delete head from linked list
       /* Node newHead = LinkedList.deleteHead(head);
        LinkedList.traverseLinkedList(newHead);*/

        // delete tail
        /*Node head1 = LinkedList.deleteTail(head);
        System.out.print("tail delete, new linked list is : ");
        LinkedList.traverseLinkedList(head1);*/

        // delete kth element
        /*Node head1 = LinkedList.deleteKthElement(head, 3);
        System.out.println("New linked is after kth element deleted : ");
        LinkedList.traverseLinkedList(head1);*/

        // delete element
        /*Node head1 = LinkedList.deleteElement(head, 8);
        System.out.println("New linked is after kth element deleted : ");
        LinkedList.traverseLinkedList(head1);*/

        // insert nw node at head of linked list
        /*Node newNode = LinkedList.insertAtHead(head, 100);
        System.out.println("Now Head is : " + newNode.data);
        LinkedList.traverseLinkedList(newNode);*/
        /*Node newNode = LinkedList.insertAtTail(head, 100);
        System.out.println("Now Head is : " + newNode.data);
        LinkedList.traverseLinkedList(newNode);*/

        /*int[] arr = {12};
        Node head = LinkedList.convertArrayToLinkList(arr);
        Node newNode = LinkedList.insertAtKthPosition(head, 100, 1);
        LinkedList.traverseLinkedList(newNode);*//*int[] arr = {12};
        Node head = LinkedList.convertArrayToLinkList(arr);
        Node newNode = LinkedList.insertAtKthPosition(head, 100, 1);
        LinkedList.traverseLinkedList(newNode);*/

        Node newNode = LinkedList.insertNodeBeforeValue(head, 8, 109);
        LinkedList.traverseLinkedList(newNode);


    }
}