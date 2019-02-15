package com.codecool;


public class DoublyLinkedList<T> {

    private DoublyNode head;
    private int length;
    private final int ZERO = 0;
    private final int ONE_INDEX = 1;

    public DoublyLinkedList() {
        this.head = null;
        this.length = 0;
    }


    public void add(T data) {

    }

    public T get(int index) {
        return (T) this.head.getData();
    }

    public void remove(int index) {

    }

    public void insert(T data, int index) {

    }

    public int size() {
        return this.length;
    }
}

class DoublyNode<T> {
    private T data;
    private Node previousNode;
    private Node nextNode;

    public DoublyNode(T data) {
        this.data = data;
    }

    public Node<T> getPrevious() {
        return this.previousNode;
    }

    public void setPrevious(Node<T> pointer) {
        this.previousNode = pointer;
    }

    public Node<T> getNext() {
        return this.nextNode;
    }

    public void setNext(Node<T> pointer) {
        this.nextNode = pointer;
    }

    public T getData() {
        return this.data;
    }
}