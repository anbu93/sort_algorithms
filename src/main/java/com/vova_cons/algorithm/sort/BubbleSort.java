package com.vova_cons.algorithm.sort;

public class BubbleSort {
    public void sort(int[] array) {
        boolean isSwapped;
        int tmp;
        for(int i = 0; i < array.length-1; ++i){
            isSwapped = false;
            for(int j = 0; j < array.length-1; ++j)
                if (array[j] > array[j+1]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    isSwapped = true;
                }
            if (!isSwapped)
                break;
        }
    }
}
