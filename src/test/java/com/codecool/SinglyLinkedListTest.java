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

    /*
     *   Tests for adding items
     */

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

    /*
     *   Tests for getting items
     */

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

    /*
     *   Tests for removing items
     */

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

    /*
     *   Tests for inserting items
     */

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
        this.singlyLinkedList.insert(this.stringOne, 6);

        assertEquals(this.stringOne, this.singlyLinkedList.get(2));
        assertEquals(5, this.singlyLinkedList.size());
    }

    /*
     *   Tests for throwing ArrayOutOfBoundsException
     *   in case of accesing negative or too high index
     */

    @Test
    public void testIfThrowsArrayOutOfBoundsExceptionWhenGettingAStringFromNegativeIndex() {

        this.singlyLinkedList.add(this.stringOne);

        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> singlyLinkedList.get(-1));
    }

    @Test
    public void testIfThrowsArrayOutOfBoundsExceptionWhenRemovingFromNegativeIndex() {

        this.singlyLinkedList.add(this.stringOne);

        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> singlyLinkedList.remove(-1));
    }

    @Test
    public void testIfThrowsArrayOutOfBoundsExceptionWhenRemovingFromTooHighIndex() {

        this.singlyLinkedList.add(this.stringOne);

        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> singlyLinkedList.remove(1));
    }

    @Test
    public void testIfThrowsArrayOutOfBoundsExceptionWhenGettingAStringFromTooHighIndex() {

        this.singlyLinkedList.add(this.stringOne);

        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> singlyLinkedList.get(1));
    }

    @Test
    public void testIfThrowsArrayOutOfBoundsExceptionWhenInsertingToNegativeIndex() {

        this.singlyLinkedList.add(this.stringOne);

        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> singlyLinkedList.insert(this.stringTwo,-1));
    }


}