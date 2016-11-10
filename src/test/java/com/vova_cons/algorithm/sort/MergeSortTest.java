package com.vova_cons.algorithm.sort;

public class MergeSortTest extends SortTest {

    @Override
    protected Sorter getSorter() {
        return new MergeSort();
    }
}