package com.vova_cons.algorithm.sort;

/**
 * Сортировка слиянием
 * Сложность алгоритма: O(n*log(n))
 * Потребление памяти: O(n)
 * + Очень быстрый алгоритм
 * - Потребление дополнительной памяти, в размере входного массива O(n)
 * - рекурсивный алгоритм.
 * - сложно написать (сам потратил час чтобы понять как писать его в Java)
 */
public class MergeSort implements Sorter {

    @Override
    public void sort(int[] array) {
        int[] buffer = new int[array.length];
        int[] result = sort(array, buffer, 0, array.length-1);
        if (result == buffer)
            System.arraycopy(buffer, 0, array, 0, buffer.length);
    }

    private int[] sort(int[] array, int[] buffer, int left, int right){
        if (left == right) {
            buffer[left] = array[left];
            return buffer;
        }
        int middle = (left + right) /2;

        int[] left_subarray = sort(array, buffer, left, middle);
        int[] right_subarray = sort(array, buffer, middle + 1, right);

        // слияние двух отсортированных половин
        int[] target = left_subarray == array ? buffer : array;
        int current_left = left;
        int current_right = middle + 1;
        for (int i = left; i <= right; i++) {
            if (current_left <= middle && current_right <= right) {
                if (left_subarray[current_left] < right_subarray[current_right]) {
                    target[i] = left_subarray[current_left];
                    current_left++;
                } else {
                    target[i] = right_subarray[current_right];
                    current_right++;
                }
            } else if (current_left <= middle) {
                target[i] = left_subarray[current_left];
                current_left++;
            } else {
                target[i] = right_subarray[current_right];
                current_right++;
            }
        }
        return target;
    }
}
/*
 * Массив сначала разбивается до еденичных элементов, потом в обратном порядке происходит сливание массивов в одного.
 * При этом, сливание идет по правилам:
 * 1. Смотрим только начала обоих подмассивов сливаемых в одну.
 * 2. Берем тот элемент который минимальный (из двух, так как подмассивы уже отсортированы по возрастанию, как и надо).
 * 3. После того как взяли минимальный из двух, смотрим снова на два элемента (левый первый и правый первый элемент).
 * 4. Продолжаем пока есть элементы. Если у одного из подмассивов закончатся элементы, добавляем оставшиеся элементы другого
 * подмассива в конец результирующего массива.
 * Продолжаем пока не произойдет слияние всех массивов в одну.
 */