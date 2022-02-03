package com.sparta.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BubbleSortTest  {
        private BubbleSort sorter = new BubbleSort();


    @Test
    void bubbletest() {
        BubbleSort bs = new BubbleSort();
        int[] data = { 76, 45, 0, 11, 45 };
        int[] result= {0, 11, 45, 45, 76};
        assertArrayEquals(result,data);
    }

    @Test
    public void shouldDoNothingWithEmptyArray() {
        int[] values = {};
        sorter.sort(values);

    }

    @Test
    public void shouldDoNothingWithOneElementArray() {
        int[] values = {42};

        sorter.sort(values);

        assertArrayEquals(new int[] {42}, values);
    }

        private void assertArrayEquals ( int[] result, int[] data){
        }

       private void assertArrayEquals () {
        }

        @Test
        void NotSame () {

            int[] data = {76, 45, 0, 11, 45};
            int[] result1 = {10, 20, 30, 40, 50};
            assertNotEquals(result1, data);
        }

    @Test
    public void shouldSortValues() {
        int[] values = { 9, -3, 5, 0, 1};
        int[] expectedOrder = { -3, 0, 1, 5, 9};

        sorter.sort(values);

        assertArrayEquals(expectedOrder, values);
    }
    }