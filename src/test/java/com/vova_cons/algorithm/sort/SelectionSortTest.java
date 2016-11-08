package com.vova_cons.algorithm.sort;

public class SelectionSortTest extends SortTest{

    @Override
    protected void sort() {
        new SelectionSort().sort(array);
    }
}