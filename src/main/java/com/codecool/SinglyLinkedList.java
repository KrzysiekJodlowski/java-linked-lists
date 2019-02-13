package com.codecool;


public class SinglyLinkedList<T> {
    private Node head;
    private Node last;
    private int length;

    public SinglyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public void add(T data) {
        if (head == null) {
            this.head = new Node(data);
            this.length++;
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Node(data));
        this.length++;
        last = current;
    }

    public T get(int index) {
        if (this.length == 1) {
            return (T) this.head.getData();
        }
        Node current = head;
        for(int currentIndex = 0; currentIndex < this.length; currentIndex++) {
            if (currentIndex == index) {
                return (T) current.getData();
            }
            current = current.getNext();
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void remove(int index) {
        if (index == 0) {
            if (this.length == 1) {
                this.head = null;
            } else {
                this.head = head.getNext();
            }
        } else {
            Node current = head;
            for(int currentIndex = 0; currentIndex < index - 1; currentIndex++) {
                current = current.getNext();
            }
            Node nodeToRemove = current.getNext();
            if (current.getNext().getNext() != null) {
                current.setNext(current.getNext().getNext());
            }
            nodeToRemove = null;
        }
        this.length--;
    }

    public void insert(T data, int index) {

    }

    public int size() {
        return this.length;
    }
}

class Node<T> {
    private T data;
    private Node pointer;

    public Node(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return this.pointer;
    }

    public void setNext(Node<T> pointer) {
        this.pointer = pointer;
    }

    public T getData() {
        return this.data;
    }
}