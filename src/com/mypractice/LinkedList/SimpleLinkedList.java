package com.mypractice.LinkedList;

import org.w3c.dom.Node;

public class SimpleLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public SimpleLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;

        Node prevLast = last.prev;
        prevLast.next = newNode;
        newNode.prev = prevLast;

        newNode.next = last;
        last.prev = newNode;
    }

    private static class Node {
        private Node prev;
        private String value;
        private Node next;
    }

    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        list.printAll();
    }
}
