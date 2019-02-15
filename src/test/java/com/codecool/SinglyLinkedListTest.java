package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class SinglyLinkedListTest {
    SinglyLinkedList<String> singlyLinkedList;
    String stringOne = "some string";
    String stringTwo = "another string";
    String stringThree = "yet another string";

    @BeforeEach
    public void createSinglyLinkedListInstance() {
        this.singlyLinkedList = new SinglyLinkedList<>();
    }

    @Test
    public void testSizeWhenAddingStrings() {

        this.singlyLinkedList.add(this.stringOne);
        this.singlyLinkedList.add(this.stringTwo);

        assertEquals(2, this.singlyLinkedList.size());
    }

    @Test
    public void testSizeWhenAddingIntegers() {
        SinglyLinkedList<Integer> singlyLinkedIntegerList = new SinglyLinkedList<>();

        singlyLinkedIntegerList.add(34);
        singlyLinkedIntegerList.add(21);
        singlyLinkedIntegerList.add(45);

        assertEquals(3, singlyLinkedIntegerList.size());
    }

    @Test
    public void testGettingAStringFromListWithOneValue() {

        this.singlyLinkedList.add(this.stringOne);

        assertEquals(this.stringOne, this.singlyLinkedList.get(0));
    }

    @Test
    public void testGettingAStringFromListBiggerThanOne() {

        this.singlyLinkedList.add(this.stringOne);
        this.singlyLinkedList.add(this.stringTwo);
        this.singlyLinkedList.add(this.stringThree);

        assertEquals(this.stringThree, singlyLinkedList.get(2));
    }

    @Test
    public void testRemovingItemFromListHead() {

        this.singlyLinkedList.add(this.stringOne);
        this.singlyLinkedList.add(this.stringTwo);
        this.singlyLinkedList.remove(0);

        assertEquals(this.stringTwo, this.singlyLinkedList.get(0));
    }

    @Test
    public void testRemovingItemFromListTail() {

        this.singlyLinkedList.add(this.stringOne);
        this.singlyLinkedList.add(this.stringTwo);
        this.singlyLinkedList.add(this.stringThree);
        this.singlyLinkedList.remove(1);

        assertEquals(this.stringThree, this.singlyLinkedList.get(1));
    }

    @Test
    public void testInsertingDataToHead() {

        this.singlyLinkedList.add(this.stringOne);
        this.singlyLinkedList.add(this.stringTwo);
        this.singlyLinkedList.add(this.stringThree);
        this.singlyLinkedList.insert(this.stringThree, 0);

        assertEquals(this.stringThree, this.singlyLinkedList.get(0));
        assertEquals(4, this.singlyLinkedList.size());
    }

    @Test
    public void testInsertingDataToTail() {

        this.singlyLinkedList.add(this.stringOne);
        this.singlyLinkedList.add(this.stringTwo);
        this.singlyLinkedList.add(this.stringThree);
        this.singlyLinkedList.insert(this.stringOne, 2);

        assertEquals(this.stringOne, this.singlyLinkedList.get(2));
        assertEquals(4, this.singlyLinkedList.size());
    }


}