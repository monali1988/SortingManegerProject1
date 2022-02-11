package com.sparta.sort;

import Controller.SortManager;
import Model.BSTFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeSortTest {
    private SortManager controller;
    private String bubble = "m";
    @BeforeEach
    public void setUp() {
        controller = new SortManager();
    }

    public int[] copyArray(int[] originalArray) {
        int[] inputArrayCopy = originalArray.clone();
        Arrays.sort(inputArrayCopy);
        return inputArrayCopy;
    }

    @Test
    @DisplayName("This checks if an array is sorted via the Merge Sort method")
    public void testMergeSort(){
        int[] inputArray = new int[40];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (int)Math.floor((Math.random()*100)+1);
        }
        int[] inputArrayCopy = copyArray(inputArray);
        int[] result = controller.sortArray(bubble, inputArray);
        String expected = Arrays.toString(result);
        String actual = Arrays.toString(inputArrayCopy);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    @DisplayName("This checks if a merge sort works with an empty array")
    public void testMergeSortEmptyArray(){
        int[] inputArray = new int[]{};
        int[] inputArrayCopy = copyArray(inputArray);
        int[] result = controller.sortArray(bubble, inputArray);
        String expected = Arrays.toString(result);
        String actual = Arrays.toString(inputArrayCopy);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    @DisplayName("This checks if a merge sort works with having the same in value for all elements in the array")
    public void testMergeSortSameValue(){
        int[] inputArray = new int[]{0, 0, 0, 0, 0};
        int[] inputArrayCopy = copyArray(inputArray);
        int[] result = controller.sortArray("m", inputArray);
        String expected = Arrays.toString(result);
        String actual = Arrays.toString(inputArrayCopy);
        Assertions.assertEquals(expected, actual);

    }


}