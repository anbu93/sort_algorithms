package com.vova_cons.algorithm.sort;

public class SelectionSortTest extends SortTest{

    @Override
    protected Sorter getSorter() {
        return new SelectionSort();
    }
}