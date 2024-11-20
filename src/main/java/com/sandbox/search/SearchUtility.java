package com.sandbox.search;

import java.util.*;

public class SearchUtility {

    /**
     * Linear search implementation
     *
     * @param array       array of integers
     * @param targetValue target integer
     * @return index of targetValue in array
     */
    public static int linearSearch(int[] array, int targetValue) {

        int found = -1;
        for (int x = 0; x < array.length; x++) {
            int value = array[x];
            if (value == targetValue) {
                found = x;
                break;
            }
        }
        return found;
    }

    /**
     * Linear search implementation
     *
     * @param objectList list of objects
     * @param target     target object
     * @return target object in objectList
     */
    public static <T> T linearSearch(List<T> objectList, T target) {

        T result = null;
        if (objectList.contains(target)) {
            result = objectList.get(objectList.indexOf(target));
        }
        return result;
    }

    /**
     * Linear search implementation
     *
     * @param array  array of objects
     * @param target target object
     * @param <T>    generic type
     * @return true if target object is found in array
     */
    public static <T extends Comparable<T>> boolean linearSearch(T[] array, T target) {

        boolean found = false;
        for (T t : array) {
            if (t.compareTo(target) == 0) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static int binarySearchRecursive(int[] array, final int targetValue) {
        return binarySearchRecursive(array, 0, array.length - 1, targetValue);
    }

    private static int binarySearchRecursive(int[] array, int minIndex, int maxIndex, int targetValue) {

        if (maxIndex >= minIndex) {

            int mid = minIndex + (maxIndex - minIndex) / 2;

            if (array[mid] == targetValue) {
                return mid;
            } else if (array[mid] < targetValue) {
                return binarySearchRecursive(array, mid + 1, maxIndex, targetValue);
            } else {
                return binarySearchRecursive(array, minIndex, mid - 1, targetValue);
            }
        } else {
            return -1;
        }
    }

    public static int binarySearchIterative(int[] array, int targetValue) {

        int min = 0;
        int max = array.length - 1;

        while (min <= max) {

            int mid = min + (max - min) / 2;

            if (array[mid] == targetValue) {
                return mid;
            } else if (array[mid] < targetValue) {
                // If target is greater, ignore left half of array
                min = mid + 1;
            } else if (array[mid] > targetValue) {
                // if target is smaller, ignore right half of array
                max = mid - 1;
            }
        }
        return -1;
    }

}