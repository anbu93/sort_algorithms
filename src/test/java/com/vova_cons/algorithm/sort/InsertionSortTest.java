package com.vova_cons.algorithm.sort;

public class InsertionSortTest extends SortTest{

    @Override
    protected Sorter getSorter() {
        return new InsertionSort();
    }
}