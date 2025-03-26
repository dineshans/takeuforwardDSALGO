package com.app.dsalgo.linkedlist.doubly;

public class DoublyLinkedListProblems {

    public static void main(String[] args) {
        int[] arr = {12,5,8,7};
        Node head = DoublyLinkedList.convertArrToLinkedList(arr);
        DoublyLinkedList.traverseLinkedList(head);
        System.out.println();
        System.out.println("Head is : " + head.data);
        /*System.out.println("back is : " + head.next.back.data);
        System.out.println("next is : " + head.next.data);
        System.out.println("back - back is : " + head.next.next.next.back.data);*/
        /*int lengthOf2DLL = DoublyLinkedList.lengthOf2DLL(head);
        System.out.println("Length of 2D LL is: " + lengthOf2DLL);*/

        // delete head
        /*Node newLinkedListAfterHeadDeleted = DoublyLinkedList.deleteHead(head);
        DoublyLinkedList.traverseLinkedList(newLinkedListAfterHeadDeleted);*/

        // delete tail
        Node newLinkedListAfterHeadDeleted = DoublyLinkedList.deleteTail(head);
        DoublyLinkedList.traverseLinkedList(newLinkedListAfterHeadDeleted);

    }
}
