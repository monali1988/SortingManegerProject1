package com.sparta.sort;

import Controller.SortManager;
import Model.BSTSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BubbleSortTest {
    private SortManager controller;
    private String bubble = "b";

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
    @DisplayName("This checks if an array is sorted via the Bubble Sort method")
    public void testBubbleSort() {
        int[] inputArray = new int[10000];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (int) Math.floor((Math.random() * 100) + 1);
        }
        int[] inputArrayCopy = copyArray(inputArray);
        int[] result = controller.sortArray(bubble, inputArray);
        String expected = Arrays.toString(result);
        String actual = Arrays.toString(inputArrayCopy);
        Assertions.assertEquals(expected, actual);
    }
}