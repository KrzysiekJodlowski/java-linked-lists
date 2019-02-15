package com.codecool;

public class DoublyNode<T> {

    private DoublyNode previousNode;
    private DoublyNode nextNode;
    private T data;

    public DoublyNode(T data) {
        this.data = data;
    }

    public DoublyNode<T> getPrevious() {
        return this.previousNode;
    }

    public void setPrevious(DoublyNode<T> previousNode) {
        this.previousNode = previousNode;
    }

    public DoublyNode<T> getNext() {
        return this.nextNode;
    }

    public void setNext(DoublyNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getData() {
        return this.data;
    }
}
