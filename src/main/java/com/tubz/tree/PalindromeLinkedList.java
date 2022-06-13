package com.tubz.tree;

/**
 * O(n), O(1)
 */
public class PalindromeLinkedList {

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
        isPalindromeList(linkedList);
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


    static Node reverseList(Node head) {
        Node previous = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    static boolean isPalindromeList(LinkedList list) {
        Node slow = list.head;
        Node fast = list.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverseList(slow);
        Node head = list.head;
        while (slow != null) {
            if (slow.data != head.data) return false;
            slow = slow.next;
            head = head.next;
        }
        return true;
    }
}
