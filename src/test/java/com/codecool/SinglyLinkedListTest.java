package com.codecool;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class SinglyLinkedListTest {

    @Test
    public void testSinglyLinkedListCreation() {
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    }

    @Test
    public void checkIfUserCanAddAString() {
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.add("some string");
        singlyLinkedList.add("another string");
        assertEquals(2, singlyLinkedList.size());
    }

    @Test
    public void checkIfUserCanGetAString() {
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
        String someString = "some string";
        singlyLinkedList.add(someString);
        assertEquals(someString, singlyLinkedList.get(0));
    }

    @Test
    public void checkIfUserCanGetAStringFromListBiggerThanOne() {
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
        String someString = "some string";
        singlyLinkedList.add("something");
        singlyLinkedList.add("something else");
        singlyLinkedList.add(someString);
        assertEquals(someString, singlyLinkedList.get(2));
    }

    @Test
    public void checkRemovingItemFromListHead() {
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.add("something");
        singlyLinkedList.add("something else");
        singlyLinkedList.remove(0);
        assertEquals("something else", singlyLinkedList.get(0));
    }

    @Test
    public void checkRemovingItemFromListTail() {
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.add("something");
        singlyLinkedList.add("something else");
        singlyLinkedList.add("something else else");
        singlyLinkedList.remove(1);
        assertEquals("something else else", singlyLinkedList.get(1));
    }


}