package com.shpp.p2p.cs.vshevtsova.assignment9;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class ArrayListTest {

    @org.junit.jupiter.api.Test
    void testAdd() {
        MyArrayList arr = new MyArrayList();
        int oldSize = arr.get_size();
        arr.add_elem("1");
        int newSize = arr.get_size();
//        System.out.println(oldSize + " , " + newSize);
        assertNotEquals(oldSize, newSize);
        arr.fill_arr("here", 100);
        oldSize = arr.get_size();
        assertNotEquals(oldSize, newSize);
        assertEquals(oldSize, 100);

        arr.add_elem("i");
        assertEquals(101, arr.get_size());
        assertEquals("i", arr.get_elem(100));

    }

    @org.junit.jupiter.api.Test
    void testFillArr() throws Exception {
        MyArrayList arr = new MyArrayList();

        assertEquals(0, arr.get_size());
        arr.fill_arr("2", 150);
        assertEquals(150, arr.get_size());
        assertEquals("2", arr.get_elem(0));
        assertEquals("2", arr.get_elem(149));

    }

    @org.junit.jupiter.api.Test
    void testConstructor() {
        MyArrayList arr = new MyArrayList();

        assertEquals(0, arr.get_size());
        assertEquals(null, arr.get_elements());
        assertInstanceOf(MyArrayList.class, arr);

    }

    @org.junit.jupiter.api.Test
    void testGetElements(){
        MyArrayList arr = new MyArrayList();

        assertEquals(null, arr.get_elements());
        arr.fill_arr(null, 100);
        Object[] test = new Object[100];
        assertArrayEquals(test, arr.get_elements());
        assertEquals(arr.get_elem(4), arr.get_elements()[4]);
    }
}