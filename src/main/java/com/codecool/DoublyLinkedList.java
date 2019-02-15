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

        if (head == null) {
            this.head = new DoublyNode(data);
        } else {
            DoublyNode current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            DoublyNode newNode = new DoublyNode(data);
            newNode.setPrevious(current);
            current.setNext(new DoublyNode(data));
        }
        this.length++;
    }

    public T get(int index) {

        this.checkIndex(index, true);
        T dataToReturn = (T) this.head.getData();

        if (this.length > this.ONE_INDEX) {
            DoublyNode current = this.head;
            for(int currentIndex = this.ZERO; currentIndex < index; currentIndex++) {
                current = current.getNext();
            }
            dataToReturn = (T) current.getData();
        }
        return dataToReturn;
    }

    public void remove(int index) {
        this.checkIndex(index, true);

        if (index == this.ZERO) {
            if (this.length == this.ONE_INDEX) {
                this.head = null;
            } else {
                this.head = head.getNext();
                this.head.setPrevious(null);
            }
        } else {
            DoublyNode current = head;
            for(int currentIndex = this.ZERO; currentIndex < index - this.ONE_INDEX; currentIndex++) {
                current = current.getNext();
            }

            DoublyNode nodeToRemove = current.getNext();
            if (current.getNext().getNext() != null) {
                DoublyNode newNextNode = current.getNext().getNext();
                newNextNode.setPrevious(current);
                current.setNext(newNextNode);
            }
            nodeToRemove = null;
        }
        this.length--;

    }

    public void insert(T data, int index) {
        this.checkIndex(index, false);

        if (index == this.ZERO) {
            DoublyNode nodeToInsert = new DoublyNode(data);
            nodeToInsert.setNext(this.head.getNext());
            this.head = nodeToInsert;
            this.length++;
        } else if (index >= this.length) {
            this.add(data);
        } else {
            DoublyNode nodeToInsert = new DoublyNode(data);
            DoublyNode current = head;
            for (int currentIndex = this.ZERO; currentIndex < index - this.ONE_INDEX; currentIndex++) {
                current = current.getNext();
            }
            nodeToInsert.setPrevious(current);
            nodeToInsert.setNext(current.getNext());
            current.setNext(nodeToInsert);
            this.length++;
        }
    }

    public int size() {
        return this.length;
    }

    private void checkIndex(int index, boolean checkIfEndIsExceeded) {
        if (index < this.ZERO) {
            throw new ArrayIndexOutOfBoundsException("Index is negative!");
        }
        if (checkIfEndIsExceeded) {
            if (index > this.length - this.ONE_INDEX) {
                throw new ArrayIndexOutOfBoundsException("Index to high!");
            }
        }
    }
}