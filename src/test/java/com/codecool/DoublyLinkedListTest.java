package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class DoublyLinkedListTest {
    DoublyLinkedList<String> doublyLinkedList;
    String stringOne = "some string";
    String stringTwo = "another string";
    String stringThree = "yet another string";

    @BeforeEach
    public void createSinglyLinkedListInstance() {
        this.doublyLinkedList = new DoublyLinkedList<>();
    }

    /*
     *   Tests for adding items
     */

    @Test
    public void testSizeWhenAddingStrings() {

        this.doublyLinkedList.add(this.stringOne);
        this.doublyLinkedList.add(this.stringTwo);

        assertEquals(2, this.doublyLinkedList.size());
    }

    @Test
    public void testSizeWhenAddingIntegers() {
       DoublyLinkedList<Integer> doublyLinkedIntegerList = new DoublyLinkedList<>();

        doublyLinkedIntegerList.add(34);
        doublyLinkedIntegerList.add(21);
        doublyLinkedIntegerList.add(45);

        assertEquals(3, doublyLinkedIntegerList.size());
    }

    /*
     *   Tests for getting items
     */

    @Test
    public void testGettingAStringFromListWithOneValue() {

        this.doublyLinkedList.add(this.stringOne);

        assertEquals(this.stringOne, this.doublyLinkedList.get(0));
    }

    @Test
    public void testGettingAStringFromListBiggerThanOne() {

        this.doublyLinkedList.add(this.stringOne);
        this.doublyLinkedList.add(this.stringTwo);
        this.doublyLinkedList.add(this.stringThree);

        assertEquals(this.stringThree, doublyLinkedList.get(2));
    }

    /*
     *   Tests for removing items
     */

    @Test
    public void testRemovingItemFromListHead() {

        this.doublyLinkedList.add(this.stringOne);
        this.doublyLinkedList.add(this.stringTwo);
        this.doublyLinkedList.remove(0);

        assertEquals(this.stringTwo, this.doublyLinkedList.get(0));
    }

    @Test
    public void testRemovingItemFromListTail() {

        this.doublyLinkedList.add(this.stringOne);
        this.doublyLinkedList.add(this.stringTwo);
        this.doublyLinkedList.add(this.stringThree);
        this.doublyLinkedList.remove(1);

        assertEquals(this.stringThree, this.doublyLinkedList.get(1));
    }

    /*
     *   Tests for inserting items
     */

    @Test
    public void testInsertingDataToHead() {

        this.doublyLinkedList.add(this.stringOne);
        this.doublyLinkedList.add(this.stringTwo);
        this.doublyLinkedList.add(this.stringThree);
        this.doublyLinkedList.insert(this.stringThree, 0);

        assertEquals(this.stringThree, this.doublyLinkedList.get(0));
        assertEquals(4, this.doublyLinkedList.size());
    }

    @Test
    public void testInsertingDataToTail() {

        this.doublyLinkedList.add(this.stringOne);
        this.doublyLinkedList.add(this.stringTwo);
        this.doublyLinkedList.add(this.stringThree);
        this.doublyLinkedList.insert(this.stringOne, 2);
        this.doublyLinkedList.insert(this.stringOne, 6);

        assertEquals(this.stringOne, this.doublyLinkedList.get(2));
        assertEquals(5, this.doublyLinkedList.size());
    }

    /*
     *   Tests for throwing ArrayOutOfBoundsException
     *   in case of accesing negative or too high index
     */

    @Test
    public void testIfThrowsArrayOutOfBoundsExceptionWhenGettingAStringFromNegativeIndex() {

        this.doublyLinkedList.add(this.stringOne);

        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> doublyLinkedList.get(-1));
    }

    @Test
    public void testIfThrowsArrayOutOfBoundsExceptionWhenRemovingFromNegativeIndex() {

        this.doublyLinkedList.add(this.stringOne);

        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> doublyLinkedList.remove(-1));
    }

    @Test
    public void testIfThrowsArrayOutOfBoundsExceptionWhenRemovingFromTooHighIndex() {

        this.doublyLinkedList.add(this.stringOne);

        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> doublyLinkedList.remove(1));
    }

    @Test
    public void testIfThrowsArrayOutOfBoundsExceptionWhenGettingAStringFromTooHighIndex() {

        this.doublyLinkedList.add(this.stringOne);

        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> doublyLinkedList.get(1));
    }

    @Test
    public void testIfThrowsArrayOutOfBoundsExceptionWhenInsertingToNegativeIndex() {

        this.doublyLinkedList.add(this.stringOne);

        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> doublyLinkedList.insert(this.stringTwo,-1));
    }


}