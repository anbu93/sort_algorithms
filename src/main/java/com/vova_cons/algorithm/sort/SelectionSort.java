package com.vova_cons.algorithm.sort;

/**
 * Сортировка выбором
 * 
 */
public class SelectionSort implements Sorter {

    @Override
    public void sort(int[] array){
        int min, tmp;
        for(int i = 0; i < array.length-1; ++i){
            min = i;
            for(int j = i+1; j < array.length; ++j)
                if (array[j] < array[min])
                    min = j;
            if (min != i) {
                tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }
        }
    }
}
