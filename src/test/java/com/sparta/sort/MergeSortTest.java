package com.sparta.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeSortTest {
    private MergeSort sorter = new MergeSort();


    @Test
    public void shouldDoNothingWithEmptyArray() {
        int[] values = {};

        sorter.sort(values);

        assertEquals(values.length, 0);
    }

    @Test
    public void shouldDoNothingWithOneElementArray() {
        int[] values = {42};

        sorter.sort(values);

        assertArrayEquals(new int[] {42}, values);
    }


}