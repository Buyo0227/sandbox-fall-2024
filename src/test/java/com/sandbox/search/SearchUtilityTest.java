package com.sandbox.search;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchUtilityTest {

    @Test
    void testLinearSearchIntArray() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(2, SearchUtility.linearSearch(array, 3));
        assertEquals(-1, SearchUtility.linearSearch(array, 6));
        assertEquals(0, SearchUtility.linearSearch(array, 1));
        assertEquals(4, SearchUtility.linearSearch(array, 5));
    }

    @Test
    void testLinearSearchObjectList() {
        List<String> list = Arrays.asList("a", "b", "c", "d");
        assertEquals("c", SearchUtility.linearSearch(list, "c"));
        assertNull(SearchUtility.linearSearch(list, "e"));
        assertEquals("a", SearchUtility.linearSearch(list, "a"));
        assertEquals("d", SearchUtility.linearSearch(list, "d"));
    }

    @Test
    void testLinearSearchObjectArray() {
        Integer[] array = {1, 2, 3, 4, 5};
        assertTrue(SearchUtility.linearSearch(array, 3));
        assertFalse(SearchUtility.linearSearch(array, 6));
        assertTrue(SearchUtility.linearSearch(array, 1));
        assertTrue(SearchUtility.linearSearch(array, 5));
    }

    @Test
    void testBinarySearchRecursive() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(2, SearchUtility.binarySearchRecursive(array, 3));
        assertEquals(-1, SearchUtility.binarySearchRecursive(array, 6));
        assertEquals(0, SearchUtility.binarySearchRecursive(array, 1));
        assertEquals(4, SearchUtility.binarySearchRecursive(array, 5));
    }

    @Test
    void testBinarySearchIterative() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(2, SearchUtility.binarySearchIterative(array, 3));
        assertEquals(-1, SearchUtility.binarySearchIterative(array, 6));
        assertEquals(0, SearchUtility.binarySearchIterative(array, 1));
        assertEquals(4, SearchUtility.binarySearchIterative(array, 5));
    }

    @Test
    void testEmptyArray() {
        int[] emptyArray = {};
        assertEquals(-1, SearchUtility.linearSearch(emptyArray, 1));
        assertEquals(-1, SearchUtility.binarySearchRecursive(emptyArray, 1));
        assertEquals(-1, SearchUtility.binarySearchIterative(emptyArray, 1));
    }

    @Test
    void testSingleElementArray() {
        int[] singleElementArray = {1};
        assertEquals(0, SearchUtility.linearSearch(singleElementArray, 1));
        assertEquals(-1, SearchUtility.linearSearch(singleElementArray, 2));
        assertEquals(0, SearchUtility.binarySearchRecursive(singleElementArray, 1));
        assertEquals(-1, SearchUtility.binarySearchRecursive(singleElementArray, 2));
        assertEquals(0, SearchUtility.binarySearchIterative(singleElementArray, 1));
        assertEquals(-1, SearchUtility.binarySearchIterative(singleElementArray, 2));
    }
}