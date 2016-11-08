package com.vova_cons.algorithm.sort;

import org.junit.Before;

public class BubbleSortTest extends SortTest {

    @Before
    public void setUp(){
        super.isLogging = false;
    }

    @Override
    protected void sort() {
        BubbleSort bubbleSorter = new BubbleSort();
        bubbleSorter.sort(array);
    }
}