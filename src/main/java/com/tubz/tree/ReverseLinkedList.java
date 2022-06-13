package com.tubz.tree;

/**
 * 0(n), 0(1)
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        Node head = new Node(5);
        Node three = new Node(3);
        Node six = new Node(6);
        Node four = new Node(4);
        Node seven = new Node(7);
        head.next = three;
        three.next = six;
        six.next = four;
        four.next = seven;
        LinkedList linkedList = new LinkedList(head);
        System.out.println(linkedList);
        System.out.println("----------");
        reverseList(linkedList);
        System.out.println(linkedList);
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return Integer.valueOf(this.data).toString() + " -> " + (next != null ? next : "null");
        }
    }

    static class LinkedList {
        Node head;

        LinkedList() {
            this.head = null;
        }

        LinkedList(Node head) {
            this.head = head;
        }

        @Override
        public String toString() {
            return head.toString();
        }
    }

    static Node reverseNode(Node node) {
        if(node == null || node.next == null) {
            return node;
        }
        Node reversed = reverseNode(node.next);
        node.next.next = node;
        node.next =  null;
        return reversed;
    }

    public static void reverseList(LinkedList list) {
        // your code here
        list.head = reverseNode(list.head);
    }
}
