package com.vova_cons.algorithm.sort;

import com.vova_cons.algorithm.sort.common.Timer;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public abstract class SortTest {
    int[] array;
    Random random = new Random(System.currentTimeMillis());
    boolean isLogging = false;
    Timer timer = new Timer();

    protected abstract Sorter getSorter();

    private void createRandomArray(int n){
        array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = random.nextInt(n);
    }

    boolean isSortedToUpper(){
        for(int i = 0; i < array.length-1; ++i)
            if (array[i] > array[i+1]) return false;
        return true;
    }

    String getArrayString(){
        StringBuilder sb = new StringBuilder();
        for (int value : array)
            sb.append(value).append(" ");
        return sb.toString();
    }

    private void testRandomArrayForSize(int size){
        createRandomArray(size);
        timer.start();
        getSorter().sort(array);
        timer.stop();
        Assert.assertTrue(getArrayString(), isSortedToUpper());
        if (isLogging)
            System.out.println("Time: " + timer.getElapsed());
    }

    @Test
    public void sortTenSizeRandomArray() throws Exception {
        testRandomArrayForSize(10);
    }

    @Test
    public void sortOneHundredSizeRandomArray() throws Exception {
        testRandomArrayForSize(100);
    }

    @Test
    public void sortOneThousandSizeRandomArray() throws Exception {
        testRandomArrayForSize(1000);
    }

    @Test
    public void sortFiveThousandSizeRandomArray() throws Exception {
        testRandomArrayForSize(5000);
    }

    @Test
    public void sortTenThousandSizeRandomArray() throws Exception {
        testRandomArrayForSize(10000);
    }
}
