package com.vova_cons.algorithm.sort;

public class BubbleSortTest extends SortTest {

    @Override
    protected Sorter getSorter() {
        return new BubbleSort();
    }
}