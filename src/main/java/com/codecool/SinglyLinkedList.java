package com.codecool;


public class SinglyLinkedList<T> {
    private Node head;
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
    }

    public T get(int index) {
        this.checkIndex(index);

        T dataToReturn = (T) this.head.getData();

        if (this.length > 1) {
            Node current = head;
            for(int currentIndex = 0; currentIndex < this.length; currentIndex++) {
                if (currentIndex == index) {
                    dataToReturn = (T) current.getData();
                    break;
                }
                current = current.getNext();
            }
        }
        return dataToReturn;
    }

    public void remove(int index) {
        this.checkIndex(index);

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
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index is negative!");
        }
        if (index == 0) {
            Node nodeToInsert = new Node(data);
            nodeToInsert.setNext(this.head.getNext());
            this.head = nodeToInsert;
            this.length++;
        } else if (index >= this.length) {
            this.add(data);
        } else {
            Node nodeToInsert = new Node(data);
            Node current = head;
            for (int currentIndex = 0; currentIndex < index - 1; currentIndex++) {
                current = current.getNext();
            }
            nodeToInsert.setNext(current.getNext());
            current.setNext(nodeToInsert);
            this.length++;
        }
    }

    public int size() {
        return this.length;
    }

    private void checkIndex(int index) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index is negative!");
        } else if (index > length - 1) {
            throw new ArrayIndexOutOfBoundsException("Index to high!");
        }
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