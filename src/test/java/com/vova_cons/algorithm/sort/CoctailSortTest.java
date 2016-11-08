package com.vova_cons.algorithm.sort;

public class CoctailSortTest extends SortTest {
    @Override
    protected Sorter getSorter() {
        return new CoctailSort();
    }
}