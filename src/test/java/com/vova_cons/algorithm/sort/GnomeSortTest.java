package com.vova_cons.algorithm.sort;

public class GnomeSortTest extends SortTest{

    @Override
    protected Sorter getSorter() {
        return new GnomeSort();
    }
}