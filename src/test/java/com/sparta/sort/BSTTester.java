package com.sparta.sort;

import Controller.SortManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

public class BSTTester {
    private SortManager controller;
    private String bubble = "t";
    @BeforeEach
    public void setUp() {
        controller = new SortManager();
    }

    public int[] copyArray(int[] originalArray) {
        int[] inputArrayCopy = originalArray.clone();
        Arrays.sort(inputArrayCopy);
        return inputArrayCopy;
    }

    public int[] createArrayUnique(int length) {
        HashSet<Integer> inputSet = new HashSet<>();
        int size = 0;
        int randomNumber;

        while (size < length){
            randomNumber = (int)Math.floor((Math.random()*100)+1);
            if (!inputSet.contains(randomNumber)){
                inputSet.add(randomNumber);
                size++;
            }
        }
        int[] arrayInput = new int[inputSet.size()];
        int i = 0;
        for (int number : inputSet) {
            arrayInput[i++] = number;
        }
        return arrayInput;
    }

    public int[] createArrayUnique(int[] arr) {
        HashSet<Integer> inputSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            inputSet.add(arr[i]);
        }

        int[] arrayInput = new int[inputSet.size()];
        int i = 0;
        for (int number : inputSet) {
            arrayInput[i++] = number;
        }
        return arrayInput;
    }

    @Test
    @DisplayName("This checks if an array is sorted after creating a Binary Tree from a unordered array of elements")
    public void testBSTSort(){
        int[] arrayInput = createArrayUnique(100);
        int[] inputArrayCopy = copyArray(arrayInput);
        int[] result = controller.sortArray(bubble, arrayInput);
        String expected = Arrays.toString(result);
        String actual = Arrays.toString(inputArrayCopy);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    @DisplayName("This checks if a BST works with an empty array")
    public void testBSTEmptyArray(){
        int[] inputArray = new int[]{};
        int[] inputArrayCopy = copyArray(inputArray);
        int[] result = controller.sortArray(bubble, inputArray);
        String expected = Arrays.toString(result);
        String actual = Arrays.toString(inputArrayCopy);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("This checks if a BST works with having the same in value for all elements in the array")
    public void tesBSTSameValue(){
        int[] inputArray = createArrayUnique(new int[]{0, 0, 0, 0, 0});
        int[] inputArrayCopy = copyArray(inputArray);
        int[] result = controller.sortArray(bubble, inputArray);
        String expected = Arrays.toString(result);
        String actual = Arrays.toString(inputArrayCopy);
        Assertions.assertEquals(expected, actual);
    }


}
