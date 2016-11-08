package com.vova_cons.algorithm.sort;

/**
 * Сортировка пузырьком
 * Сложность алгоритма: O(n^2)
 * Потребление памяти: O(1-2)
 * + Прост в реализации
 * + Не потребляет памяти
 * - Самый едленный алгоритм сортировки
 */
public class BubbleSort implements Sorter {

    @Override
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
/**
 * Шаги работы:
 * 1. Пройтись n-1 раз по массиву.
 * 2. При проходе по массиву смотреть две соседние элементы,
 * если они лежат в неправильном порядке, поменять их местами.
 * 3. Если не было ни одной перемены при одном проходе массива, то считать массив отсортированным
 */
