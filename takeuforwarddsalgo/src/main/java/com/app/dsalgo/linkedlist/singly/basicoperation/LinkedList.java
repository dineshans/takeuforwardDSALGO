package com.app.dsalgo.linkedlist.singly.basicoperation;

public class LinkedList {

    public static Node convertArrayToLinkList(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void traverseLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static int lengthOfLinkedList(Node head) {
        Node temp = head;
        int counter = 0;
        while (temp != null) {
            temp = temp.next;
            counter++;
        }
        return counter;
    }

    public static int searchInLinkedList(Node head, int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }

    public static Node deleteHead(Node head) {
        head = head.next;
        return head;
    }

    public static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // delete kth element from linked list (Based on the index)
    // same way also can delete tail or follow deleteTail(Node head) method
    public static Node deleteKthElement(Node head, int k) {
        // if linked list is empty
        if (head == null) {
            return head;
        }
        // if linked list have only 1 element
        if (k == 1) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node previous = null;
        int counter = 0;
        while (temp != null) {
            counter++;
            if (counter == k) {
                previous.next = previous.next.next;
            }
            previous = temp;
            temp = temp.next;
        }
        return head;
    }

    // delete element from linked list (Based on the data)
    public static Node deleteElement(Node head, int data) {
        if(head == null) {
            return head;
        }
        if (head.data == data) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node previous = null;
        while(temp != null) {
            if (temp.data == data) {
                previous.next = previous.next.next;
            }
            previous = temp;
            temp = temp.next;
        }
        return head;
    }

    // insert node at starting of linked list
    public static Node insertAtHead(Node head, int value) {
        /*Node temp = new Node(value);
        temp.next = head;
        return temp;*/

        // or below code also work
        return new Node(value, head);
    }

    public static Node insertAtTail(Node head, int value) {
        if (head == null) {
            return new Node(value);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(value);
        temp.next = newNode;
        return head;
    }

    public static Node insertAtKthPosition(Node head, int value, int k) {
        // if linked list is empty
        if(head == null) {
            if(k == 1) {
                return new Node(value);
            }
        }
        // if linked list having e element
        if(k ==1) {
            return new Node(value, head);
        }
        Node temp = head;
        int counter = 0;
        while (temp != null) {
            counter++;
            if (counter == k-1) {
                Node newNode = new Node(value);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }

        return head;
    }

    public static Node insertNodeBeforeValue(Node head, int dataToCheck, int dataToInsert) {
        if (head == null) {
            return null;
        }
        if (head.data == dataToCheck) {
            return new Node(dataToInsert, head);
        }
        Node temp = head;
        while(temp.next != null) {
            if (temp.next.data == dataToCheck) {
                Node newNode = new Node(dataToInsert);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

}
