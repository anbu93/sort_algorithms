package com.vova_cons.algorithm.sort;

public class CoctailSortTest extends SortTest {

    @Override
    protected void sort() {
        new CoctailSort().sort(array);
    }
}