package com.sandbox.sort;

import java.util.Arrays;

public class SortTest {

    public static void main(String[] args) {

        Integer[] arr = {5, 3, 1, 2, 4};
        SortingUtility.selectionSort(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }
}